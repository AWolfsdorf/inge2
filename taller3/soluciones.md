# Taller 3

## Ejercicio 1

Obtuvimos los siguientes resultados:

- a) sat
- b) sat
- c) sat

Para el punto c nos devolvió que es verdadero en el modelo `x = false` y `y =
true`.


## Ejercicio 2

Obtuvimos los siguientes resultados:

- a) sat con `x = 12` e `y = 0`
- b) sat con `x = 1` e `y = 12`
- c) sat con `x = 1` e `y = 64`


## Ejercicio 3

El output de Z3 que obtuvimos fue el siguiente:

```smt
sat
(model 
  (define-fun a2 () Real
    4.0)
  (define-fun a1 () Real
    0.0)
  (define-fun a3 () Real
    1.0)
)
```

La interpretación es que una forma de que la especificación sea satisfacible es
que ocurra que `a1 = 0`, `a2 = 4` e `a3 = 1`. Cómo en este caso las expresiones
tienen una única solución estos a su vez son los resultados de calcular las
expresiones.
