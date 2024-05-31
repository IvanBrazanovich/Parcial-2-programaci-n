public class multiplicacionDeMatrices {
    public static void main(String[] args) {
        int[][] matriz1 = {{1,1,3},{2,2,3}};
        int[][] matriz2 = {{1,1},{2,2},{2,2}};

        int[][] matrizm = multiplicarMatrices(matriz1, matriz2);
        for (int[] terna: matrizm) {
            for(int valor: terna){
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    // Método que multiplica la matriz
    public static int[][] multiplicarMatrices(int[][] m1, int[][] m2) {
        int filas1 = m1.length;
        int columnas1 = m1[0].length;
        int columnas2 = m2[0].length;

        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return resultado;
    }
}
