package Practicals;
abstract class Vehicles {
    // Abstract method (no body)
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("The vehicle has stopped.");
    }
}

class Cars extends Vehicles {
    // Implementing the abstract method
    @Override
    void start() {
        System.out.println("The car is starting.");
    }
}

class Bikes extends Vehicles {
    // Implementing the abstract method
    @Override
    void start() {
        System.out.println("The bike is starting.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Vehicles myCar = new Cars();
        Vehicles myBike = new Bikes();

        myCar.start(); // Outputs: The car is starting.
        myCar.stop();  // Outputs: The vehicle has stopped.

        myBike.start(); // Outputs: The bike is starting.
        myBike.stop();  // Outputs: The vehicle has stopped.
    }
}



