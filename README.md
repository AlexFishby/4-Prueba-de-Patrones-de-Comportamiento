# 4-Prueba-de-Patrones-de-Comportamiento

# Problema de Parar

Este proyecto implementa una simulación del problema de parar, también conocido como el problema de la parada. El problema de parar es un problema fundamental en la teoría de la computación que se refiere a la cuestión de si, dado un programa y una entrada, el programa terminará o continuará para siempre.

## Uso y construcción de las clases

Este proyecto consta de varias clases que trabajan juntas para simular el problema de parar.

### Clase `Usuario`

La clase `Usuario` es la clase principal que interactúa con el usuario y ejecuta los programas y análisis correspondientes. Esta clase contiene el método `main`, que se ejecuta al iniciar el programa. En este método, se le pide al usuario que elija entre ejecutar `CountDownProgram` o `CountUpProgram`, y luego se le pide que elija entre analizarlo con `HaltChecker` solo o con `HaltChecker` y luego `Reverser`.

### Clase `CountDownProgram`

La clase `CountDownProgram` implementa la interfaz `Program` y proporciona un programa que cuenta hacia abajo. Esta clase tiene un método `run` que ejecuta el programa y devuelve `true` si el programa termina o `false` si entra en un bucle infinito.

### Clase `CountUpProgram`

La clase `CountUpProgram` también implementa la interfaz `Program` y proporciona un programa que cuenta hacia arriba. Al igual que `CountDownProgram`, esta clase tiene un método `run` que ejecuta el programa y devuelve `false` ya que este programa entra en un bucle infinito.

### Clase `InfiniteLoopException`

La clase `InfiniteLoopException` es una excepción personalizada que se lanza cuando un programa entra en un bucle infinito. Esta clase tiene un constructor que toma un mensaje que describe la excepción.

### Clase `HaltChecker`

La clase `HaltChecker` es responsable de analizar un programa y determinar si terminará o entrará en un bucle infinito. Esta clase tiene un método `check` que toma un programa como parámetro y devuelve `true` si el programa termina o `false` si entra en un bucle infinito.

### Clase `Reverser`

La clase `Reverser` toma un programa y crea una versión invertida de él. Esta clase tiene un método `reverse` que toma un programa como parámetro y devuelve una versión invertida de ese programa.

## Relaciones entre las clases

La clase `Usuario` es la que interactúa con el usuario y controla el flujo del programa. Dependiendo de las elecciones del usuario, se crea una instancia de `CountDownProgram` o `CountUpProgram` y se pasa a una instancia de `HaltChecker` para su análisis. Si el usuario también elige usar `Reverser`, se crea una instancia de `Reverser` con el programa elegido y se pasa al `HaltChecker` para su análisis.

Las clases `CountDownProgram` y `CountUpProgram` implementan la interfaz `Program`, lo que significa que ambas proporcionan una implementación del método `run`. Este método se utiliza en `HaltChecker` para ejecutar el programa y determinar si terminará o entrará en un bucle infinito.

La clase `InfiniteLoopException` se utiliza para indicar cuando un programa entra en un bucle infinito. Esta excepción se puede lanzar desde el método `run` de las clases `CountDownProgram` y `CountUpProgram` y se puede capturar y manejar en la clase `Usuario`.

## Comenzando 🚀

Para obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas, puedes clonar el repositorio de GitHub.

### Pre-requisitos 📋

Necesitarás tener instalado Java y un IDE que soporte Java, como IntelliJ IDEA.

### Instalación 🔧

1. Clona el repositorio en tu máquina local.
2. Abre el proyecto en tu IDE.
3. Compila y ejecuta el programa.

## Ejecutando las pruebas ⚙️

Este proyecto utiliza JUnit para las pruebas unitarias. Para ejecutar las pruebas, sigue los pasos de tu IDE para ejecutar pruebas JUnit.

## Despliegue 📦

Para desplegar el programa, compila y ejecuta la clase `Usuario`.

## Construido con 🛠️

* [Java](https://www.java.com/) - El lenguaje de programación usado
* [JUnit](https://junit.org/junit5/) - Framework de pruebas

## Autores ✒️

* **AlexFishby** - *Trabajo Inicial* - [AlexFishby](https://github.com/AlexFishby)


