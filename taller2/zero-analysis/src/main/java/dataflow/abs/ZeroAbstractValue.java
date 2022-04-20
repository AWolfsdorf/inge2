package dataflow.abs;

public enum ZeroAbstractValue {

  BOTTOM("bottom"), NOT_ZERO("not-zero"), ZERO("zero"), MAYBE_ZERO("maybe-zero");

  private String name;

  @Override
  public String toString() {
    return this.name;
  }

  ZeroAbstractValue(String name) {
    this.name = name;
  }

  // Función auxiliar para obtener el abstract value a
  // partir de una constante
  public static ZeroAbstractValue fromInt(int value) {
    if (value == 0) 
      return ZERO;
    if (value != 0)
      return NOT_ZERO;
    return BOTTOM;
  }

  // Implementamos las tablas de valores de los ejercicios 1-7 
  // usando switches por practicidad
  public ZeroAbstractValue add(ZeroAbstractValue another) {
    if (this == BOTTOM || another == BOTTOM) 
      return BOTTOM;
    switch (another) {
      case ZERO: return this;
      case NOT_ZERO:
        switch (this) {
          case ZERO: return NOT_ZERO;
          case NOT_ZERO: 
          case MAYBE_ZERO: return MAYBE_ZERO;
        }
      case MAYBE_ZERO: return MAYBE_ZERO;
    }
    return BOTTOM;
  }

  public ZeroAbstractValue divideBy(ZeroAbstractValue another) {
    if (this == BOTTOM || another == BOTTOM) 
      return BOTTOM;
    switch (another) {
      case ZERO: return BOTTOM;
      case NOT_ZERO:
        switch (this) {
          case ZERO: return ZERO;
          case NOT_ZERO:
          case MAYBE_ZERO: return MAYBE_ZERO;
        }
      case MAYBE_ZERO: return MAYBE_ZERO;
    }
    return BOTTOM;
  }

  public ZeroAbstractValue multiplyBy(ZeroAbstractValue another) {
    if (this == BOTTOM || another == BOTTOM) 
      return BOTTOM;
    switch (another) {
      case ZERO: return ZERO;
      case NOT_ZERO: return this;
      case MAYBE_ZERO:
        switch (this) {
          case ZERO: return ZERO;
          case NOT_ZERO:
          case MAYBE_ZERO: return MAYBE_ZERO;
        }
    }
    return BOTTOM;
  }

  public ZeroAbstractValue substract(ZeroAbstractValue another) {
    if (this == BOTTOM || another == BOTTOM) 
      return BOTTOM;
    switch (another) {
      case ZERO: return this;
      case NOT_ZERO:
        switch (this) {
          case ZERO: return NOT_ZERO;
          case NOT_ZERO: 
          case MAYBE_ZERO: return MAYBE_ZERO;
        }
      case MAYBE_ZERO: return MAYBE_ZERO;
    }
    return BOTTOM;
  }

  public ZeroAbstractValue merge(ZeroAbstractValue another) {
    // Si alguno es top, devuelvo top
    if (this == MAYBE_ZERO || another == MAYBE_ZERO) 
      return MAYBE_ZERO;

    // Si son iguales, devuelvo cualquiera de los 2
    if (this == another) return another;

    // Si alguno es bottom, devuelvo el que no lo es
    if (this == BOTTOM) return another;
    if (another == BOTTOM) return this;

    // Sino top (NOT_ZERO y ZERO)
    return MAYBE_ZERO;
  }
}
