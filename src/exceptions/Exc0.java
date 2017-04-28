package exceptions;

/**
 * Created by Mihnea on 23.04.2017.
 */
public class Exc0 {
    public static void main(String[] args) {
        int d, a;
        try {
            d=0;
            a=42/d;
            System.out.println("This will not pe printed.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
        System.out.println("Aftermath.");
    }
}
