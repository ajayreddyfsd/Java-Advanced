// Interface 1
interface Interface1 {
    void method1();
}

// Interface 2
interface Interface2 {
    void method2();
}

// Class implementing multiple interfaces (multiple inheritance of type)
class MultiInterfaceClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation of method2");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MultiInterfaceClass obj = new MultiInterfaceClass();
        obj.method1();
        obj.method2();
    }
}
