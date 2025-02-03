Polymorphism
// Base class
class Vehicle {
    public void startEngine() {
        System.out.println("Starting vehicle engine...");
    }
}

// Derived class - Car
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}

// Derived class - Motorcycle
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with self-start button.");
    }
}

// Method to demonstrate polymorphism
public class VehicleTest {
    public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("Testing Car:");
        vehicleTestDrive(car);

        System.out.println("\nTesting Motorcycle:");
        vehicleTestDrive(motorcycle);
    }
}
