import java.util.Scanner;

public class CalculadoraBoletoViaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de kilómetros a recorrer: ");
        double distancia = scanner.nextDouble();

        double precioPorKm = 45.0;
        double precioTotal = calcularPrecio(distancia, precioPorKm);

        System.out.println("El precio del boleto de viaje es: $" + precioTotal);

        scanner.close();
    }

    public static double calcularPrecio(double distancia, double precioPorKm) {
        return distancia * precioPorKm;
    }
}