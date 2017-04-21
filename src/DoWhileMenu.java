/**
 * Created by Mihnea on 07.04.2017.
 */
import java.io.IOException;
public class DoWhileMenu {
    public static void main(String[] args) {

            char choice=0;
           try {
               do {
                   System.out.println("Help on: ");
                   System.out.println("  1. if");
                   System.out.println("  2. switch");
                   System.out.println("  3. while");
                   System.out.println("Choose one: ");
                   choice = (char)System.in.read();
               }
               while (choice<'1' || choice > '5');
           }
        catch (IOException e){
            System.out.println("Error reading from user");
        }
        switch (choice) {
            case '1':
                System.out.println("adas");
                break;
            case '2':
                System.out.println("afjdofsd");
                break;
            case '3':
                System.out.println("aoe09urwe98v249n");
                break;
        }
    }
}
