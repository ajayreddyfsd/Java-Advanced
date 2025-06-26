// What is final in Java?
// final variable: Value cannot be changed once assigned. It becomes a constant.
// final method: Cannot be overridden by subclasses.
// final class: Cannot be extended (no subclassing allowed).


// final variable example
class Constants {
    public static final double PI = 3.14159;
}

// final method example
class Parent {
    public final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // This would cause a compile error:
    // public void show() { System.out.println("Trying to override a parent method which is final"); }
}

// final class example
final class Utility {
    public static void help() {
        System.out.println("Helping...");
    }
}

// This would cause a compile error:
// coz trying to inherit from a class that is final
// class NewUtil extends Utility {}
