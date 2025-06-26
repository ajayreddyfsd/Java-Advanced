// Bounded generic: T must be a subclass of Number
class NumberBox<T extends Number> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void printDoubleValue() {
        System.out.println("Double Value: " + value.doubleValue());
    }
}

public class BoundedGenericExample {
    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.set(42);
        intBox.printDoubleValue(); // 42.0

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.set(3.14);
        doubleBox.printDoubleValue(); // 3.14

        // ❌ Not allowed: String is not a subclass of Number
        // NumberBox<String> errorBox = new NumberBox<>(); // Error
    }
}
