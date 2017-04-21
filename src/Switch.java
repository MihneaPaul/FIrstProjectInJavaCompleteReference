/**
 * Created by Mihnea on 07.04.2017.
 */
public class Switch {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            switch (i){
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
            }
        }
        System.out.println("\n");
        for(int i=0;i<12;i++){
            switch (i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10");
                    break;
                default:
                    System.out.println("i is 10 or more");
            }
        }
        System.out.println("\n");
        int month = 4;
        String season;
        switch(month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
                default:
                    season = "Bogus Month";
        }
        System.out.println("April is in the "+season+".");
        System.out.println("\n");

        String str = "two";
        switch(str){
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");

        }
    }
}
