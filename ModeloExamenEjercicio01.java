
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ModeloExamenEjercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arregloAutos = new ArrayList<>();

        boolean bandera = true;

        do {
            mostrarMenu();
            int election = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            if (election < 1 || election > 7) {
                System.out.println("Elección no permitida");
            } else if (election == 7) {
                bandera = false;
            } else {
                electionFunction(arregloAutos, election, scanner);
            }
        } while (bandera);

        scanner.close();
    }

    static void listarVehiculos(ArrayList<String> arregloAutos) {
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("");

        for (String elemento : arregloAutos) {
            System.out.println(elemento);
        }
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("------------------------");
    }

    static void mostrarMenu() {
        System.out.println("Elija una de las siguientes opciones. SOLAMENTE UN NÚMERO");
        System.out.println("==================================");
        System.out.println("GESTIÓN DE VENTA DE VEHÍCULOS - MENÚ DE OPCIONES");
        System.out.println("==================================");
        System.out.println("1. Agregar vehículo");
        System.out.println("2. Buscar vehículo");
        System.out.println("3. Eliminar vehículo");
        System.out.println("4. Listar vehículos");
        System.out.println("5. Ordenar vehículos alfabéticamente");
        System.out.println("6. Editar vehículo por índice");
        System.out.println("7. Salir");
        System.out.println("==================================");
    }

    static void electionFunction(ArrayList<String> arregloAutos, int election, Scanner scanner) {
        switch (election) {
            case 1: {
                System.out.println("Escribir el nombre del vehículo que quieres agregar");
                String nombreAuto = scanner.nextLine();
                agregarVehiculo(arregloAutos, nombreAuto);
                break;
            }
            case 2: {
                System.out.println("Escribir el nombre del vehículo que quieres buscar");
                String nombreAuto = scanner.nextLine();
                buscarVehiculo(arregloAutos, nombreAuto);
                break;
            }
            case 3: {
                System.out.println("Escribir el nombre del vehículo que quiere eliminar");
                String nombreAuto = scanner.nextLine();
                eliminarVehiculo(arregloAutos, nombreAuto);
                break;
            }
            case 4: {
                listarVehiculos(arregloAutos);
                break;
            }
            case 5: {
                ordenarVehiculos(arregloAutos);
                break;
            }
            case 6: {
                System.out.println("Escribir la posicion del vehículo que desea editar");
                int posicion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                System.out.println("Escribir el nombre del vehículo");
                String nombreAuto = scanner.nextLine();
                editarVehiculo(arregloAutos, posicion, nombreAuto);
                break;
            }
            default: {
                break;
            }
        }
    }

    static void ordenarVehiculos(ArrayList<String> arregloAutos) {
        Collections.sort(arregloAutos);
    }

    static void eliminarVehiculo(ArrayList<String> arregloAutos, String nombre) {
        arregloAutos.remove(nombre);
    }

    static void agregarVehiculo(ArrayList<String> arregloAutos, String nombreAuto) {
        arregloAutos.add(nombreAuto);
    }

    static void buscarVehiculo(ArrayList<String> arregloAutos, String nombreAuto) {
        int valor = arregloAutos.indexOf(nombreAuto);
        if (valor == -1) {
            System.out.println("No se encuentra en el arreglo");
        } else {
            System.out.println("Se encuentra en la posición: " + valor);
        }
    }

    static void editarVehiculo(ArrayList<String> arregloAutos, int posicion, String nombre) {
        if (posicion >= 0 && posicion < arregloAutos.size()) {
            arregloAutos.set(posicion, nombre);
        } else {
            System.out.println("Posición inválida");
        }
    }
}
