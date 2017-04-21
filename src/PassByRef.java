/**
 * Created by Mihnea on 09.04.2017.
 */
public class PassByRef {
    int a, b;

    PassByRef(int i, int j) {
        a = i;
        b = j;
    }

    // pass and object
    void meth(PassByRef o) {
        o.a *= 2;
        o.b /= 2;
    }


        public static void main(String[] args) {
            PassByRef ob = new PassByRef (15,20);
            System.out.println(ob.a+" "+ob.b);
            ob.meth(ob);
            System.out.println(ob.a+" "+ob.b);
    }
}


