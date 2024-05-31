public class SumaElementosMatriz {
    public static void main(String[] args) {
        // Definimos una matriz de 3x3
        int[][] matriz = {
            {2, 2, 2},
            {2, 2, 2},
            {2, 2, 2}
        };

        // Inicializamos la variable que contendrá la suma de los elementos
        int suma = 0;

        // Recorremos la matriz y sumamos los elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        // Mostramos la suma de los elementos
        System.out.println("La suma de todos los elementos de la matriz es: " + suma);
    }
}

