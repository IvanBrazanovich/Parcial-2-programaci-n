import java.lang.reflect.Array;

public class ejercicio50Matriz {
    public static void main(String[] args){
        int[][] matriz = {{1,1,1},{1,1,1},{1,1,1}};
        int acum = 0;

        for (int[] terna: matriz) {
            for(int valor: terna){
                acum += valor;
            }

        }
        System.out.println("La suma de todos los valores de la matriz es: " + acum);
    }
}
