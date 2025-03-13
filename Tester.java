package RideShare;
import java.util.*;

//have to reset traveled at the start of the program when running a new simulation (ask how to do this)
public class Tester {
    public static void main(String[] args){
        System.out.println("");
        System.out.println("Running the RideShare Simulation!");
        System.out.println("Establishing 10 stations...");

        Road r = new Road();
        System.out.println("");
        System.out.println(r.displayStationStatus());
        r.populateStations(5);
        r.populateCars(5);
        System.out.println("_____________");
        System.out.println("Generating non-random cars with locations and destinations...");
        System.out.println("");
        System.out.println(r.displayStationStatus());

        System.out.println("_____________");
        System.out.println("Now adding passengers into cars!");
        System.out.println("");

        System.out.println(r.displayStationStatus());
        System.out.println("_____________");

  
    
        for(int i = 1; i <= Road.NUMSTATIONS; i++){
                System.out.print("Stage " + i + ":");
                System.out.println("");
                r.move();
                System.out.println(r.displayStationStatus());
                System.out.println("_____________");
            }
            
        System.out.println("The percentage of passengers that were brought to their chosen destination was " + 
        (double) r.completedPassengers() / 5 * 100 + "%");
        System.out.println("");

    }


       



    }
    
    

