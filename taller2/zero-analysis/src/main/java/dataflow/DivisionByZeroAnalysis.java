package dataflow;

import java.util.HashMap;

import dataflow.abs.ZeroAbstractSet;
import dataflow.abs.ZeroAbstractValue;
import soot.Local;
import soot.Unit;
import soot.jimple.ReturnStmt;
import soot.jimple.DefinitionStmt;
import soot.tagkit.StringTag;
import soot.toolkits.graph.UnitGraph;
import soot.toolkits.scalar.ForwardFlowAnalysis;

/**
 * Division by zero analysis
 */
public class DivisionByZeroAnalysis extends ForwardFlowAnalysis<Unit, ZeroAbstractSet> {

  private HashMap<Unit, Boolean> possibleDivisionByZero = new HashMap<>();

  public DivisionByZeroAnalysis(UnitGraph graph) {
    super(graph);

    doAnalysis();
  }

  protected void flowThrough(ZeroAbstractSet in, Unit unit, ZeroAbstractSet out) {
    // Local all values from input
    out.clear();
    out.putAll(in);

    if (unit instanceof DefinitionStmt) {
      DefinitionStmt definition = (DefinitionStmt) unit;

      // Assume just local variables
      Local variable = (Local) definition.getLeftOp();
      ZeroValueVisitor visitor = new ZeroValueVisitor(in);
      ZeroAbstractValue resolvedValue = visitor.visit(definition.getRightOp()).done();

      if (visitor.getPossibleDivisionByZero()) {
        possibleDivisionByZero.put(unit, true);
        // En caso de posible división por cero mostramos el estado al comienzo
        // de cada nodo
        unit.addTag(new StringTag(in.toString()));
      }

      // Set in flowed values
      out.setValue(variable.getName(), resolvedValue);
    }

    // Mostramos el estado en cada return
    if (unit instanceof ReturnStmt)
      unit.addTag(new StringTag(in.toString()));
  }

  protected ZeroAbstractSet newInitialFlow() {
    return new ZeroAbstractSet();
  }

  protected void merge(ZeroAbstractSet input1, ZeroAbstractSet input2, ZeroAbstractSet output) {
    // Como union modifica el set hacemos una copia por si las dudas
    ZeroAbstractSet tmp = new ZeroAbstractSet();
    copy(input1, tmp);
    tmp.union(input2);
    copy(tmp, output);
  }

  protected void copy(ZeroAbstractSet source, ZeroAbstractSet dest) {
    dest.clear();
    dest.putAll(source);
  }

  public boolean unitIsOffending(Unit unit) {
    return possibleDivisionByZero.getOrDefault(unit, false);
  }

}
