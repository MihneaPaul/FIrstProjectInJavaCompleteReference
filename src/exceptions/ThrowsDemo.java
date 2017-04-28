package exceptions;

/**
 * Created by Mihnea on 23.04.2017.
 */
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        try {
            System.out.println("Inside the throwOne");
            throw new IllegalAccessException("Bye!");
        } catch (IllegalAccessException e) {
            System.out.println("Hello again");
            throw e;
        }
    }

    static void throwTwo() /*throws NullPointerException*/ {
        try {
            throw new NullPointerException("Goodbye!");
        } catch (NullPointerException e) {
            System.out.println("Hello");
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            throwOne();

        }catch (IllegalAccessException e){
            System.out.println("Caught "+e);
        }
        finally {
            try {
                throwTwo();
            }catch (NullPointerException e) {
                System.out.println("Caught "+e+" too.");
            }
            finally {
                System.out.println("Inner finally.");
            }
            System.out.println("Outer finally.");
        }

    }
}
