/**
 * Created by Mihnea on 08.04.2017.
 */
public class Box {
    double width;
    double height;
    double depth;

    // Constructor
    Box(double width, double height, double depth) {
        System.out.println("Constructing the Box...");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = depth = height = len;
    }
    Box(Box ob) { // pass Object to Constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    public static void main(String[] args) {
        Box myBox = new Box(10,20,15); // Making new Box object
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        Box myClone = new Box(myBox);
        double vol;
//        myBox.width = 10;
//        myBox.height = 20;
//        myBox.depth = 15;

        vol = myBox.volume(); // store the returned volume into variable vol.
        System.out.println("The volume of my Box is "+vol);
        vol = myBox2.volume();
        System.out.println("The volume of my second Box is "+myBox2.volume());
        vol = myCube.volume();
        System.out.println("The volume of my Cube is "+vol);
        vol = myClone.volume();
        System.out.println("The volume of Clone Box is "+vol);
    }
    // compute volume method
    double volume() {
        return width * height * depth;
//            System.out.println("Volume is " + width * height * depth);
    }
//    void setDim(double w, double h, double d){
//        width = w;
//        height = h;
//        depth = d;
//    }



}


