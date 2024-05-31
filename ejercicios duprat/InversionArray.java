public class InversionArray {
    public static void main(String[] args){
        int[] arreglo = {10,3,98,12,16};

        System.out.print("[");

        for (int i= arreglo.length - 1; i >=0 ; i--) {
            if(i == 0){
                System.out.print(arreglo[i]);
            } else {
                System.out.print(arreglo[i] + ", ");
            }


        }
        System.out.print("]");
    }

}
