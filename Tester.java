package RideShare;

//have to reset traveled at the start of the program when running a new simulation (ask how to do this)
public class Tester {
    public static void main(String[] args){
        System.out.println("Running the RideShare Simulation!");
        System.out.println("");
        System.out.println("Establishing 3 stations...");


        System.out.println("Generating non-random cars with locations and destinations...");
        //need to make this in the car class

        System.out.println("Generating non-random passengers with locations and destinations...");
        Passenger a = new Passenger(5, 7);
        Passenger b = new Passenger(2, 0);
        Passenger c = new Passenger(10, 24);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        Car n = new Car(5, 9);
        System.out.println(n);
        n.addPassenger(a);
        System.out.println(n);
        System.out.println(n.unload());
    }
    
}
