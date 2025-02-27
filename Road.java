/**
 * Essentially the manager of the program.
 */

package RideShare;
import java.util.*;
public class Road {
    
    private ArrayList<Station> stationTracker = new ArrayList<Station>();
    private ArrayList<Car> carTracker = new ArrayList<Car>();

    public Road(int roadSize){
        stationTracker = new ArrayList<Station>();
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


