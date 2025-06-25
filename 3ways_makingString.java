public class StringExamples {
    public static void main(String[] args) {
        // 1. String (immutable)
        String str = "Hello";
        str = str + " World";  // creates new String object
        System.out.println("String: " + str);  // Hello World

        // 2. StringBuilder (mutable, not synchronized, faster)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb.toString());  // Hello World

        // 3. StringBuffer (mutable, synchronized, thread-safe)
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");
        System.out.println("StringBuffer: " + sbuf.toString());  // Hello World
    }
}
