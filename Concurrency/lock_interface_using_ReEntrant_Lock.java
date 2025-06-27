import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class ReentrantLockExample {

    // Create a ReentrantLock object (implements Lock interface)
    private static final ReentrantLock lock = new ReentrantLock();
    private static int counter = 0;

    // Using lock() and unlock()
    public static void incrementWithLock() {
        lock.lock();  // Acquire lock, waits if needed
        try {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to " + counter);
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // Always release lock in finally block
        }
    }

    // Using tryLock() - non-blocking attempt to get lock
    public static void incrementWithTryLock() {
        if (lock.tryLock()) { // Try to get lock immediately
            try {
                counter++;
                System.out.println(Thread.currentThread().getName() + " incremented counter to " + counter + " (tryLock)");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " could NOT get lock (tryLock)");
        }
    }

    // Using tryLock(long time, TimeUnit) - wait some time to get lock
    public static void incrementWithTryLockTimeout() {
        try {
            if (lock.tryLock(500, TimeUnit.MILLISECONDS)) { // Wait max 500ms for lock
                try {
                    counter++;
                    System.out.println(Thread.currentThread().getName() + " incremented counter to " + counter + " (tryLock with timeout)");
                    Thread.sleep(100);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could NOT get lock within timeout");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) incrementWithLock();
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) incrementWithTryLock();
        }, "Thread-2");

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 3; i++) incrementWithTryLockTimeout();
        }, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final counter value: " + counter);
    }
}
