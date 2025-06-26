// Animal.java

public interface Animal {

    // Abstract methods (must be implemented by the class)
    void eat();
    void sleep();

    // Default method (can be overridden)
    default void breathe() {
        System.out.println("Breathing...");
    }

    // Static method (cannot be overridden)
    static void kingdom() {
        System.out.println("Belongs to Animalia kingdom.");
    }

    // Private method (used only within the interface)
    private void log(String message) {
        System.out.println("Log: " + message);
    }

    // Default method using private method internally
    default void live() {
        log("Animal is living");
    }
}
