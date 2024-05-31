public class multiplicaciónMatriz {
    public static void main(String[] args) {
        // Definimos dos matrices de 3x3
        int[][] matriz1 = {
            {1, 2, 3},
            {2, 2, 3}
        };

        int[][] matriz2 = {
            {1, 2},
            {2, 1},
            {3, 2}
        };

        // Verificamos que las matrices se pueden multiplicar
        if (matriz1[0].length != matriz2.length) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            return;
        }

        int[][] resultado = new int[matriz1.length][matriz2[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("La matriz resultado es:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
