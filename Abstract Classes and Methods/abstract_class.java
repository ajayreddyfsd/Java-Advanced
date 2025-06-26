// An abstract class is kind of like a middle ground between a regular class and an interface. It can have:
// Abstract methods (methods without a body, which subclasses must implement)
// Concrete methods (methods with implementation)
// Variables (instance variables or constants)

abstract class Animal {
    // Instance variable
    protected String name;

    // Constant
    public static final int LEGS = 4;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (no body) - must be implemented by subclasses
    public abstract void makeSound();

    // Concrete method (has a body)
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Concrete method with default behavior that can be overridden
    public void move() {
        System.out.println(name + " is moving.");
    }

    // Getter method for name
    public String getName() {
        return name;
    }
}
