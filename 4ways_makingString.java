public class StringExamples {
    public static void main(String[] args) {
        
        // 1. String (immutable)
        // Strings created using string literals are stored in the string pool
        String str = "Hello";
        str = str + " World";  // creates a new String object; old one remains unchanged
        System.out.println("String: " + str);  // Hello World


        // 2. String using 'new' keyword (also immutable)
        // This creates a new String object in heap memory, even if the same value exists in the string pool
        String strObj = new String("Hello");
        strObj = strObj + " World";  // still creates a new String object due to immutability
        System.out.println("String (new): " + strObj);  // Hello World
        
        
        // 3. StringBuilder (mutable, not synchronized, faster - used in single-threaded contexts)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb.toString());  // Hello World

        
        // 3. StringBuffer (mutable, synchronized, thread-safe - used in multi-threaded contexts)
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");
        System.out.println("StringBuffer: " + sbuf.toString());  // Hello World


    }
}

