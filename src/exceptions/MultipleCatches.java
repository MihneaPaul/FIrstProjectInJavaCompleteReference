package exceptions;

/**
 * Created by Mihnea on 23.04.2017.
 */
public class MultipleCatches {
    public static void main(String[] args) {
        try {
//            int a = args.length;
//            System.out.println("a = "+a);
//            int b = 42/a;
            int c[] = new int[2];
            for(int i=0;i<=c.length+1;i++)
            c[42]=99;
        } catch (ArithmeticException e) {
//            System.out.println("Divide by 0: "+e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: "+e);
        }
        System.out.println("Aftermath.");
    }
}
