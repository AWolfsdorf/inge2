# Taller2 

## Ejercicio 1

Completamos la tablita:

|n      | OUT\[n](x) |
|-               |-  |
|x = 0           | Z |
|x = k // k != 0 | NZ |

## Ejercicio 2

Completamos la tablita de `(x = y)`:

| IN\[n](y)     | OUT\[n](x)    |
|-              |-              |
|⊥              | ⊥             |
|Z              | Z             |
|NZ             | NZ            |
|MZ             | MZ            |


## Ejercicio 3

Completamos la tablita de `(x = y + z)`


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

Completamos la tablita de `(x = y - z)`


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

Completamos la tablita de `(x = y * z)`


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

Completamos la tablita de `(x = y / z)`


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


Completamos la tablita del grafiquito


|n| IN\[n](x)     | IN\[n](y)     |OUT\[n](x)  |OUT\[n](y)  |
|-|-              |-              |-           |-           |
|1| ⊥             | MZ            | ⊥          | MZ         |
|2| ⊥             | MZ            | MZ         | MZ         |
|3| MZ            | MZ            | MZ         | NZ         |
|4| MZ            | MZ            | MZ         | MZ         |
|5| MZ            | MZ            | MZ         | MZ         |
|6| MZ            | MZ            | MZ         | MZ         |
|7| MZ            | MZ            | MZ         | MZ         |
