class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Generic class that accepts only Animal or its subclasses
// which means T can be either Animal class or any of the Animal's sub classes
class AnimalCage<T extends Animal> {
    T animal;

    AnimalCage(T animal) {
        this.animal = animal;
    }

    void makeSound() {
        animal.speak();
    }
}

public class Main1 {
    public static void main(String[] args) {
        AnimalCage<Dog> dogCage = new AnimalCage<>(new Dog());
        dogCage.makeSound(); // Animal speaks

        // ❌ Not allowed: String is not an Animal
        // AnimalCage<String> invalid = new AnimalCage<>("Hi"); // Error
    }
}
