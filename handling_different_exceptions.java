public class SimpleExceptionHandling {
    public static void main(String[] args) {

        // ===== Example 1: try-catch (ArithmeticException) =====
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        // ===== Example 2: try-catch-finally (ArrayIndexOutOfBoundsException) =====
        int[] numbers = {1, 2, 3};
        try {
            System.out.println("Accessing 4th element: " + numbers[3]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        } finally {
            System.out.println("Finally block: This will always run.");
        }

        System.out.println("Program continues after both exceptions.");
    }
}
