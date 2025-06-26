// Superclass
class Vehicle {
    private String brand;

    // Default constructor
    public Vehicle() {
        this.brand = "Unknown";
        System.out.println("Vehicle default constructor called");
    }

    // Parameterized constructor
    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle parameterized constructor called: " + brand);
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass
class Car extends Vehicle {
    private String model;

    // Default constructor (overrides Vehicle default constructor)
    public Car() {
        super();  // explicitly call superclass default constructor
        this.model = "Unknown Model";
        System.out.println("Car default constructor called");
    }

    // Parameterized constructor (overrides Vehicle parameterized constructor)
    public Car(String brand, String model) {
        super(brand);  // explicitly call superclass parameterized constructor
        this.model = model;
        System.out.println("Car parameterized constructor called: " + model);
    }

    public void displayDetails() {
        displayBrand();  // inherited method from Vehicle
        System.out.println("Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Create car1:");
        Car car1 = new Car();
        car1.displayDetails();

        System.out.println("\nCreate car2:");
        Car car2 = new Car("Toyota", "Corolla");
        car2.displayDetails();
    }
}
