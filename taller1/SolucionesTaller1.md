# Soluciones Taller 1:


## Leccion 1:

Responder que definiciones son usadas en las siguientes sentencias:


### a) a = c - a; 

El programa soot nos responde lo siguiente:
```
/*c#3 has reaching def: c#3 = 1*/
/*c#3 has reaching def: c#3 = c#3 + 2*/
/*a has reaching def: a = 8*/
/*a has reaching def: a = 5*/
```

Esto lo podemos interpretar de la siguiente manera:
la variable `c` (nombrada `c#3` por soot) tiene 2 posibles definiciones, `c#3 = 1` si es que en el programa no se entra en el while y `c#3 = c#3 + 2` si entro al menos una vez en el while. 

Por otro lado la variable `a` tiene otras dos posibles definiciones. Una es `a = 8` en el caso de que haya  dos argumentos o menos. La otra es `a = 5` en el caso contrario.

### b) return a;

Aca la variable `a` tiene una unica definicion posible que es `a = c - a` ya que si o si pasa por esa linea.


## Leccion 2

Completamos la tablita:

|Sentencia  | a | b | c | d | r |
|-          |-  |-  |-  |-  |-  |
|d = a - b; |SI |SI |SI |SI |NO |
|r = c;     |NO |NO |NO |NO |SI |
|r = d;     |NO |NO |NO |NO |SI |
|return r;  |NO |NO |NO |NO |NO |