public class Car {
    // Instance variables (each object has its own)
    private String make;
    private String model;
    private int year;
    
    // Class (static) variable (shared by all objects)
    private static int numberOfCars = 0;
    
    // Default constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        numberOfCars++;
    }
    
    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        numberOfCars++;
    }
    
    // Instance method
    public void displayInfo() {
        System.out.println("Car: " + make + " " + model + " (" + year + ")");
    }
    
    // Getter for instance variable
    public String getMake() {
        return make;
    }
    
    // Setter for instance variable
    public void setMake(String make) {
        this.make = make;
    }
    
    // Static method
    public static int getNumberOfCars() {
        return numberOfCars;
    }
    
    // main method
    public static void main(String[] args) {
        // Create a car using default constructor
        Car car1 = new Car();
        car1.displayInfo(); // Car: Unknown Unknown (0)
        
        // Create a car using parameterized constructor
        Car car2 = new Car("Toyota", "Corolla", 2020);
        car2.displayInfo(); // Car: Toyota Corolla (2020)
        
        // Access static method
        System.out.println("Total cars created: " + Car.getNumberOfCars()); // Total cars created: 2
    }
}
