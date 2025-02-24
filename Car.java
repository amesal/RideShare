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
        return super.toString() + "Destination: " + destination + " Current location: " + currentLocation + " Going right? " + direction + " Passengers: " + customers;
    }

    public void addPassenger(Passenger p){
        if(customers.size() >= 3){
            System.out.println("error: no room!");
        } else {
            customers.add(p);
        }
    }

    public boolean hasRoom(){
        return customers.size() < 3;
    }
    
}
