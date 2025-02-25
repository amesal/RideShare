package RideShare;
import java.util.*;
public class Car {
    //fields
    private int destination;
    private int currentLocation;
    private boolean direction;
    private ArrayList<Passenger> customers;

    public Car(int myDestination, int start){
        destination = myDestination;
        currentLocation = start;
        direction = destination > currentLocation; //boolean comparison
        customers = new ArrayList<Passenger>();
    }

    public String toString(){
        return super.toString() + "Dstn: " + destination + " CurLoc: " + currentLocation + " Right? " + direction + " Psngrs: " + customers; //curloc = current location; psngrs = passengers
    }

    public void addPassenger(Passenger p){
        if(customers.size() >= 3){
            System.out.println("error: no room!");
        } else if(p.getDirection() != direction) {
            System.out.println("error: trying to add person in wrong direction");
        } else {
            customers.add(p);
        }
    }

    /**
     * Allows passengers on the car to unload when they're at their destination. If the passenger is at their destination, this method removes the passenger from the list of people in the car.
     * There may be multiple people eligible for drop off but this only returns one.
     * @return one Passenger eligible to be dropped off, null if nobody is available
     */
    public Passenger unload(){
        for(int i = 0; i < customers.size(); i++){
            Passenger a = customers.get(i);
            if(a.getDestination() == currentLocation){
                customers.remove(i); 
                return a;
            }
        }
        return null;

    }


    public boolean hasRoom(){
        return customers.size() < 3;
    }
    
}
