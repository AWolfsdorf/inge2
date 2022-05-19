## Taller 4 Modelado de sistemas concurrentes


1) 

```
ENCUENTRO = (hola -> conversar -> adios -> STOP).

TRABAJO = (llego -> trabajo -> parto -> TRABAJO).

MOVIMIENTO = (adelante -> GIRO),
GIRO = (izquierda -> STOP | derecha -> MOVIMIENTO).

MONEDA = (tira -> ceca -> MONEDA | tira -> cara -> MONEDA).

CUATROTICKS = (tick -> tick -> tick -> tick -> STOP).

DOBLE = (in[x:1..3] -> D[x]),
D[x:1..3] = (out[x*2] -> DOBLE).
```

4)

Con suposicion de que al pedir nivel hay tiempo para responder antes de que llegue un nuevo pulso de agua.
```
INICIAL = (agua[x:0..10] -> NIVEL[x]),
NIVEL[x:0..10] = (when(x<=2) nivel -> BAJO[x]
                 |when(x>=8) nivel -> ALTO[x]
                 |when(2<x & x<8) nivel -> MEDIO[x]
                 |agua[y:0..10] -> NIVEL[y]
                 ),
BAJO[x:0..2] = (bajo -> NIVEL[x]),
MEDIO[x:3..7] = (medio -> NIVEL[x]),
ALTO[x:8..10] = (alto -> NIVEL[x]).
```

Sin ninguna supocicion:
```
INICIAL = (agua[x:0..10] -> NIVEL[x]),
NIVEL[x:0..10] = (when(x<=2) nivel -> BAJO[x]
                 |when(x>=8) nivel -> ALTO[x]
                 |when(2<x & x<8) nivel -> MEDIO[x]
                 |agua[y:0..10] -> NIVEL[y]
                 ),
BAJO[x:0..10] = (bajo -> NIVEL[x] | agua[y:0..10] -> BAJO[y]),
MEDIO[x:0..10] = (medio -> NIVEL[x] | agua[y:0..10] -> MEDIO[y]),
ALTO[x:0..10] = (alto -> NIVEL[x] | agua[y:0..10] -> ALTO[y]).
```