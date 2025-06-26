class Parent {
    public void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child display");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();  // Parent display

        Child c = new Child();
        c.display();  // Child display

        Parent pc = new Child();
        pc.display(); // Child display (runtime polymorphism)
    }
}
