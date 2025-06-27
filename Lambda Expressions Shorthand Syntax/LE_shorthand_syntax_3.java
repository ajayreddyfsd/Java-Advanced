// FI.java
@FunctionalInterface
interface FI {
    int add(int a, int b);
}

public class Example3 {
    public static void main(String[] args) {
        // Lambda expression using Integer.sum static method
        FI le1 = (a, b) -> Integer.sum(a, b);
        System.out.println("Lambda result: " + le1.add(5, 7));  // Output: 12

        // Method reference to static method Integer.sum
        FI le2 = Integer::sum;
        System.out.println("Method Reference result: " + le2.add(10, 20));  // Output: 30
    }
}
