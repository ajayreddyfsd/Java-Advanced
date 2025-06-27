@FunctionalInterface
interface FI {
    String convert(String s);
}

public class Main {
    public static void main(String[] args) {
        // Lambda expression version
        FI le1 = (s) -> s.toUpperCase();
        System.out.println(le1.convert("ajay"));  // Output: AJAY

        // Method reference version
        FI le2 = String::toUpperCase;
        System.out.println(le2.convert("ajay"));  // Output: AJAY
    }
}
