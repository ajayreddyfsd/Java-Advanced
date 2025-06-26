// Define an interface
interface Animal {
    void sound();   // abstract method (no body)
    void eat();
}

// Class implementing the interface
class Dog implements Animal {
    // Must provide implementation for all interface methods
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Dog barks
        dog.eat();    // Dog eats bones
    }
}
