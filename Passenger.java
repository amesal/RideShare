package RideShare;
import java.util.*;
public class Passenger{
    private int destination;
    private boolean direction; // true for goign right, false for left
    private int startLocation; //could be redundant to ask for every location along the way but starting location could be helpful

    //constructors
    public Passenger(int myDestination, int myStart){
        destination = myDestination;
        startLocation = myStart;
        if(destination < startLocation){
            direction = false; //bc wanting to go left
        } else {
            direction = true;
        }

        //could replace if/else with "direction = destination > startLocation"

    }

    public int getDestination(){
        return destination;
    }

    public boolean getDirection(){
        return direction;
    }

    public int getStart(){
        return startLocation;
    }

    public String toString(){
        return super.toString() + " St: " + startLocation + " Dstn: " + destination + " Right? " + direction; //boolean based on going right or not
    }

}
