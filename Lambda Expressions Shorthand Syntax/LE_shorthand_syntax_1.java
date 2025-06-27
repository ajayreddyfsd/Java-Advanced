@FunctionalInterface
interface FI {
    void execute(String input);
}

public class Main {
    public static void main(String[] args) {
        // 1. Lambda expression assignment
        // We assign a lambda that takes 'input' and prints it
        // Note the semicolon at the end of this assignment statement
        FI le1 = (input) -> System.out.println(input);
        le1.execute("Hello from Lambda!");

        // 2. Method reference assignment
        // This is shorthand for the lambda above because the lambda only calls a method
        // Semicolon is still needed at the end of the assignment statement
        FI le2 = System.out::println;
        le2.execute("Hello from Method Reference!");
    }
}
