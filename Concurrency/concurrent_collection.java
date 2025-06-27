/*
  Concurrent Collections:

  When multiple threads try to read and write to a collection (like List, Map, Set) at the same time,
  it can cause problems such as data corruption or exceptions.

  To handle this safely, Java provides special collection classes designed for concurrent use,
  called "concurrent collections."

  These collections manage internal synchronization automatically,
  so multiple threads can add, remove, or access elements safely without you doing manual locking.

  Common examples include:
    - ConcurrentHashMap: A thread-safe version of HashMap.
    - CopyOnWriteArrayList: A thread-safe List where all mutative operations (add, set, remove) create a new copy.
    - ConcurrentLinkedQueue: A thread-safe queue suitable for producer-consumer patterns.

  Using concurrent collections helps write safe multi-threaded programs without complex synchronization code.
*/

import java.util.concurrent.*;
import java.util.*;

public class ConcurrentCollectionExample {

    // Shared concurrent list (thread-safe)
    private static CopyOnWriteArrayList<String> concurrentList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        // Thread 1 adds elements to the list
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                concurrentList.add("Thread1-Item" + i);
                System.out.println("Thread 1 added: Thread1-Item" + i);
                try { Thread.sleep(50); } catch (InterruptedException e) {}
            }
        });

        // Thread 2 iterates over the list while Thread 1 is adding
        Thread t2 = new Thread(() -> {
            try { Thread.sleep(25); } catch (InterruptedException e) {}
            for (String item : concurrentList) {
                System.out.println("Thread 2 read: " + item);
                try { Thread.sleep(50); } catch (InterruptedException e) {}
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final list content: " + concurrentList);
    }
}
