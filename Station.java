package RideShare;
import java.util.*;
public class Station {
    
    private int placement;
    private ArrayList<Passenger> waitingLeft;
    private ArrayList<Passenger> waitingRight;
    private ArrayList<Passenger> completed;

    public Station(int myPlacement){
        placement = myPlacement;
        waitingLeft = new ArrayList<Passenger>();
        waitingRight = new ArrayList<Passenger>();
        completed = new ArrayList<Passenger>();

    }

    public void addPerson(Passenger a){
        if(a.getDestination() == placement){
            completed.add(a);
        } else if(a.getDirection() == true){
            waitingRight.add(a);
        } else {
            waitingLeft.add(a);
        }
    }

     /**
     * Method for giving back an individual that is going leftbound.
     * @return A single person traveling to the left -- returns null if nobody is available
     */

    public Passenger nextLeft(){
        if(waitingLeft.size() > 0){
            return waitingLeft.remove(0);
        } else {
            return null;
        }
    }

    /**
     * Method for giving back an individual that is going rightbound.
     * @return A single person traveling to the right -- returns null if nobody is available
     */
    public Passenger nextRight(){
        if(waitingRight.size() > 0){
            return waitingRight.remove(0);
        } else {
            return null;
        }
    }

    public boolean hasRight(){
        if(waitingRight.size() > 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean hasLeft(){
        if(waitingLeft.size() > 0){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Compiles how many people have arrived at their destination (the given station)
     * @return # of people @ correct destination
     */
    public int completedCount(){
        return completed.size();
    }

    public String toString(){
        return super.toString() + " place: " + placement + ", Leftbound:" + waitingLeft.toString() + ", Rightbound:" + waitingRight.toString() + ", Completed:" + completed.toString();
    }
}

