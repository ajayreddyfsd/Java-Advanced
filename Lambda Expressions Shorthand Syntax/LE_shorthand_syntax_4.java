import java.util.ArrayList;

// FI.java
@FunctionalInterface
interface FI {
    ArrayList<String> create();
}

public class Example4 {
    public static void main(String[] args) {
        // Lambda creating new ArrayList instance
        FI le1 = () -> new ArrayList<>();
        ArrayList<String> list1 = le1.create();
        System.out.println("Lambda created list size: " + list1.size());  // Output: 0

        // Constructor method reference to ArrayList constructor
        FI le2 = ArrayList::new;
        ArrayList<String> list2 = le2.create();
        System.out.println("Method Reference created list size: " + list2.size());  // Output: 0
    }
}
