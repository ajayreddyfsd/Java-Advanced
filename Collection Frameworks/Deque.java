//Deque (Double-Ended Queue)

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        
        deque.addFirst("Start");
        deque.addLast("End");
        
        System.out.println("Deque: " + deque);
        
        // Remove from front
        System.out.println("Removed from front: " + deque.pollFirst());
        
        // Remove from end
        System.out.println("Removed from end: " + deque.pollLast());
        
        System.out.println("Deque after removals: " + deque);
    }
}
