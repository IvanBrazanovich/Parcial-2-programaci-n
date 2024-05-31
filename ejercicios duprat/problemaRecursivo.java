public class problemaRecursivo {
    // Contar las Ovejas: Escribe una función recursiva que cuente el número de "ovejas"
    // en un array de booleanos. Cada elemento del array representa una oveja, y si es true,
    // significa que la oveja está presente. La función debe retornar el total de ovejas presentes.


    public static int contarOvejas(int indice, boolean[] ovejas){
        //int i = 0;

        if(indice == ovejas.length){
            return 0;
        }
        if (ovejas[indice]){
            return 1 + contarOvejas(indice + 1, ovejas);
        } else {
            return contarOvejas(indice + 1, ovejas);
        }
    }

    public static void main(String[] args) {


        boolean[] ovejas = {true,true,false,false,true,true};
        //int cantidad = 0;
        //int indice = 5;

        int cantidad= contarOvejas(0, ovejas);
        System.out.println("La cantidad de ovejas es " + cantidad);

    }

}
