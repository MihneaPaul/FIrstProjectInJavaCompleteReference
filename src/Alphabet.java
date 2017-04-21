/**
 * Created by Mihnea on 08.04.2017.
 */
import java.util.Objects;
import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a letter: ");
        char c = scanner.next(".").charAt(0);
        String z = "z";
        String Z = "Z";
        if (Objects.equals(c, z)) {
            System.out.println("z");
        } else if (Objects.equals(c, Z)) {
            System.out.println("A");
        } else {
            System.out.println("Your new letter is: " + (++c));
        }
    }
}
