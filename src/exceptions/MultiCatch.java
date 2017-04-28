package exceptions;

/**
 * Created by Mihnea on 24.04.2017.
 */
public class MultiCatch {
    public static void main(String[] args) {
        int a=0,b=0;
        int vals[]={1,2,3};

        try {
//            int result = a/b;
            vals[10]=20;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: "+e);
        }
        System.out.println("Aftermath.");
    }
}
