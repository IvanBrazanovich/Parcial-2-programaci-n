import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar cadenas de texto
        ArrayList<String> listaLibro = new ArrayList<>();

        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar menú de opciones
            menu();
            opcion = scanner.nextInt();

            // Realizar la operación seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el libro a agregar: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String nombrelibro = scanner.nextLine();
                    agregarLibro(listaLibro,nombrelibro);
                    //listaLibro.add(nombreLibro);
                    System.out.println("libro agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el libro a buscar: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String buscarLibro = scanner.nextLine();
                    int posicion = buscarLibro(listaLibro,buscarLibro);
                    if (posicion > 0) {
                        System.out.println(posicion);
                    } else {
                        System.out.println(posicion);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el libro a borrar: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String borrarLibro = scanner.nextLine();
                    eliminarlibro(listaLibro,borrarLibro);
                    break;
                case 4:
                    System.out.println("libros en la lista:");
                    listarLibros(listaLibro);
                    break;
                case 5:
                    ordenarLibros(listaLibro);
                    break;
                case 6:
                    System.out.print("Ingrese la posicion a editar: ");

                    int indice = scanner.nextInt();

                    System.out.print("Ingrese el nuevo nombre: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String nombreNuevo = scanner.nextLine();

                    editarLibro(listaLibro,indice,nombreNuevo);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);


    }
    public static void menu(){
        System.out.println("==================================");
        System.out.println("BIBLIOTECA - MENÚ DE OPCIONES");
        System.out.println("==================================");
        System.out.println("1. Agregar libro");
        System.out.println("2. Buscar libro");
        System.out.println("3. Eliminar libro");
        System.out.println("4. Listar libros");
        System.out.println("5. Ordenar libros alfabéticamente");
        System.out.println("6. Editar libro indicando el índice");
        System.out.println("7. Salir");
        System.out.println("==================================");
    }

    public static void agregarLibro(ArrayList<String> listaLibro,String nombreLibro) {
        listaLibro.add(nombreLibro);
    }

    public static int buscarLibro(ArrayList<String> listaLibro,String nombreLibro) {
        return listaLibro.indexOf(nombreLibro);
    }

    public static void eliminarlibro(ArrayList<String> listaLibro,String nombreLibro) {
        listaLibro.remove(nombreLibro);
    }

    public static void listarLibros(ArrayList<String> listaLibro) {
        for (String item : listaLibro) {
            System.out.println(item);
        }
    }

    public static void ordenarLibros(ArrayList<String> listaLibro) {
        Collections.sort(listaLibro);
    }

    public static void editarLibro(ArrayList<String> listaLibro, int indice, String nombreEditar) {
        listaLibro.set(indice,nombreEditar);
    }

}
