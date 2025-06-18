# Examen recuperación MVC
---
Transforma esta aplicación según la arquitectura MVC vista en clase, sin cambiar la funcionalidad

Valoración:

* Clases por separado
* Funcionalidad de la vista (20 puntos)
* Funcionalidad del controller (20 puntos)
* Utilización de Clase para guardar datos (como la clase Coche utilizada en clase) (20 puntos)
  * Coherencia con la clase model (10 puntos)
* Realización de commits por cada paso que se realice (10 puntos)
* Comentarios en el código (5 puntos)
* Readme justificando la toma de desición y describiendo los beneficios aportados por el cambio de código (15 puntos)

# Inicio Examen 
## Cambio principal: Separacion de la clase main. 
Para eso creamos los paquetes controller,model y view (**MVC**),con sus respecticas clases a las que vamos a llamar CalculadoraController, Operacion y CalculadoraView.

*Cambios que hay que hacer en dichas clases:*

**1.** Para empezar, una vez creadas las clases, nos vamos al controller a gestionar la calculadora. 
- Primero creamos la clase iniciar, que meteremos más tarde en la main para que nos muestre el menú. 
- Seguida a esta creamos una clase que procese las opciones que tiene la calculadora, y que podemos escoger. Esta tiene 5 opciones, donde las 4 primeras introduce el primer y segundo numero y la 5ª nos muestra la salida y un error en caso de que lo detecte.
- La última clase que creamos aquí es la que ejecuta la operación. En esta clase lo que hacemos es que aparezcan las 4 operaciones que podemos hacer y muestra el resultado de cada una de ellas ademas de mostrar un error en caso de que lo detecte. 


  **2.** Pasamos a la clase Operacion que se encuentra en el model y ahi lo que tenemos que hacer es crear los numeros con los que queremos operar y añadimos las clases con las diferentes operaciones que en este caso son suma, resta,multiplicar y dividir.
  En estas clases lo que hacemos es retornar la operación de los dos numeros por ejemplo:
- Suma: return numero1 + numero2 
- Resta: return numero1 - numero2 
- Multiplicacion: return numero1 * numero2 
- División: return numero1 / numero2

En esta última tenemos que tener cuidado de que si la división es entre 0 no podemos seguir con la operación.

**3.** En la clase CalculadraView lo que he hecho es crear un menú donde aparezcan las distintas operaciones donde que la calculadora simple nos permite hacer además del botón para salir en caso de que no queramos seguir utilizando nuestra aplicación. 

- Por otro lado he creado clases para leer la opción de la operación que hemos escogido y ver si es vállida o no. En caso de que no lo sea mostrará el siguiente mensaje: "Error: Debes introducir un número válido."
- También he creado una clase para mostrar el resultado y otra para mostrar cualquier tipo de error que pueda suceder, además de la clase que muestra la salida y la que separa los elementos. 
- Por ultimo cerramos el scanner.

**4.** Por último nos vamos a la main donde eliminamos todo lo que tenemos y añadimos una clase para iniciar el controller con un nuevo controlador y lo iniciamos.









