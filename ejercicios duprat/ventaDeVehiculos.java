import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class ventaDeVehiculos {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar cadenas de texto
        ArrayList<String> listaAuto = new ArrayList<>();

        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Buscar vehículo");
            System.out.println("3. Eliminar vehículo");
            System.out.println("4. Listar vehículos");
            System.out.println("5. Ordenar vehículos alfabéticamente");
            System.out.println("6. Editar vehículo por índice");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            // Realizar la operación seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el vehículo a agregar: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String nombreAuto = scanner.nextLine();
                    agregarVehiculo(listaAuto,nombreAuto);
                    //listaAuto.add(nombreAuto);
                    System.out.println("vehículo agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el vehículo a buscar: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String buscarAuto = scanner.nextLine();
                    int posicion = buscarVehiculo(listaAuto,buscarAuto);
                    if (posicion > 0) {
                        System.out.println(posicion);
                    } else {
                        System.out.println(posicion);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el vehículo a borrar: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String borrarAuto = scanner.nextLine();
                    eliminarVehiculo(listaAuto,borrarAuto);
                    break;
                case 4:
                    System.out.println("Vehículo en la lista:");
                    listarVehiculos(listaAuto);
                    break;
                case 5:
                    ordenarVehiculos(listaAuto);
                    break;
                case 6:
                    System.out.print("Ingrese la posicion a editar: ");

                    int indice = scanner.nextInt();

                    System.out.print("Ingrese el nuevo nombre: ");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    String nombreNuevo = scanner.nextLine();

                    editarVehiculo(listaAuto,indice,nombreNuevo);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);


    }

    public static void agregarVehiculo(ArrayList<String> listaAuto,String nombreAuto) {
        listaAuto.add(nombreAuto);
    }

    public static int buscarVehiculo(ArrayList<String> listaAuto,String nombreAuto) {
        return listaAuto.indexOf(nombreAuto);
    }

    public static void eliminarVehiculo(ArrayList<String> listaAuto,String nombreAuto) {
        listaAuto.remove(nombreAuto);
    }

    public static void listarVehiculos(ArrayList<String> listaAuto) {
        for (String item : listaAuto) {
            System.out.println(item);
        }
    }

    public static void ordenarVehiculos(ArrayList<String> listaAuto) {
        Collections.sort(listaAuto);
    }

    public static void editarVehiculo(ArrayList<String> listaAuto, int indice, String nombreEditar) {
        listaAuto.set(indice,nombreEditar);
    }

}
