import java.util.Scanner;

public class ArregloYSuCuadrado {
    public static void main(String[] args){
        //int[] arreglo = {10,3,98,12,16};
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo: ");
        int cantidad = sc.nextInt();
        int[] arreglo = new int[cantidad];

        for(int i = 0; i < arreglo.length; i++){
            if (i == arreglo.length - 1){
                System.out.println("Ingrese el ultimo elemento: ");
            } else{
                System.out.println("Ingrese el proximo elemento: ");
            }
            arreglo[i] = sc.nextInt();
        }

        System.out.println("Arreglo original");
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println("\nArreglo al cuadrado");

        for(int i = 0; i < arreglo.length; i++){
            System.out.print((arreglo[i] * arreglo[i]) + ", ");
        }
    }
}
