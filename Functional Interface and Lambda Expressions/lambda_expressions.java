@FunctionalInterface
interface FI {
    int operate(int a, int b);
}

public class LambdaTypesExample {
    public static void main(String[] args) {
        // 1. Lambda with explicit parameter types and single expression (return implicit)
        FI add = (int a, int b) -> a + b;
        System.out.println("Add (explicit types): " + add.operate(5, 3));

        // 2. Lambda with inferred parameter types and single expression
        FI subtract = (a, b) -> a - b;
        System.out.println("Subtract (inferred types): " + subtract.operate(5, 3));

        // 3. Lambda with single parameter (no type), parentheses optional
        // Changing the interface for single param for this demo
        SingleParamFI square = x -> x * x;
        System.out.println("Square (one param, no parentheses): " + square.apply(4));

        // 4. Lambda with no parameters (parentheses required)
        NoParamFI getTen = () -> 10;
        System.out.println("No param lambda returns: " + getTen.get());

        // 5. Lambda with multiple statements in body (use braces and explicit return)
        FI multiply = (a, b) -> {
            int product = a * b;  // multiple statements allowed
            return product;
        };
        System.out.println("Multiply (multiple statements): " + multiply.operate(5, 3));

        // 6. Lambda capturing effectively final variable from outer scope
        int factor = 2;  // must be effectively final (not changed after)
        FI multiplyByFactor = (a, b) -> (a + b) * factor;
        System.out.println("Multiply by factor: " + multiplyByFactor.operate(5, 3));
    }

    // FI for single parameter
    @FunctionalInterface
    interface SingleParamFI {
        int apply(int x);
    }

    // FI for no parameters
    @FunctionalInterface
    interface NoParamFI {
        int get();
    }
}
