public class matrizNombres {
    public static void main(String[] args){

        String[][] matriz = {
                { "tati", "2", "4", "8", "5"},
                { "manuela", "5", "5", "7", "6" },
                { "carla", "4", "5", "2", "8"},
        };



        for (String[] fila: matriz){
            for (String elemento: fila){
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }
    }
}
