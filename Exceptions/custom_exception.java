// Step 1: Create a custom exception class
class AgeTooSmallException extends Exception {
    public AgeTooSmallException(String message) {
        super(message);  // Pass the message to the parent Exception class
    }
}

public class CustomExceptionExample {

    // Step 2: Method that throws the custom exception
    static void checkAge(int age) throws AgeTooSmallException {
        if (age < 18) {
            // Step 3: Throw the custom exception
            throw new AgeTooSmallException("Age must be at least 18.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);  // This will throw the custom exception
        } catch (AgeTooSmallException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling custom exception.");
    }
}
