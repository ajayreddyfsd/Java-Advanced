/*
┌──────────────────────────────────────────────────────────────────────────────┐
│           Interface Conflict Scenarios Summary in Java                      │
├───────────────┬────────────────────────┬────────────────────────────────────┤
│ Case          │ Interfaces Involved    │ Conflict Type                       │
├───────────────┼────────────────────────┼────────────────────────────────────┤
│ Case 1        │ A1, B1                 │ No conflict: same signature         │
│ Case 2 ❌     │ A2, B2                 │ ⚠ Conflict: same name, diff return │
│ Case 3        │ A3, B3                 │ Overloading: same name, diff params│
│ Case 4        │ Parent class & A4      │ Method name overlap, override needed│
└───────────────┴────────────────────────┴────────────────────────────────────┘
Note:
✔ Java allows multiple interfaces with same method name if the signature matches.
✘ Java throws compile error if method names are same but return types differ.
✔ Method overloading (diff params) is allowed even with same method names.
✔ If both class and interface have same method, class must override it.
*/

interface A1 {
    void greet(); // Same as B1
}

interface B1 {
    void greet(); // Same as A1
}

interface A2 {
    int getId(); // Conflicts with B2
}

interface B2 {
    String getId(); // Conflict: different return type
}

interface A3 {
    void display(String text);
}

interface B3 {
    void display(int number); // Overloaded method
}

class Parent {
    public void run() {
        System.out.println("Run from Parent");
    }
}

interface A4 {
    void run(); // Same name as method in Parent class
}

class MyClass extends Parent implements A1, B1, A3, B3, A4 {
    // Case 1
    public void greet() {
        System.out.println("Hello from greet()");
    }

    // Case 3
    public void display(String text) {
        System.out.println("Text: " + text);
    }

    public void display(int number) {
        System.out.println("Number: " + number);
    }

    // Case 4
    @Override
    public void run() {
        System.out.println("Run from MyClass");
    }

    // ❌ Case 2 would cause compile-time error:
    // public int getId() {}  // A2
    // public String getId() {} // B2
}

public class InterfaceConflictExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.greet();
        obj.display("Hello Interface!");
        obj.display(42);
        obj.run();
    }
}
