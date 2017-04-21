/**
 * Created by Mihnea on 09.04.2017.
 */
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class User {
    String username;
    String password;

    public User(){
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString(){
        return "User{"+
                "Username' = " + username + '\'' +
                ", password' = " + password + '\'' +
                '}';
    }
}

 class Login {
     public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
         String clientInputUsername;
         String clientInputPassword;
         boolean loginOk = false;

         List<User> UserList = new ArrayList<User>();

         User u1 = new User("david", "1234");
         User u2 = new User("mihnea", "5678");
         User u3 = new User("andra", "cartof");

         UserList.add(u1);
         UserList.add(u2);
         UserList.add(u3);

         boolean b = false;

         do {
             System.out.println("Login Page: \n");
             System.out.println("--------------- \n");
             System.out.println("Username: ");
             clientInputUsername = scanner.nextLine();
             System.out.println("Password: ");
             clientInputPassword = scanner.nextLine();

             for (User user : UserList) {
                 if (clientInputUsername.equals(user.getUsername()) && clientInputPassword.equals(user.getPassword()))
                     loginOk = true;
             }

             if (loginOk) {
                 System.out.println("Login successful!");

                     break;

             } else {
                 System.out.println("Login failed !");
             }
         }
             while (!b) ;

     }
 }
