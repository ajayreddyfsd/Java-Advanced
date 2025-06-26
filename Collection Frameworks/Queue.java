//using linkedlist

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        
        System.out.println("Queue: " + queue);
        
        // Peek front element
        System.out.println("Front element: " + queue.peek());
        
        // Remove elements (FIFO)
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
