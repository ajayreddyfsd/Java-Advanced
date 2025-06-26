import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Using LinkedList with List interface
        List<String> linkedList = new LinkedList<>();
        
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");
        linkedList.add("JavaScript");
        
        System.out.println("LinkedList Elements:");
        for (String lang : linkedList) {
            System.out.println(lang);
        }
        
        // Adding element at the beginning
        ((LinkedList<String>) linkedList).addFirst("Ruby");
        // Adding element at the end
        ((LinkedList<String>) linkedList).addLast("Go");

        System.out.println("\nAfter adding at first and last:");
        for (String lang : linkedList) {
            System.out.println(lang);
        }
    }
}
