package exceptions;

/**
 * Created by Mihnea on 23.04.2017.
 */
public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        }catch (NullPointerException e) {
            System.out.println("Caught inside demproc.");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}
