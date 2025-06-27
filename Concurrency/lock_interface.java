// does the same thing as sync keyword but in a much more better way.


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class LockExample {

    private static final Lock lock = new ReentrantLock();
    private static int counter = 0;

    // Method using lock() and unlock()
    public static void incrementWithLock() {
        lock.lock();  // acquire the lock, wait if needed
        try {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to " + counter);
            Thread.sleep(100);  // simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();  // release the lock
        }
    }

    // Method using tryLock()
    public static void incrementWithTryLock() {
        if (lock.tryLock()) {  // try to acquire lock immediately
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
            System.out.println(Thread.currentThread().getName() + " could not get lock (tryLock)");
        }
    }

    // Method using tryLock with timeout
    public static void incrementWithTryLockTimeout() {
        try {
            if (lock.tryLock(500, TimeUnit.MILLISECONDS)) {  // wait up to 500ms for lock
                try {
                    counter++;
                    System.out.println(Thread.currentThread().getName() + " incremented counter to " + counter + " (tryLock with timeout)");
                    Thread.sleep(100);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not get lock within timeout");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Thread using lock() and unlock()
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) incrementWithLock();
        }, "Thread-1");

        // Thread using tryLock()
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) incrementWithTryLock();
        }, "Thread-2");

        // Thread using tryLock with timeout
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
