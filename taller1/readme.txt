Luego de seguir las instrucciones provistas para el taller 1 se tiene que correr los siguientes comandos para poder conseguir los resultados:

```bash
javac -g src/ReachingDefinitionsExample.java -d bin/
javac -g src/LiveVariablesExample.java -d bin/
java -classpath .:soot-3.3.0-jar-with-dependencies.jar:. soot.Main -cp bin:$JRE -f J LiveVariablesExample -print-tags -p jap.lvtagger enabled:true -p jb use-original-names:true -p jb.cp off -keep-line-number
java -classpath .:soot-3.3.0-jar-with-dependencies.jar:. soot.Main -cp bin:$JRE -f J ReachingDefinitionsExample -print-tags -p jap.rdtagger enabled:true -p jb use-original-names:true -p jb.cp off -keep-line-number
```