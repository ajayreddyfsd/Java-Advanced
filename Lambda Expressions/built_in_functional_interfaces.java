import java.util.function.*;

public class BuiltInFIsExample {
    public static void main(String[] args) {

        // Function<T, R>: takes T and returns R
        // Here: input String, output Integer (length of string)
        Function<String, Integer> lengthFunc = s -> s.length();
        System.out.println("Length: " + lengthFunc.apply("Hello"));
        // Output: Length: 5



        // Predicate<T>: takes T, returns boolean
        // Here: checks if an integer is even
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        // Output: Is 4 even? true



        // Consumer<T>: takes T, returns nothing (void)
        // Here: prints the input string
        Consumer<String> printer = s -> System.out.println("Printing: " + s);
        printer.accept("Java");
        // Output: Printing: Java



        // Supplier<T>: takes no input, returns T
        // Here: generates a random double number
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());
        // Output: Random number: <some random decimal between 0.0 and 1.0>



        // BiFunction<T, U, R>: takes two inputs T and U, returns R
        // Here: concatenates two strings
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        System.out.println("Concatenated: " + concat.apply("Hello, ", "World"));
        // Output: Concatenated: Hello, World



        // UnaryOperator<T>: takes and returns same type T
        // Here: increments the integer by 1
        UnaryOperator<Integer> increment = n -> n + 1;
        System.out.println("Increment 5: " + increment.apply(5));
        // Output: Increment 5: 6


        
        // BinaryOperator<T>: takes two T inputs, returns T
        // Here: multiplies two integers
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("Multiply 3 * 4: " + multiply.apply(3, 4));
        // Output: Multiply 3 * 4: 12
    }
}
