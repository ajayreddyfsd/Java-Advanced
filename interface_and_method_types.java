interface MyInterface {
    // Abstract method (no body) - must be implemented
    void abstractMethod();

    // Default method with implementation - can be overridden
    default void defaultMethod() {
        System.out.println("Default method in interface");
        privateHelper();  // calling private method inside interface
    }

    // Static method - called on interface, not on instances
    static void staticMethod() {
        System.out.println("Static method in interface");
        privateStaticHelper();
    }

    // Private helper method (only accessible inside interface, used by default/static methods)
    private void privateHelper() {
        System.out.println("Private helper method");
    }

    // Private static helper method
    private static void privateStaticHelper() {
        System.out.println("Private static helper method");
    }
}

class MyClass implements MyInterface {
    // Must implement abstract method
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstractMethod");
    }

    // Optionally override default method
    @Override
    public void defaultMethod() {
        System.out.println("Overridden defaultMethod in class");
        // Can call super default method if desired (Java 8+)
        MyInterface.super.defaultMethod();
    }
}

public class InterfaceMethodsDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Call implemented abstract method
        obj.abstractMethod();

        // Call overridden default method
        obj.defaultMethod();

        // Call static method on interface directly
        MyInterface.staticMethod();
    }
}
