/**
 * Created by Mihnea on 08.04.2017.
 */
public class Stack {
    private int stck[] = new int[10];
    private int tos;

    // Initialize top-of-stack
    Stack() {
        tos=-1; // index of top of the stack. -1 => empty stack
    }

    public int getTos() {
        return tos;
    }

    public void setTos(int tos) {
        this.tos = tos;
    }

    // Push an item onto the stack
    void push(int item) {
        if(tos==9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;

    }

    // Pop and item from the stack
    int pop(){
    if(tos < 0 ) {
        System.out.println("Stack underflow.");
        return 0;
    }
    else return stck[tos--];
    }
}
 class TestStack {
     public static void main(String[] args) {
         Stack myStack1 = new Stack();
         Stack myStack2 = new Stack();

         // push some numbers onto the stack
         for(int i=0;i<10;i++) myStack1.push(i);
         for(int i=10;i<20;i++) myStack2.push(i);

         // pop those numbers off the stack
         System.out.println("Stack in myStack1:");
         for(int i=0;i<10;i++) System.out.println(myStack1.pop());
         System.out.println("Stack in myStack2:");
         for(int i=0;i<10;i++) System.out.println(myStack2.pop());

         myStack1.setTos(-5);
//         myStack1.getTos();
         System.out.println(myStack1.getTos());
     }
 }
