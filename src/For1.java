/**
 * Created by Mihnea on 07.04.2017.
 */
public class For1 {
    public static void main(String[] args) {
        int n;
        for(n=10;n>0;n--){
            System.out.println("Tick "+n);
        }
        System.out.println("\n");

        int num;
        boolean isPrime;
        num=2;
        if (num<2) isPrime = false;
        else isPrime = true;
        for(int i=2;i<=num/i;i++){
            if((num%i)==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Prime");
        else System.out.println("Not Prime");

        System.out.println("\n");

        int a,b;
        for(a=1,b=4;a<=b;a++,b--){
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }
    }
}
