import java.util.Scanner;

public class divisionTryCatch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("ingresa un número");
        Scanner leer = new Scanner(System.in);
        String nroUno = leer.nextLine();

        System.out.println("ingresa otro número");

        String nroDos = leer.nextLine();


        try {
            double resultado = Double.parseDouble(nroUno)/Integer.parseInt(nroDos);
            System.out.println(resultado);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("no se puede dividir " + nroUno + "/" + nroDos);
        } finally {
            System.out.println("Fin del programa");
        }


    }
}
