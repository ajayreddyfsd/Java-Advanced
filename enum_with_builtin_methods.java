enum Color {
    RED,
    GREEN,
    BLUE
}

public class EnumCommonMethods {
    public static void main(String[] args) {
        Color c = Color.GREEN;

        // toString() - returns the name of the enum constant
        System.out.println("toString(): " + c.toString());  // GREEN

        // ordinal() - returns the position/index of the constant (starting at 0)
        System.out.println("ordinal(): " + c.ordinal());    // 1

        // values() - returns all enum constants as an array
        System.out.println("All colors:");
        for (Color color : Color.values()) {
            System.out.println(color);
        }

        // valueOf() - converts a string to the corresponding enum constant
        Color c2 = Color.valueOf("RED");
        System.out.println("valueOf(\"RED\"): " + c2);

        // If you try valueOf with an invalid name, it throws IllegalArgumentException
        // Uncommenting next line will cause exception
        // Color c3 = Color.valueOf("YELLOW");
    }
}
