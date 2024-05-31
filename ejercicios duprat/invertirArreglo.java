//import java.lang.reflect.Array;

public class invertirArreglo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        
        int[] arrayInvertido = invertir(array);

        System.out.println("Arreglo invertido");

        for (int i : arrayInvertido) {
            System.out.print(i + " ");
        }
    }
    public static int[] invertir(int[] array) {
        int[] arrayInvertido = new int[array.length];
        
        for(int i = 0; i < array.length; i++){
            arrayInvertido[i] = array[(array.length - i - 1)];
        }
        return arrayInvertido;
        
    }
    
}
