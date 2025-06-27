// Step 1: Define a functional interface
@FunctionalInterface
interface MyFunction {

    // Only one abstract method that is empty with no body
    int operate(int a, int b); 
}

// Step 2: Create a class that implements the interface
class AddOperation implements MyFunction {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Step 3: Use the implementation
        MyFunction add = new AddOperation();
        int result = add.operate(5, 3);
        System.out.println("Result of addition: " + result);
    }
}
