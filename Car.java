package RideShare;
import java.util.*;
public class Car {
    //fields
    private int destination;
    private int currentLocation;
    private boolean direction;
    private ArrayList<Passenger> passengers;

    public Car(int myDestination, int start){
        destination = myDestination;
        currentLocation = start;
        direction = destination > currentLocation; //boolean comparison
        passengers = new ArrayList<Passenger>();
    }

    public String toString(){
        return super.toString() + "Dstn: " + destination + " CurLoc: " + currentLocation + " Right? " + direction + " Psngrs: " + passengers; //curloc = current location; psngrs = passengers
    }

    public void addPassenger(Passenger p){
        if(passengers.size() >= 3){
            System.out.println("error: no room!");
        } else if(p.getDirection() != direction) {
            System.out.println("error: trying to add person in wrong direction");
        } else {
            passengers.add(p);
        }
    }

    /**
     * Allows passengers on the car to unload when they're at their destination. If the passenger is at their destination, this method removes the passenger from the list of people in the car.
     * There may be multiple people eligible for drop off but this only returns one.
     * @return one Passenger eligible to be dropped off, null if nobody is available
     */
    public Passenger unload(){
        for(int i = 0; i < passengers.size(); i++){
            Passenger a = passengers.get(i);
            if(a.getDestination() == currentLocation || destination == currentLocation){
                passengers.remove(i); 
                return a;
            }
        }
        return null;

    }

    public void move(){
        if(currentLocation == destination){
            return; //gets out of the method, kicking yourself out before trying to move
        }
        if(direction){ //direction == true
            currentLocation++;
        } else {
            currentLocation--;
        }
    }

    public boolean hasRoom(){
        return passengers.size() < 3;
    }

    public int milesTraveled(){
        int traveled = 0;
        if(currentLocation == destination){
            for(Passenger a : passengers){
                traveled += Math.abs(a.getStart() - currentLocation);
            }
        }
        return traveled;
    }

    public int getLocation(){
        return currentLocation;
    }
    
}
