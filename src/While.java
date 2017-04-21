/**
 * Created by Mihnea on 07.04.2017.
 */
public class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {

            System.out.println("tick "+n);
            n--;
        }
        System.out.println("\n");

        int i, j;
        j=200;
        i=100;
        while(++i < --j);
        {
            System.out.println("Midpoint is " + i);
        }
        System.out.println("\n");

            int a = 10;
            do {
                System.out.println("tick "+a);
                a--;
            }
            while(a>0);
    }
}
