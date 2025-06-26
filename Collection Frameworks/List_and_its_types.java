// ArrayList = Best general purpose list for fast access.
// LinkedList = Good for frequent add/remove operations.
// Vector = Like ArrayList but thread-safe (older).
// Stack = For last-in-first-out (LIFO) use cases.
// CopyOnWriteArrayList = Thread-safe variant of ArrayList, good for many readers, few writers.


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class ListTypesExample {
    public static void main(String[] args) {
        // 1. ArrayList - dynamic array
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        System.out.println("ArrayList: " + arrayList);

        // 2. LinkedList - doubly linked list
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        System.out.println("LinkedList: " + linkedList);

        // 3. Vector - synchronized dynamic array (legacy)
        List<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Blue");
        System.out.println("Vector: " + vector);

        // 4. Stack - LIFO stack (extends Vector)
        Stack<String> stack = new Stack<>();
        stack.push("Page1");
        stack.push("Page2");
        System.out.println("Stack: " + stack);

        // 5. CopyOnWriteArrayList - thread-safe variant of ArrayList
        List<String> cowArrayList = new CopyOnWriteArrayList<>();
        cowArrayList.add("Thread1");
        cowArrayList.add("Thread2");
        System.out.println("CopyOnWriteArrayList: " + cowArrayList);
    }
}
