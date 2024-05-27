Aquí tienes el texto del archivo con los ejemplos de las imágenes incluidas:

---

```table-of-contents
title: 
style: nestedList # TOC style (nestedList|inlineFirstLevel)
minLevel: 0 # Include headings from the specified level
maxLevel: 0 # Include headings up to the specified level
includeLinks: true # Make headings clickable
debugInConsole: false # Print debug info in Obsidian console
```

# Práctica 
 
## Modularización
Consiste en dividir un programa grande y complejo en partes más pequeñas y manejables llamadas módulos o subprogramas. Estos módulos pueden ser funciones o procedimientos, que son unidades independientes de código que realizan tareas específicas.

### Benificios
- **Facilita el mantenimiento del código:** Al dividir el código en módulos más pequeños y manejables, es más fácil realizar cambios y correcciones.
- **Reutilización de código:** Los subprogramas pueden ser reutilizados en diferentes partes del programa o incluso en otros programas.
- **Facilita la depuración:** Al tener partes más pequeñas y específicas del código, es más fácil identificar y corregir errores.

### Subprogramas
Son unidades independientes de código que realizan tareas específicas y pueden ser invocadas desde otras partes del programa principal. Pueden ser de dos tipos: funciones y procedimientos.

#### Funciones
Una función es un subprograma que devuelve un valor después de realizar una operación. En Java, las funciones se definen usando el tipo de dato que devuelven.

##### Declaración de funciones
**Ejemplo de una función que calcula la suma de dos números:**

```java
public int sumar(int a, int b) {
    return a + b;
}
```
- **tipo_de_retorno**: Especifica el tipo de dato que la función devolverá como resultado. Puede ser cualquier tipo de dato válido en Java, incluyendo tipos primitivos (como int, double, boolean, etc.) o tipos de objeto (como String, ArrayList, etc.).
- **nombre_de_la_funcion**: Es el nombre único que identifica a la función. Debe seguir las convenciones de nombrado de Java y ser descriptivo de la tarea que realiza la función.
- **parámetros**: Son los valores que se pasan a la función cuando se llama. Pueden ser cero o más parámetros, separados por comas. Cada parámetro está compuesto por un tipo y un nombre.
- **valor_de_retorno**: Es el valor que devuelve la función como resultado. Debe ser del mismo tipo que el tipo de retorno especificado en la declaración de la función. Si la función no devuelve ningún valor, se usa la palabra clave void.


 **Inicialización con valores explícitos**
![[Pasted image 20240527100737.png]]



#### Procedimientos
Un procedimiento es un subprograma que realiza una tarea sin devolver un valor. En Java, los procedimientos se definen con el tipo de retorno void.

**Ejemplo de un procedimiento que imprime un mensaje por pantalla:**

```java
public void imprimirMensaje() {
    System.out.println("Hola, mundo!");
}
```


## Variables y parámetros
### Variables
En el contexto de las funciones en Java, las variables locales y globales se refieren a cómo se almacenan y acceden a las variables dentro de una función y en el ámbito más amplio del programa. El uso excesivo de variables globales puede hacer que el código sea más difícil de entender y depurar. Se recomienda utilizar variables locales siempre que sea posible, ya que tienen un ámbito más limitado y son más seguras en términos de encapsulamiento y mantenibilidad del código.

#### Variables locales

- Las variables locales son variables declaradas dentro de una función y solo son accesibles dentro de esa función.
- Estas variables tienen un ámbito limitado que se extiende desde el punto donde se declaran hasta el final de la función donde están definidas.
- Las variables locales se crean cuando la función se llama y se eliminan cuando la función termina su ejecución.
- No se puede acceder a las variables locales desde fuera de la función en la que se declaran.
- Las variables locales deben ser inicializadas antes de ser utilizadas en la función.

**Ejemplo de variables locales**
![[Pasted image 20240527101655.png]]

#### Variables globales
- Las variables globales son variables declaradas fuera de cualquier función y son accesibles desde cualquier parte del programa.
- Estas variables tienen un ámbito que se extiende a lo largo de todo el programa.
- Las variables globales se crean cuando se inicia el programa y se destruyen cuando el programa termina su ejecución.
- Pueden ser accedidas y modificadas por cualquier función en el programa.

**Ejemplo de variables Globales**
![[Pasted image 20240527101750.png]]


#### Pasaje de Parámetros
El pasaje de parámetros se refiere a cómo se transfieren los valores entre una función y la parte del programa que la llama. En Java, existen principalmente dos formas de pasar parámetros a una función: por valor y por referencia.

##### Pasaje de parámetros por valor
- En el pasaje por valor, se pasa una copia del valor de la variable como argumento a la función.
- La función trabaja con una copia de la variable original y cualquier modificación realizada en la copia no afecta a la variable original.
- Este es el método predeterminado para pasar parámetros en Java para tipos primitivos y objetos inmutables.

**Ejemplo de variables Globales**
![[Pasted image 20240527102210.png]]
``` java
public class PasajePorValor {
    public static void main(String[] args) {
        int a = 5;
        cambiarValor(a);
        System.out.println(a); // Imprime 5
    }

    public static void cambiarValor(int num) {
        num = 10;
    }
}

```


##### Pasaje de parámetros por referencia
- En el pasaje por referencia, se pasa una referencia a la variable como argumento a la función.
- La función trabaja con la misma instancia de objeto que la variable original y cualquier modificación realizada en la referencia dentro de la función afecta a la variable original.
- Este método se utiliza para pasar parámetros en Java para objetos mutables.

**Ejemplo de variables Globales**
![[Pasted image 20240527102436.png]]


#### Parámetros nominales y efectivos
Los parámetros nominales y efectivos son conceptos relacionados con la forma en que se definen y utilizan los parámetros en una función o método.
##### Parámetros nominales
- Los parámetros nominales son los nombres de los parámetros que se definen en la declaración de la función o método.
- Estos nombres son utilizados para identificar los valores que se pasan a la función cuando se llama.
- Son útiles para proporcionar significado y contexto a los valores que se pasan a la función.
![[Pasted image 20240527102615.png]]



##### Parámetros efectivos
- Los parámetros efectivos son los valores reales que se pasan a la función cuando se llama.
- Estos valores pueden ser constantes, variables o expresiones que coinciden con los tipos de datos y el número de parámetros definidos en la función.
- Los parámetros efectivos son los valores que la función utiliza para llevar a cabo sus operaciones.

``` java
//Parámetros efectivos: 5,10
	calcularSuma(5,10); //Llamada a la función con los valores efectivos.
```

 

## Recursividad
La recursividad es un concepto en programación en el que una función se llama a sí misma directa o indirectamente para resolver un problema.

Es especialmente útil para resolver problemas que pueden ser descompuestos en subproblemas más pequeños y similares al problema original.

La recursividad se basa en dos partes principales: el caso base y el caso recursivo.


### El caso base 
- Es la condición que detiene la recursión.
- Define el escenario más simple o básico que no requiere una llamada recursiva.
- Es crucial para evitar que la función se llame indefinidamente.



### Caso recursivo
- Es donde se realiza la llamada recursiva a la función dentro de sí misma.
- Se encarga de dividir el problema original en subproblemas más pequeños.
- Se combina con el resultado de la llamada recursiva para resolver el problema original.

Claro, aquí tienes dos ejemplos de recursividad en Java, uno sencillo y otro un poco más complejo, con comentarios explicativos para ayudarte a entender el funcionamiento de cada uno.

### Ejemplo 1: Factorial de un número

El factorial de un número \( n \) se define como el producto de todos los enteros positivos desde 1 hasta \( n \). Es un buen ejemplo para ilustrar la recursividad.

```java
public class Factorial {
    // Método recursivo para calcular el factorial de un número
    public static int factorial(int n) {
        // Caso base: el factorial de 0 o 1 es 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Caso recursivo: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("El factorial de " + number + " es " + result);
    }
}
```

**Explicación**:
1. **Caso base**: Cuando \( n \) es 0 o 1, el factorial es 1. Este es el caso que detiene la recursividad.
2. **Caso recursivo**: Para cualquier otro número \( n \), el factorial se calcula como \( n \times \text{factorial}(n-1) \).
3. La llamada recursiva reduce el problema en cada paso hasta llegar al caso base.

### Ejemplo 2: Suma de un arreglo

Este ejemplo es más complejo y muestra cómo usar la recursividad para sumar todos los elementos de un arreglo.

```java
public class SumaArreglo {
    // Método recursivo para sumar los elementos de un arreglo
    public static int suma(int[] arr, int indice) {
        // Caso base: si el índice es igual al tamaño del arreglo, hemos terminado
        if (indice == arr.length) {
            return 0;
        }
        // Caso recursivo: sumar el elemento actual y la suma de los elementos restantes
        return arr[indice] + suma(arr, indice + 1);
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        int resultado = suma(arreglo, 0);
        System.out.println("La suma de los elementos del arreglo es " + resultado);
    }
}
```

**Explicación**:
1. **Caso base**: Cuando el índice llega al tamaño del arreglo, retornamos 0, indicando que no hay más elementos por sumar.
2. **Caso recursivo**: Sumamos el elemento en la posición actual (arr[indice]) y luego llamamos recursivamente al método con el siguiente índice (indice + 1).
3. La recursividad reduce el tamaño del problema (el índice avanza) hasta llegar al caso base.

Ambos ejemplos muestran cómo se puede utilizar la recursividad para resolver problemas dividiendo el problema original en subproblemas más pequeños, hasta que se llega a un caso base donde la solución es directa.

Claro, aquí tienes otros dos ejemplos de recursividad en Java, uno de complejidad media y otro más avanzado.

### Ejemplo 3: Secuencia de Fibonacci

La secuencia de Fibonacci es una serie de números en la que cada número es la suma de los dos anteriores. La secuencia empieza con 0 y 1.

```java
public class Fibonacci {
    // Método recursivo para calcular el n-ésimo número de Fibonacci
    public static int fibonacci(int n) {
        // Caso base: fibonacci(0) es 0 y fibonacci(1) es 1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Caso recursivo: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int numero = 6; // Cambia este valor para probar otros números
        int resultado = fibonacci(numero);
        System.out.println("El " + numero + "º número de Fibonacci es " + resultado);
    }
}
```

**Explicación**:
1. **Casos base**: Cuando \( n \) es 0 o 1, los valores de Fibonacci son 0 y 1 respectivamente.
2. **Caso recursivo**: Para cualquier \( n \) mayor que 1, el valor de Fibonacci se calcula como la suma de los dos valores de Fibonacci anteriores.

### Ejemplo 4: Búsqueda binaria

La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada. Este ejemplo muestra una implementación recursiva de la búsqueda binaria.

```java
public class BusquedaBinaria {
    // Método recursivo para realizar una búsqueda binaria en un arreglo ordenado
    public static int busquedaBinaria(int[] arr, int elemento, int inicio, int fin) {
        // Caso base: si el inicio es mayor que el fin, el elemento no está en el arreglo
        if (inicio > fin) {
            return -1;
        }

        // Encontrar el punto medio
        int medio = inicio + (fin - inicio) / 2;

        // Caso base: el elemento está en el punto medio
        if (arr[medio] == elemento) {
            return medio;
        }

        // Caso recursivo: buscar en la mitad izquierda
        if (arr[medio] > elemento) {
            return busquedaBinaria(arr, elemento, inicio, medio - 1);
        }

        // Caso recursivo: buscar en la mitad derecha
        return busquedaBinaria(arr, elemento, medio + 1, fin);
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elementoABuscar = 7;
        int resultado = busquedaBinaria(arreglo, elementoABuscar, 0, arreglo.length - 1);
        if (resultado != -1) {
            System.out.println("Elemento encontrado en el índice " + resultado);
        } else {
            System.out.println("Elemento no encontrado en el arreglo.");
        }
    }
}
```

**Explicación**:
1. **Caso base**: Si el inicio es mayor que el fin, el elemento no está presente en el arreglo.
2. **Caso base**: Si el elemento en el punto medio es igual al elemento que estamos buscando, hemos encontrado el elemento.
3. **Caso recursivo**: Si el elemento es menor que el elemento en el punto medio, buscamos en la mitad izquierda del arreglo.
4. **Caso recursivo**: Si el elemento es mayor, buscamos en la mitad derecha del arreglo.

Estos ejemplos muestran cómo la recursividad puede aplicarse para resolver problemas de manera eficiente al dividir el problema en subproblemas más pequeños hasta alcanzar una solución directa.
