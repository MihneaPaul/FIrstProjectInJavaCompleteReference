package exceptions;

/**
 * Created by Mihnea on 23.04.2017.
 */
import java.util.Random;
public class HandleError0 {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Random random = new Random();

        for(int i=0;i<5;i++) {
            try {
                b=random.nextInt(10);
                c=random.nextInt(10);
                a = 12345 / b/c;
            } catch (ArithmeticException e) {
                System.out.println("Division by zero.");
                a=0;
            }
            System.out.println("a: "+a+" b: "+b+" c: "+c);
        }
    }
}
