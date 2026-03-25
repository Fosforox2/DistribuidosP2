# DistribuidosP2
## Ejercicio 1. Mirar Código
## Ejercicio 2. Mirar Código
## Ejercicio 3.  ¿Conoces JUnit? , ¿Conoces TDD?

JUnit es el framework de testing usado para la realización de las pruebas unitarias. Esta librería se importa en el código mediante la línea:


<img width="399" height="45" alt="image" src="https://github.com/user-attachments/assets/b66f9c90-9a65-4a8f-ae0d-a2ec0674683e" />



La anotación @Test se utiliza para indicar qué métodos son casos de prueba, permitiendo que el framework los ejecute automáticamente. Por otro lado, las aserciones como assertEquals y assertThrows se emplean para comprobar que los resultados obtenidos coinciden con los esperados y que se gestionan correctamente los errores. Por ejemplo, assertEquals verifica resultados numéricos y assertThrows permite validar que se lanza una excepción en casos como la división por cero.


<img width="934" height="304" alt="image" src="https://github.com/user-attachments/assets/f56dc3b5-8474-401d-9e9f-033e122071ba" />



En cuanto a TDD (Test Driven Development), se trata de una metodología en la que primero se escriben los tests y después la implementación. En este caso, se han definido previamente los casos de prueba de cada operación (suma, resta, etc.) y posteriormente se ha implementado la lógica necesaria para que dichos tests pasen correctamente. Esto permite asegurar que el código cumple los requisitos desde el inicio y facilita su validación.

Sabemos que no hemos aplicado TDD de forma estricta, ya que la implementación no ha sido guiada desde el inicio por los tests. Sin embargo, se ha seguido un enfoque similar, utilizando pruebas unitarias para validar el comportamiento del sistema y asegurar la corrección de la lógica implementada.

## Ejercicio 4. ¿Qué porcentaje de cobertura de código tienen tus tests?


La cobertura de código mide qué partes del programa han sido ejecutadas durante la ejecución de los tests. Para ello se pueden utilizar herramientas como JaCoCo, que analizan qué métodos y ramas del código han sido cubiertos.

En este caso, al haber implementado tests para todas las operaciones de la calculadora, incluyendo casos normales y excepcionales (como división por cero o raíz negativa), se alcanza una cobertura aproximada del 70%–80%, lo que indica que la mayor parte de la lógica del programa ha sido verificada correctamente.

Este porcentaje faltante es porque no hemos porbado absolutamente todos los casos posibles, por ejemplo calculos con numeros mayores a 64 bits (ya que un float es la longitud que tiene) entre otros, por lo que no podemos asegurar que tenemos una cobertura del 100%.
