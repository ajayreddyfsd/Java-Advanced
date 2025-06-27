// FI.java
@FunctionalInterface
interface FI {
    int compare(String a, String b);
}

public class Example5 {
    public static void main(String[] args) {
        // Lambda using instance method compareToIgnoreCase
        FI le1 = (a, b) -> a.compareToIgnoreCase(b);
        System.out.println("Lambda compare: " + le1.compare("apple", "Banana"));  // Negative number

        // Method reference to String instance method compareToIgnoreCase
        FI le2 = String::compareToIgnoreCase;
        System.out.println("Method Reference compare: " + le2.compare("apple", "Banana"));  // Negative number
    }
}
