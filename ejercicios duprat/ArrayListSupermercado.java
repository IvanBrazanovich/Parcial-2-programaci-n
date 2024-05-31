import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSupermercado {

    public static void main(String[] args) {
        // Crear un ArrayList para almacenar cadenas de texto
        ArrayList<String> lista = new ArrayList<>();

        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Listar productos");
            System.out.println("4. Borrar producto");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            // Realizar la operación seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el producto a agregar: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String elemento = scanner.nextLine();
                    lista.add(elemento);
                    System.out.println("Producto agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el producto a buscar: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String buscar = scanner.nextLine();
                    if (lista.contains(buscar)) {
                        System.out.println("El producto está en la lista.");
                    } else {
                        System.out.println("El producto no está en la lista.");
                    }
                    break;
                case 3:
                    System.out.println("Producto en la lista:");
                    for (String item : lista) {
                        System.out.println(item);
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el producto a borrar: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String borrar = scanner.nextLine();
                    //scanner.nextLine(); // Limpiar el buffer de entrada

                    if (lista.contains(borrar)) {
                        System.out.print("Esta seguro que desea eliminar? " + borrar + " Ingrese 1 para eliminar");
                        scanner.nextInt(); // Limpiar el buffer de entrada
                        int estaSeguro = scanner.nextInt();

                        if ( estaSeguro == 1) {
                            lista.remove(borrar);
                            System.out.println("Producto borrado correctamente.");
                        }
                    }else {
                        System.out.println("El producto no está en la lista.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}