/**
 * Essentially the manager of the program.
 */

package RideShare;
import java.util.*;
public class Road {
    
    private Station[] stationTracker; 
    private ArrayList<Car> carTracker = new ArrayList<Car>();
    public static final int NUMSTATIONS = 10; 



    public Road(){
        stationTracker = new Station[NUMSTATIONS]; //full of null values
        carTracker = new ArrayList<Car>();
        for(int i = 0; i < stationTracker.length; i++){
            stationTracker[i] = new Station(i);
        }

    }

    public void populateStations(int numPeople){
        for(int i = 0; i < numPeople; i++){
            int start = (int)(Math.random() * NUMSTATIONS);
            int stop = (int)(Math.random() * NUMSTATIONS);
            stationTracker[start].addPerson(new Passenger(stop, start));
        }
    }

    public void populateCars(int numCars){
        for(int i = 0; i < numCars; i++){
            int start = (int)(Math.random() * NUMSTATIONS);
            int stop = (int)(Math.random() * NUMSTATIONS);
            carTracker.add(new Car(stop, start));
        }
    }

    private void unloadSpecificCar(Car a){
        while(true){
                Passenger p = a.unload();
                if(p != null){ //means that someone is ready to be transferred into station
                int location = a.getLocation();
                stationTracker[location].addPerson(p);
                } else {
                    break;
                }
            }
        }
    

    public void move(){
        //unload all eligible people from cars to stations
        for(Car c : carTracker){
                unloadSpecificCar(c);

            }
        //moving car
        for(Car c : carTracker){
            c.move();
        }
        //loading all eligible people from station to car
        for(Car c : carTracker){
            loadSpecificCar(c);
        }
    }

    /**
     * Removes all eligible passengers from a station into a car (going in the correct direction & has room). Checks right and left directions.
     * @param c
     */
    public void loadSpecificCar(Car c){
        Station matching = stationTracker[c.getLocation()];
        if(matching.hasRight()){
            if(c.getDirection() && c.hasRoom()){
                Passenger p = matching.nextRight();
                c.addPassenger(p);

            }
        } else if(matching.hasLeft()){
            if(!c.getDirection() && c.hasRoom()){
                Passenger p = matching.nextLeft();
                c.addPassenger(p);
            }
        }
        
    }

    /**
     * Used to calculate percentage of passengers who reached their destination at the tester level. 
     * @return # of passengers that reached completion (reached intended destination)
     */
    public int completedPassengers(){
        int completed = 0;
        for(Station s : stationTracker){
            completed += s.completedCount(); 
        }
        return completed;

    }
    

    /**
     * toString()
     * @return String statement to be printed
     */
    public String displayStationStatus(){
        String stationLog = "Stations: " + "\n";
        for(Station a : stationTracker){
            stationLog += a.toString() + "\n";
        }
        stationLog += "Cars: \n";
        for(Car c : carTracker){
            stationLog += c.toString();
            stationLog += "\n";
        }
        return stationLog;
    }

    public String displaySummary(){
        String tripSummary = "";
        int totalMilesTraveled = 0;
        for(Car a : carTracker){
            totalMilesTraveled += a.milesTraveled();
        }
        return (tripSummary += totalMilesTraveled);

    }


}



