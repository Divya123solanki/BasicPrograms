class Vehicle {
    // Method to start the vehicle (to be overridden by subclasses)
    public void start() {
        System.out.println("The vehicle is starting.");
    }
}

// Car class inheriting Vehicle
class Car extends Vehicle {
    // Overriding start() method for Car
    @Override
    public void start() {
        System.out.println("The car is starting: Vroom Vroom");
    }
}

// Bike class inheriting Vehicle
class Bike extends Vehicle {
    // Overriding start() method for Bike
    @Override
    public void start() {
        System.out.println("The bike is starting: Broom Broom");
    }
}

// Main class
public class Inheritance4 {
    public static void main(String[] args) {
        // Using polymorphism to create Vehicle references
        Vehicle vehicle;

        // Creating a Car object and calling start()
        vehicle = new Car();
        System.out.println("Car:");
        vehicle.start();

        // Creating a Bike object and calling start()
        vehicle = new Bike();
        System.out.println("Bike:");
        vehicle.start();
    }
}