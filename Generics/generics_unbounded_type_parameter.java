// Unbounded generic class
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void displayType() {
        System.out.println("Type of T is: " + value.getClass().getName());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello World");
        stringBox.displayType();  // java.lang.String

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        intBox.displayType();     // java.lang.Integer

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(99.99);
        doubleBox.displayType();  // java.lang.Double

        Box<Book> bookBox = new Box<>();
        bookBox.set(new Book("Java for Beginners"));
        bookBox.displayType();    // Book
    }
}

// Sample custom class
class Book {
    String title;
    Book(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
}
