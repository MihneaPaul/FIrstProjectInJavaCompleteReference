/**
 * Created by Mihnea on 09.04.2017.
 */
public class GoodDog {
    public int size;
    public String name;

    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    GoodDog(int size, String name){
        this.size = size;
        this.name = name;
    }
    void bark(){
        if(size>60){
            System.out.println(getName() +" says Wooof! Wooof!");
        }
        else if(size>14){
            System.out.println(getName() +" says Ham! Ham");
        }
        else {
            System.out.println(getName() +" says Meow! Meow!");
        }
    }
}

class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog dog1 = new GoodDog(70,"Lola");
        GoodDog dog2 = new GoodDog(8,"Lucky");
        GoodDog dog3 = new GoodDog(20,"Blackie");
//        dog1.setSize(70);
//        dog1.setName("Lucky");
//        dog2.setSize(8);
//        dog2.setName("Blackie");
//        dog3.setSize(20);
//        dog3.setName("Lola");

        System.out.println(dog1.getName()+": "+dog1.getSize());
        System.out.println(dog2.getName()+": "+dog2.getSize());
        System.out.println(dog3.getName()+": "+dog3.getSize());
        System.out.println();
        dog1.bark();
        dog2.bark();
        dog3.bark();

        dog2.setName("Yusuf Islam");
        System.out.println();
        System.out.println("I renamed my second Dog to "+ dog2.getName());
        dog2.bark();
    }
}
