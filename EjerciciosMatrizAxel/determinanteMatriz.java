public class determinanteMatriz {
    public static void main(String[] args) {
        // Definimos una matriz de 2x2
        int[][] matriz = {
            {4, 3},
            {2, 1}
        };

        // Calculamos el determinante de la matriz 2x2
        int determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);

        // Mostramos el determinante
        System.out.println("El determinante de la matriz es: " + determinante);
    }
}
