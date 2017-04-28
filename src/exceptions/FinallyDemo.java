package exceptions;

/**
 * Created by Mihnea on 23.04.2017.
 */
public class FinallyDemo {
    // Throw an exception out of the method
    static void procA() {
        try {
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA finnaly");
        }
    }
    // Return from within a try block.
    static void procB() {
        try {
            System.out.println("Inside procB");
            return;
        }finally {
            System.out.println("procB finally");
        }
    }
    // Execute a try block normally
    static void procC() {
        try {
            System.out.println("Inside procC");
        } finally {
            System.out.println("procC finally");
        }
    }

    public static void main(String[] args) {
//        procA();
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception caught!");
        }
        procB();
        procC();
    }
}
