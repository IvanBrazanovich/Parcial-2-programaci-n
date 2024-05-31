// entrada estandar se refiere a entrada por consola
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){

        System.out.println("Ingrese el primer numero");
        Scanner entrada1 = new Scanner(System.in);
        double num1 = entrada1.nextDouble();

        System.out.println("Ingrese el segundo numero");
        Scanner entrada2 = new Scanner(System.in);
        double num2 = entrada2.nextDouble();


        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

    }
}
