/**
 * Created by Mihnea on 07.04.2017.
 */
public class For_Each {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            System.out.println("Value is " + x);
            sum = sum + x;
            if (x == 8) break;
        }
        System.out.println("Sum of first 8 elements is " + sum);
        System.out.println("\n");
        for (int x = 0; x < nums.length; x++) {
            System.out.print(x + " ");
            x = x * 2;
        }
        System.out.println();
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println("\n");

        int nums1[][] = new int[3][5];

        //give some values
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1[i].length; j++) {
                nums1[i][j] = (i + 1) * (j + 1);
            }
        }

        //use for-each for to display and sum the values
        for (int x[] : nums1) {
            for (int y : x) {
                System.out.println("Value is " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
        System.out.println("\n");

        int val = 254;
        boolean found = false;

        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("Value found!");
        else System.out.println("Value not found!");

        System.out.println("\n");


        for (int i = 1; i <= 6; i = i + 1) { // al doilea for se executa de i ori. prima data face 12 puncte, apoi 11 etc.
            for (int j = 1; j <= (6 - i); j = j + 1) {
                System.out.print(" ");
            }


            for (int z = 0; z < (i + (i - 1)); z++) {

                System.out.print("*");

            }

            for (int p = 1; p <= (6 - i); p++) {

                System.out.print(" ");

            }
            System.out.println();
        }
        System.out.println("\n");


        for (int x = 1; x <= 8; x++) {

            for (int y = 1; y <= (8 - x); y++) {

                System.out.print(" ");

            }

            for (int z = 0; z < (x + (x - 1)); z++) {

                System.out.print("^");

            }

            for (int p = 1; p <= (8 - x); p++) {

                System.out.print(" ");

            }

            System.out.println();
        }
        for(int k = 1;k<=2;k++){
            for(int j=0;j<=5;j++) {
                System.out.print(" ");
            }
            for(int i=0;i<3;i++) {
                System.out.print("*");
            }
            for(int g=0;g<=14;g++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
