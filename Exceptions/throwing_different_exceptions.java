/*
Exception Types Explained Simply:

1. Checked Exceptions:
   "These are problems that happen outside your code’s control — like missing files,
   lost network connections, or database issues. You need to handle them because
   your program can’t just ignore them; 

   Example: Reading a file that might not exist, so Java forces you to handle or declare it.
    - Examples: IOException, SQLException.
    - Occur during compile-time checks.
    - Example usage: File handling, database access.

2. Unchecked Exceptions:
   "These usually indicate bugs or logical errors in your program — like null pointer
   access or invalid calculations. You are NOT required to catch them or declare them.
   Why? coz u need to edit ur code in first place. its not about error handling but code editing

    - Examples: ArithmeticException, NullPointerException, IllegalArgumentException.
    - Occur at runtime, usually due to programmer errors.

   However, in some cases, catching unchecked exceptions can be useful to log errors,
   clean up resources, or provide fallback behavior, but this should be done sparingly."
*/



/* So, there are three types of exceptions: checked, unchecked, and custom. For checked exceptions, 
you need to declare and either catch or handle them. For unchecked exceptions, 
you do not need to declare or handle them. 
The difference is that unchecked exceptions represent bugs in your code — 
they require you to fix your code rather than just handling the error. 
Checked exceptions, on the other hand, occur outside your code, 
so you are forced to handle them. Besides these two, there are custom exceptions, 
which you can declare and handle however you want. */


// Custom checked exception
class MyCustomException extends Exception {
    public MyCustomException(String msg) {
        super(msg);
    }
}

public class ThrowExceptionDemo {

    // Method throwing a checked exception (must declare 'throws')
    static void methodThrowingCheckedException() throws java.io.IOException {
        // Throwing a checked exception (IOException)
        throw new java.io.IOException("Checked Exception: File not found!");
    }

    // Method throwing an unchecked exception (no need to declare 'throws')
    static void methodThrowingUncheckedException() {
        // Throwing an unchecked exception (IllegalArgumentException)
        throw new IllegalArgumentException("Unchecked Exception: Invalid argument!");
    }

    // Method that throws a custom checked exception
    static void methodThrowingCustomException(int age) throws MyCustomException {
        if (age < 18) {
            // Throw custom exception if age < 18
            throw new MyCustomException("Custom Exception: Age must be 18 or older.");
        }
    }

    public static void main(String[] args) {

        // === Handling checked exception with try-catch ===
        try {
            methodThrowingCheckedException();
        } catch (java.io.IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // === Handling unchecked exception with try-catch ===
        try {
            methodThrowingUncheckedException();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        // === Handling custom checked exception with try-catch ===
        try {
            methodThrowingCustomException(16);
        } catch (MyCustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        // === Example: throwing unchecked exception directly in main ===
        // Uncommenting below line will terminate program with exception
        // throw new NullPointerException("Example unchecked exception thrown directly");

        System.out.println("Program continues after exception handling.");
    }
}
