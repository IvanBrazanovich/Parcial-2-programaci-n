public class ordernarNumerosArreglo {
    public static void main(String[] args){
        int[] numeros = {9,8,7,6,5,4,3,2,1};
        int mayor = 0;

        for (int j = 1; j < numeros.length - 1; j++){
            for (int i = 0; i < numeros.length - j - 1; i++){
                if (numeros[i] > numeros[i + 1]){
                    mayor = numeros[i];
                    numeros[i] = numeros[i];
                    numeros[i + 1] = mayor;
                }
            }
        }
        System.out.print(numeros);
    }
}
