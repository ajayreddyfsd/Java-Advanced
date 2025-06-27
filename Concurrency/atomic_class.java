/*
  Sometimes, many threads want to use or change the same resource at the same time,
  which can cause problems like data getting messed up. Atomic classes use special,
  low-level CPU instructions or tricks behind the scenes to make sure only one thread
  can change the resource at a time, without causing errors.

  They hide this complex locking or coordination logic from you, so you can safely
  share variables between threads without writing complicated synchronization code.

  In short: atomic classes let multiple threads safely access and update the same
  resource, preventing errors caused by simultaneous access.

  Examples of some of the atomic classes in Java include:
    - AtomicInteger
    - AtomicLong
    - AtomicBoolean
    - AtomicReference
  These classes provide atomic operations on single variables, making multithreading safer.
*/




import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicClassesExample {

    public static void main(String[] args) throws InterruptedException {

        // 1. AtomicInteger - atomic integer operations (increment, add, etc.)
        AtomicInteger atomicInt = new AtomicInteger(0);

        // 2. AtomicLong - atomic long operations
        AtomicLong atomicLong = new AtomicLong(1000L);

        // 3. AtomicBoolean - atomic boolean operations (set, get, compareAndSet)
        AtomicBoolean atomicBool = new AtomicBoolean(false);

        // 4. AtomicReference - atomic operations on an object reference
        AtomicReference<String> atomicRef = new AtomicReference<>("Initial");

        // Create a thread that increments atomicInt 1000 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicInt.incrementAndGet(); // safely increments value by 1
            }
        });

        // Create a thread that adds 500 to atomicLong
        Thread t2 = new Thread(() -> {
            atomicLong.addAndGet(500L);  // safely adds 500
        });

        // Create a thread that flips atomicBool from false to true
        Thread t3 = new Thread(() -> {
            boolean changed = atomicBool.compareAndSet(false, true); 
            // only sets true if current value is false
            System.out.println("AtomicBoolean changed: " + changed);
        });

        // Create a thread that changes atomicRef to a new String if current is "Initial"
        Thread t4 = new Thread(() -> {
            boolean changed = atomicRef.compareAndSet("Initial", "Updated");
            System.out.println("AtomicReference changed: " + changed);
        });

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        // Print final results after all atomic updates
        System.out.println("Final AtomicInteger value: " + atomicInt.get());  // Expect 1000
        System.out.println("Final AtomicLong value: " + atomicLong.get());    // Expect 1500
        System.out.println("Final AtomicBoolean value: " + atomicBool.get()); // Expect true
        System.out.println("Final AtomicReference value: " + atomicRef.get());// Expect "Updated"
    }
}
