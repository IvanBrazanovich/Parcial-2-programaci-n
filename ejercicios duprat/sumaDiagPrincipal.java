import java.util.Stack;

public class sumaDiagPrincipal {

    public static void main(String[] args) {
        int[][] matriz = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        Stack<Integer> valoresDiagonal = sumarDiagonalPrincipal(matriz);
        
        for (Integer integer : valoresDiagonal) {
            System.out.println("Valores de la diagonal: " + integer);
        }
        

    }

    public static Stack<Integer> sumarDiagonalPrincipal(int[][] matriz){
        int suma = 0;
        Stack<Integer> pila = new Stack<>();
        
        for (int i = 0; i < matriz.length; i++) {
           suma += matriz[i][i];
           pila.push(matriz[i][i]);
        }
        return pila;
      
    }
}
