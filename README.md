Los **Objetos** son todas las cosas físicas o conceptuales que tienen propiedades y comportamientos. Por ejemplo: usuario, sesión, auto, etc.

Las **Propiedades** o atributos son las características de nuestros objetos. Estos atributos siempre serán sustantivos y pueden tener diferentes valores que harán referencia a nombres, tamaños, formas y estados.

Los **Comportamientos** o métodos serán todas las operaciones de nuestros objetos que solemos llamar usando verbos o sustantivos y verbos. Por ejemplo: los métodos del objeto sesión pueden ser login(), logout(), makeReport(), etc.

La **Abstracción** se trata de analizar objetos de forma independiente, sus propiedades, características y comportamientos, para abstraer su composición y generar un modelo, lo que traducimos a código como clases.

Las **Clases** son los modelos sobre los cuales construimos nuestros objetos, es decir, las clases son los “moldes” que nos permiten generar objetos. Cada clase debe tener identidad (con un nombre de clase único usando Upper Camel Case), estado (con sus atributos) y comportamiento (con sus métodos y operaciones).

La **Modularidad** consiste en dividir nuestro programa en diferentes módulos de forma que puedan unirse o separarse sin romperse entre ellos o perder alguna funcionalidad.

La Modularidad en Programación Orientada a Objetos nos ayuda a:

- Reutilizar código.
- Evitar colapsos.
- Que nuestro código sea mantenible.
- Mejorar la legibilidad.
- Resolución rápida de problemas.

El **Método Constructor** es el primer método que se ejecuta por defecto cuando creamos una clase, nos permite crear nuevas instancias de una clase. Lo invocamos con la palabra reservada `new` seguida del nombre con el que inicializamos la clase y paréntesis.

```java
// nombreDeLaInstancia = new MétodoConstructor();
myDoctor = new Doctor();
```
## Static 
Los métodos y variables estáticos nos ayudan a ejecutar o conseguir algún código desde clases no han sido instanciadas, ya que sus valores se guardan en la memoria de nuestro programa, no en diferentes objetos instanciados a través de una clase.

Las variables estáticas mantienen su valor durante todo el ciclo de vida de nuestro programa, por lo tanto, podemos alterar los valores de una variable estática desde una clase y consumir su valor alterado desde otra sin necesidad de conectar ambas clases.

También podemos importar los métodos estáticos de una clase para usarlos sin necesidad de escribir el nombre de la clase:

```Java
import static com.anncode.operaciones.Calculadora.*
import static java.lang.Math.*

public class Principal {
  public static void (String[] args) {
    int number = suma(3, 5);
    System.out.println(number + PI);
  }
}
```

## Sobrecarga de métodos y constructores

A veces necesitamos que dos o más métodos de una misma clase tengan el mismo nombre, pero con diferentes argumentos o distintos tipos de argumentos/valores de retorno.

Afortunadamente, Java nos permite ejecutar código y métodos diferentes dependiendo de los argumentos que reciba nuestra clase.

```Java
public class Calculadora {
  // Los dos parámetros y el valor de retorno son de tipo int
  public int suma(int a, int b) {
    return a + b;
  }

  // Los dos parámetros y el valor de retorno son de tipo float
  public float suma(float a, float b) {
    return a + b;
  }

  // Un parámetro es de tipo int, mientras que el otro parámetro
  // y el valor de retorno son de tipo float
  public float suma(int a, float b) {
    return a + b;
  }
}
```

## Variable vs. Objeto: Un vistazo a la memoria

**Un objeto es una referencia a un espacio en memoria**. Cuando creamos objetos, Java los guarda en la memoria y nos devuelve coordenadas con las que podremos acceder a la información que almacenamos.

Existen dos tipos de memoria: **Stack y Heap**.

La memoria **Stack** es mucho más rápida y nos permite almacenar nuestra información de forma “ordenada”. Aquí se guardan las variables y sus valores de tipos de datos primitivos (booleanos, números, strings, entre otros).

Los objetos también usan la memoria Stack, pero no para guardar su información, sino para guardar las coordenadas a la verdadera ubicación del objeto en la memoria Heap, una memoria que nos permite guardar grandes cantidades de información, pero con un poco menos de velocidad.

![alt text](https://raw.githubusercontent.com/zayelmech/Java_POO/main/Recursos/memoria.jpg)

## Encapsulamiento: Modificadores de acceso

Los **Modificadores de Acceso** nos ayudan a limitar desde dónde podemos leer o modificar atributos especiales de nuestras clases. Podemos definir qué variables se pueden leer/editar por fuera de las clases donde fueron creadas. Esto lo conocemos como **Encapsulamiento**.

![alt text](https://raw.githubusercontent.com/zayelmech/Java_POO/main/Recursos/accceso.webp)

## Getters y Setters 

Nos permiten leer y escribir (respectivamente) los valores de nuestras variables privadas desde fuera de la clase donde fueron creadas. Con los **Getters** obtenemos los datos de las variables y con los **Setters** asignamos o cambiamos su valor.