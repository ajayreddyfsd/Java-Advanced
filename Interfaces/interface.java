// Animal.java
// interfaces may have multiple method types like abstract, default, static, private.
// but our business is only with giving body to those bastract method inside that class implementation
// if u need to use IF's default or statuic methods then u r welcome, but use it accordingly to the rules
// ofcourse, private is private

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
