import java.util.ArrayList;

public class obtenerPares {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> nuevoArray = getNumerosPares(array);
        System.out.println("Los numeros pares son: ");
        
        for (int i : nuevoArray) {
            System.out.println(i);
        }

    }
    public static ArrayList<Integer> getNumerosPares(int[] array){
        ArrayList<Integer> nuevoArray = new ArrayList<>();
        for(int numero : array){
            if(numero % 2 == 0){
                nuevoArray.add(numero);
            }
        }
        
        return nuevoArray;
    }
}
