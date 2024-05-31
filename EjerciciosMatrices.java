import java.lang.reflect.Array;
import java.util.ArrayList;

public class matriz01 {
    public static void main(String[] args) {

        // Escribe un programa que calcule la suma de todos los elementos en una matriz
        // de enteros.
        ArrayList<ArrayList<Integer>> dobleMatriz = new ArrayList<>();
        ArrayList<ArrayList<Integer>> secondDobleMatriz = new ArrayList<>();
        populateMatrix(dobleMatriz, 3, 3);
        populateMatrix(secondDobleMatriz, 3, 3);
        showMatrix(dobleMatriz);

        int valorSuma = calculateSumOfAllMatrix(dobleMatriz);

        transpuestaMatrix(dobleMatriz);

        calcularMultiplicacion(dobleMatriz, secondDobleMatriz);

    }

    public static int calculateSumOfAllMatrix(ArrayList<ArrayList<Integer>> matrix) {

        int counter = 0;

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(0).size(); j++) {
                counter = counter + matrix.get(i).get(j);
            }
        }

        return counter;

    }

    public static void transpuestaMatrix(ArrayList<ArrayList<Integer>> matrix) {
        ArrayList<ArrayList<Integer>> newMatrix = new ArrayList<>();

        // Populate the arrayList
        for (int i = 0; i < matrix.size(); i++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            newMatrix.add(newRow);
        }

        // Entrando a cada row
        for (int i = 0; i < matrix.size(); i++) {
            int counter = 0;

            for (Integer number : matrix.get(i)) {
                newMatrix.get(counter).add(number);
                counter++;
            }

        }
        System.out.println("HOLA BROTHER");
        showMatrix(newMatrix);

    }

    public static void populateMatrix(ArrayList<ArrayList<Integer>> matrix, int col, int row) {

        int counter = 0;

        for (int i = 0; i < row; i++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                newRow.add(counter);
                counter++;
            }
            matrix.add(newRow);
        }

    }

    public static void showMatrix(ArrayList<ArrayList<Integer>> matrix) {

        for (int i = 0; i < matrix.size(); i++) {
            System.out.println(matrix.get(i));
        }

        System.out.println("===============");
    }

    public static void calcularMultiplicacion(ArrayList<ArrayList<Integer>> matrix,
            ArrayList<ArrayList<Integer>> secondMatrix) {
        if (matrix.get(0).size() != secondMatrix.size()) {
            System.out.println("No se puede hacer eso brother ");
            return;
        }

        showMatrix(matrix);
        showMatrix(secondMatrix);

        ArrayList<ArrayList<Integer>> newMatrix = new ArrayList<>();

        // Populate matrix
        for (int i = 0; i < matrix.size(); i++) {
            ArrayList<Integer> row = new ArrayList<>();
            newMatrix.add(row);
        }

        for (int i = 0; i < matrix.size(); i++) {
            for (int w = 0; w < secondMatrix.get(0).size(); w++) {
                int valor = 0;
                for (int j = 0; j < matrix.get(0).size(); j++) {
                    valor = valor + (matrix.get(i).get(j) * secondMatrix.get(j).get(w));
                }

                newMatrix.get(i).add(valor);
            }
        }

        showMatrix(newMatrix);

    }

}
