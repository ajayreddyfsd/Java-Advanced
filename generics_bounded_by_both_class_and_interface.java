interface Flyable {
    void fly();
}

class Bird {
    void layEggs() {
        System.out.println("Lays eggs");
    }
}

class Eagle extends Bird implements Flyable {
    public void fly() {
        System.out.println("Eagle soars high");
    }
}

// T must extend Bird and implement Flyable
class Aviary<T extends Bird & Flyable> {
    T bird;

    Aviary(T bird) {
        this.bird = bird;
    }

    void describe() {
        bird.layEggs();
        bird.fly();
    }
}

public class Main3 {
    public static void main(String[] args) {
        Aviary<Eagle> eagleAviary = new Aviary<>(new Eagle());
        eagleAviary.describe();
        
        // ❌ Not allowed: Must extend Bird AND implement Flyable
        // Aviary<String> wrong = new Aviary<>("hello");
    }
}
