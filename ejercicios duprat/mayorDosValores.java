import java.util.Scanner;

public class mayorDosValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el primer valor");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el primer valor");
        int num3 = scanner.nextInt();

        //int mayor = mayor(num1,num2);

        int masmayor = mayor3(num1,num2,num3);

        System.out.println("El mayor es: " + masmayor);
    }

    public static int mayor3(int a, int b) {
        int respuesta = 0;
        if(a > b){
            respuesta = a;
        }else {
            respuesta = b;
        }
        return respuesta;
    }
    public static int mayor3(int a, int b, int c) {
        int respuesta = 0;
        int mayor = mayor3(a,b);
        int mayor2 = mayor3(mayor,c);

        return mayor2;
    }
}
