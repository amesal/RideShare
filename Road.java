/**
 * Essentially the manager of the program.
 */

package RideShare;
import java.util.*;
public class Road {
    
    private Station[] stationTracker = new Station[5]; //does this mean the stations will be named 0-4?
    private ArrayList<Car> carTracker = new ArrayList<Car>();
    private static final int NUMSTATIONS = 10; //bc you know you'll have 32 stations



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

    public void move(){
        //move all ELIGIBLE ppl for cars when going to gas station or @ night, unload/load passengers
        //update passengers first
        //load all people from status to cars
        //move all the cars


        //unload all eligible people from cars to stations

        for(Car c : carTracker){
                while(true){
                    Passenger p = c.unload();
                    if(p != null){ //means that someone is ready to be transferred into station
                        int location = c.getLocation();
                        stationTracker[location].addPerson(p);
                    } else {
                        break;
                    }

            }
        }

        for(Car c : carTracker){
            c.move();
        }

        //load all eligible people from stations to cars
        //going to be similar, but now looping through stations and putting in cars
    }
    public String displayStationStatus(){
        String stationLog = "Stations: ";
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


