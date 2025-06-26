@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class LambdaSyntaxExample {
    public static void main(String[] args) {
        // Lambda expression syntax: (parameters) -> expression
        Calculator sum = (a, b) -> a + b;

        int result = sum.add(5, 3);
        System.out.println("Sum: " + result);
    }
}
