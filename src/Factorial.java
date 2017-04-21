/**
 * Created by Mihnea on 09.04.2017.
 */
public class Factorial {
    // this is a RECURSIVE method
    long fact(long n){
        long result;

        if(n==1) return 1;
        result = fact(n-1)*n;
        System.out.print(n+" * ");
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(" = Factorial of 3 is "+f.fact(3));
        System.out.println(" = Factorial of 30 is "+f.fact(20));
        System.out.println(" = Factorial of 300 is "+f.fact(5));
    }
}
