package RideShare;
import java.util.*;

//have to reset traveled at the start of the program when running a new simulation (ask how to do this)
public class Tester {
    public static void main(String[] args){
        Road r = new Road();
        System.out.println(r.toString());
        r.populateStations(5);
        r.populateCars(5);
        System.out.println("_____________");


        
        System.out.println("Running the RideShare Simulation!");
        System.out.println("");
        System.out.println("Establishing 10 stations...");


        System.out.println("Generating non-random cars with locations and destinations...");
        System.out.println("");
        System.out.println("Station Status");

        

        Station a = new Station(0);
        Station b = new Station(1);
        Station c = new Station(2);
        Station d = new Station(3);
        Station e = new Station (4);
        Station f = new Station(5);
        Station g = new Station (6);
        Station h = new Station (7);
        Station i = new Station (8);
        Station j = new Station(9);
        Station k = new Station(10);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        Car n = new Car(5, 9);
        Car o = new Car(8, 1);
        Car p = new Car(4, 10);
        Car q = new Car(10, 7);
        System.out.println("");
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println("");
        System.out.println("Calling the .move() process for all cars");
        n.move();
        o.move();
        p.move();
        q.move();
        System.out.println("");
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);

        System.out.println("");
        System.out.println("Again calling the .move() process for all cars");
        n.move();
        o.move();
        p.move();
        q.move();
        System.out.println("");
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println("");
        
        System.out.println("Now adding passengers!");

        System.out.println("Generating non-random passengers with locations and destinations...");
        System.out.println("");
        System.out.println("Station Status");
        Passenger s = new Passenger(5, 7);
        Passenger t = new Passenger(2, 0);
        Passenger u = new Passenger(10, 24);
        //how to use for loop on 10 stations bc should be adding in passengers here

        System.out.println(s);
        System.out.println(t);
        System.out.println(u);


    }
    }
    

