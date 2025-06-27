@FunctionalInterface
interface FI {
    int operate(int a, int b);
}

public class LambdaMethodArgumentExample {

    // Method that takes a FI functional interface as an argument
    public static int compute(int x, int y, FI operation) {
        // Calls the operate method of the functional interface (lambda)
        return operation.operate(x, y);
    }

    public static void main(String[] args) {
        // Lambda to add two numbers
        FI add = (a, b) -> a + b;

        // Lambda to multiply two numbers
        FI multiply = (a, b) -> a * b;

        // Passing lambdas as arguments to the compute method
        int sum = compute(5, 3, add);
        int product = compute(5, 3, multiply);

        System.out.println("Sum using lambda passed as argument: " + sum);
        System.out.println("Product using lambda passed as argument: " + product);

        // Inline lambda directly as argument without assigning to variable
        int difference = compute(10, 4, (a, b) -> a - b);
        System.out.println("Difference using inline lambda: " + difference);
    }
}
