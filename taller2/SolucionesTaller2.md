# Taller2 

## Ejercicio 1

La tabla de la asignación de una constante a una variable `x` nos quedó de la
siguiente manera:

|n      | OUT\[n](x) |
|-               |-  |
|x = 0           | Z |
|x = k // k != 0 | NZ |

## Ejercicio 2

La tabla de la función de transferencia de `(x = y)` nos quedó de la siguiente manera:

| IN\[n](y)     | OUT\[n](x)    |
|-              |-              |
|⊥              | ⊥             |
|Z              | Z             |
|NZ             | NZ            |
|MZ             | MZ            |


## Ejercicio 3

La tabla de la función de transferencia de `(x = y + z)` nos quedó de la siguiente manera:


| IN\[n](y)     | IN\[n](z)     |OUT\[n](x)|
|-              |-              |-|
|⊥              | ⊥             |⊥|
|Z              | ⊥             |⊥|
|NZ             | ⊥             |⊥|
|MZ             | ⊥             |⊥|
|⊥              | Z             |⊥|
|Z              | Z             |Z|
|NZ             | Z             |NZ|
|MZ             | Z             |MZ|
|⊥              | NZ            |⊥|
|Z              | NZ            |NZ|
|NZ             | NZ            |MZ|
|MZ             | NZ            |MZ|
|⊥              | MZ            |⊥|
|Z              | MZ            |MZ|
|NZ             | MZ            |MZ|
|MZ             | MZ            |MZ|


## Ejercicio 4

La tabla de la función de transferencia de  `(x = y - z)` nos quedó de la siguiente manera:


| IN\[n](y)     | IN\[n](z)     |OUT\[n](x) |
|-              |-              |-          |
|⊥              | ⊥             | ⊥         |
|Z              | ⊥             | ⊥         |
|NZ             | ⊥             | ⊥         |
|MZ             | ⊥             | ⊥         |
|⊥              | Z             | ⊥         |
|Z              | Z             | Z         |
|NZ             | Z             | NZ        |
|MZ             | Z             | MZ         |
|⊥              | NZ            | ⊥        |
|Z              | NZ            | NZ         |
|NZ             | NZ            | MZ         |
|MZ             | NZ            | MZ         |
|⊥              | MZ            | ⊥          |
|Z              | MZ            | MZ         |
|NZ             | MZ            | MZ         |
|MZ             | MZ            | MZ         |


## Ejercicio 5

La tabla de la función de transferencia de   `(x = y * z)` nos quedó de la siguiente manera:


| IN\[n](y)     | IN\[n](z)     |OUT\[n](x)  |
|-              |-              |-           |
|⊥              | ⊥             | ⊥          |
|Z              | ⊥             | ⊥          |
|NZ             | ⊥             | ⊥          |
|MZ             | ⊥             | ⊥          |
|⊥              | Z             | ⊥          |
|Z              | Z             | Z          |
|NZ             | Z             | Z          |
|MZ             | Z             | Z          |
|⊥              | NZ            | ⊥          |
|Z              | NZ            | Z          |
|NZ             | NZ            | NZ         |
|MZ             | NZ            | MZ         |
|⊥              | MZ            | ⊥          |
|Z              | MZ            | Z          |
|NZ             | MZ            | MZ         |
|MZ             | MZ            | MZ         |


## Ejercicio 6

La tabla de la función de transferencia de  `(x = y / z)` nos quedó de la siguiente manera:


| IN\[n](y)     | IN\[n](z)     |OUT\[n](x)  |
|-              |-              |-           |
|⊥              | ⊥             | ⊥          |
|Z              | ⊥             | ⊥          |
|NZ             | ⊥             | ⊥          |
|MZ             | ⊥             | ⊥          |
|⊥              | Z             | ⊥          |
|Z              | Z             | ⊥          |
|NZ             | Z             | ⊥          |
|MZ             | Z             | ⊥          |
|⊥              | NZ            | ⊥          |
|Z              | NZ            | Z          |
|NZ             | NZ            | MZ         |
|MZ             | NZ            | MZ         |
|⊥              | MZ            | ⊥          |
|Z              | MZ            | MZ         |
|NZ             | MZ            | MZ         |
|MZ             | MZ            | MZ         |


## Ejercicio 7


La tabla con los valores de IN y OUT para toda variable del probrama nos quedó
de la siguiente manera:


|n| IN\[n](x)     | IN\[n](y)     |OUT\[n](x)  |OUT\[n](y)  |
|-|-              |-              |-           |-           |
|1| ⊥             | MZ            | ⊥          | MZ         |
|2| ⊥             | MZ            | MZ         | MZ         |
|3| MZ            | MZ            | MZ         | NZ         |
|4| MZ            | MZ            | MZ         | MZ         |
|5| MZ            | MZ            | MZ         | MZ         |
|6| MZ            | MZ            | MZ         | MZ         |
|7| MZ            | MZ            | MZ         | MZ         |
