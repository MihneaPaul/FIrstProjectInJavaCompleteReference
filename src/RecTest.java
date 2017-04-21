/**
 * Created by Mihnea on 09.04.2017.
 */
public class RecTest {
    int values[];

    RecTest(int i){
        values = new int[i];
    }

    // display array -- recursively
    void printArray(int i){
        if(i==0) return;
        else printArray(i-1);
        System.out.println("["+(i-1)+"] "+values[i-1]);
    }
}
class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(12);
        int i;
        for(i=0;i<12;i++) ob.values[i]=i;
        ob.printArray(12);
    }
}
