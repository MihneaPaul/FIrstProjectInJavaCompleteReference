/**
 * Created by Mihnea on 09.04.2017.
 */
public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsersIt;

    String getBrand(){
        return brand;
    }
    void setBrand(String brand){
        this.brand = brand;
    }
    int getNumOfPickups(){
        return numOfPickups;
    }
    void setNumOfPickups(int numOfPickups){
        this.numOfPickups = numOfPickups;
    }
    boolean getRockStarUsesIt() {
        return rockStarUsersIt;
    }
    void setRockStarUsersIt(boolean yesOrNo){
        this.rockStarUsersIt = yesOrNo;
    }
}
