import java.util.Scanner;

public class ContarPalabrasQueEmpiezanConH {
    public static void main(String[] Args){

        System.out.println("Ingrese un texto");
        Scanner sc = new Scanner(System.in);

        String texto = sc.next();
        //int i = 0;
        char CA = ' ';
        int cont = 0;

        for(int i = 0; i < texto.length(); i++) {

            if ((texto.charAt(i) == 'H') && (CA == ' ')){
                cont = cont + 1;
            }
            CA = texto.charAt(i);
        }
        System.out.println("Hay " + cont + " palabras con H");
    }
}
