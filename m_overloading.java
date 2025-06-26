public class OverloadingExample {
    // Method with one int parameter
    public void show(int num) {
        System.out.println("Show int: " + num);
    }

    // Overloaded method with two int parameters
    public void show(int num1, int num2) {
        System.out.println("Show two ints: " + num1 + ", " + num2);
    }

    // Overloaded method with String parameter
    public void show(String text) {
        System.out.println("Show String: " + text);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.show(5);
        obj.show(3, 7);
        obj.show("Hello");
    }
}
