// Parent class
class Animal {
    protected String name;

    // Default constructor
    public Animal() {
        this.name = "Unknown Animal";
        System.out.println("Animal default constructor");
    }

    // Parameterized constructor
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal parameterized constructor: " + name);
    }

    // Method to display info
    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Subclass
class Dog extends Animal {
    private String breed;

    // Default constructor
    public Dog() {
        super();  // Call Animal default constructor
        this.breed = "Unknown Breed";
        System.out.println("Dog default constructor");
    }

    // Parameterized constructor
    public Dog(String name, String breed) {
        super(name);  // Call Animal parameterized constructor
        this.breed = breed;
        System.out.println("Dog parameterized constructor: " + breed);
    }

    // Override speak method
    @Override
    public void speak() {
        System.out.println(name + " barks.");
    }

    // Access parent method explicitly
    public void parentSpeak() {
        super.speak();
    }

    // Method to display all info
    public void display() {
        System.out.println("Name: " + name);  // accessing protected parent var
        System.out.println("Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Create dog1:");
        Dog dog1 = new Dog();
        dog1.display();
        dog1.speak();
        dog1.parentSpeak();

        System.out.println("\nCreate dog2:");
        Dog dog2 = new Dog("Buddy", "Golden Retriever");
        dog2.display();
        dog2.speak();
        dog2.parentSpeak();
    }
}
