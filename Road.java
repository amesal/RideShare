/**
 * Essentially the manager of the program.
 */

package RideShare;
import java.util.*;
public class Road {
    
    private Station[] stationTracker = new Station[5]; //does this mean the stations will be named 0-4?
    private ArrayList<Car> carTracker = new ArrayList<Car>();

    public Road(){
        stationTracker = new Station[5];
        carTracker = new ArrayList<Car>();

    }

    public String displayStationStatus(){
        String stationLog = "";
        for(Station a : stationTracker){
            stationLog += a.toString() + "\n";
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


