import com.sun.javafx.image.BytePixelSetter;
import java.util.Scanner;

public class probandoIf {
    public static void main(String[] args){
        int a = 6;
        int b = 9;
        int c = 1;

        if (a > b){

            if (b > c) {
                System.out.println(c + ", " + b + ", " + a);
            }
            else {
                if (a > c){
                    System.out.println(b + ", " + c + ", " + a);
                }
            }
        }
        else if (a > c){
            System.out.println(c + ", " + a + ", " + b);
        }
        else {
            System.out.println(a + ", " + b + ", " + c);
        }
    }
}
