# Sistema de Control de Aforo de Eventos

## Descripción

Este proyecto implementa un sistema de control de aforo que permite registrar los ingresos y las salidas de asistentes a un evento. Utiliza encapsulamiento y validaciones para garantizar que no se supere la capacidad máxima permitida ni se registre una cantidad negativa de asistentes.

## Funcionamiento

El programa realiza las siguientes operaciones:

1. Crea un control de aforo con una capacidad máxima de 5 personas.
2. Intenta registrar el ingreso de 8 personas.
3. Aprueba los primeros 5 ingresos y rechaza los 3 restantes porque el aforo está completo.
4. Muestra la cantidad de ingresos admitidos y rechazados.
5. Registra la salida de 2 asistentes, liberando lugares.
6. Permite el ingreso de una persona después de liberar espacio.
7. Registra varias salidas hasta vaciar el evento.
8. Intenta registrar una salida adicional, que se rechaza porque no quedan asistentes.
9. Muestra la cantidad final de asistentes.

## Clases principales

### Clase `ControlAforo`

Representa el sistema de control de asistentes de un evento.

**Atributos:**

* `capacidadMaxima`: cantidad máxima de personas permitidas.
* `asistentesActuales`: cantidad de personas que se encuentran dentro del evento.

**Métodos principales:**

* `ControlAforo(int capacidadMaxima)`: inicializa la capacidad máxima y establece el contador de asistentes en cero.
* `getCapacidadMaxima()`: devuelve la capacidad máxima permitida.
* `getAsistentesActuales()`: devuelve la cantidad actual de asistentes.
* `registrarIngreso()`: permite el ingreso de una persona si hay capacidad disponible. Devuelve `true` si se aprueba y `false` si se rechaza.
* `registrarSalida()`: registra la salida de una persona si hay asistentes dentro del evento. Devuelve `true` si se registra y `false` si se rechaza.

### Clase `Main`

Contiene el método `main()` y permite probar el control de aforo mediante ingresos masivos, salidas y nuevos ingresos después de liberar lugares.

## Conceptos de programación utilizados

* **Encapsulamiento:** los atributos son `private` para impedir modificaciones directas desde otras clases.
* **Constructores:** inicializan la capacidad máxima y el contador de asistentes.
* **Métodos de acceso (getters):** permiten consultar los datos del aforo.
* **Condicionales:** verifican si se puede registrar un ingreso o una salida.
* **Estructuras repetitivas (`for`):** permiten simular múltiples operaciones de ingreso y salida.
* **Contadores:** registran la cantidad de operaciones admitidas y rechazadas.
* **Retorno booleano:** informa si cada operación se realizó correctamente.
* **Control de límites:** evita superar la capacidad máxima y reducir el contador por debajo de cero.

## Tecnologías utilizadas

* Java.
* IntelliJ IDEA.
* Programación orientada a objetos (POO).

## Ejecución

<img width="531" height="772" alt="image" src="https://github.com/user-attachments/assets/1dffc890-cdf6-414e-ba2f-aafa355cb97e" />

## Resultado esperado

El sistema admite inicialmente a 5 personas y rechaza 3 ingresos por superar la capacidad máxima.

Luego se registran 2 salidas, se admite una nueva persona y se realizan las salidas restantes hasta vaciar el evento. El último intento de salida se rechaza porque no hay asistentes dentro.

**Valores finales esperados:**

* Capacidad máxima: `5`
* Admitidos en el ingreso inicial: `5`
* Rechazados en el ingreso inicial: `3`
* Asistentes finales: `0`

## Objetivo del ejercicio

Aplicar encapsulamiento, contadores, estructuras repetitivas y validaciones para controlar el acceso a un evento, garantizando que se respete la capacidad máxima y que el registro de asistentes permanezca dentro de los límites permitidos.

## Estructura del proyecto

```text
ControlAforoEventos/
├── src/
│   ├── ControlAforo.java
│   └── Main.java
└── README.md
```
