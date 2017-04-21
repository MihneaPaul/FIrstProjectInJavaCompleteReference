/**
 * Created by Mihnea on 07.04.2017.
 */
public class LoopVariations {
    public static void main(String[] args) {
        boolean done = false;
        int a = 6;
//        for (int i = 0; !done; i++) { // de la 0 pana la true <=> pana se face true.
//            System.out.println("This is a now " + a);
//            a--;
//            if (a <= 2) {
//                done = true;


        // will continue to run until the boolean variable done is set to true. IT DOES NOT TEST THE VALUE OF i.

//        for (; ; ) { //infinite loop

            System.out.println("\n");

            int i = 0;
            for (; !done; ) { //all parts of the for are moved out of it.
                System.out.println("i is " + i);
                if (i == 10) done = true;
                i++;
            }
            System.out.println("\n");

        }
//    }
}

