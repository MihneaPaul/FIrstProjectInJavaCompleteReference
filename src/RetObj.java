import com.sun.org.apache.bcel.internal.generic.RET;
import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Mihnea on 09.04.2017.
 */
public class RetObj {
    int a;

    RetObj(int i){
        a=i;
    }
    RetObj incrByTen(){
        RetObj temp = new RetObj(a+12);
            return temp;
        }
    }
class WithMain {
    public static void main(String[] args) {
        RetObj ob1 = new RetObj(2);
        RetObj ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: "+ob1.a);
        System.out.println("ob2.a: "+ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: "+ob2.a);
    }
}
