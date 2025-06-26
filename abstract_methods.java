// Abstract class example
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Concrete method (with body)
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Interface example
interface Vehicle {
    // Abstract method (implicitly abstract, no body)
    void startEngine();

    // Since Java 8, interfaces can have default methods with body
    default void honk() {
        System.out.println("Honking!");
    }

    // Static method in interface
    static void info() {
        System.out.println("Vehicles are modes of transport.");
    }
}
