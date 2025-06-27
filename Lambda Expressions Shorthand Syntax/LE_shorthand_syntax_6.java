// FI.java
@FunctionalInterface
interface FI {
    void printMessage(String message);
}

public class Example6 {
    public static void main(String[] args) {
        // Lambda with multiple statements - printing a label and the message
        FI le1 = (msg) -> {
            System.out.println("Message:");
            System.out.println(msg);
        };
        le1.printMessage("Hello!");

        // Cannot convert this to method reference because multiple statements exist
        // can only use shorthand syntax, when all the code inside le is just calling a single method
    }
}
