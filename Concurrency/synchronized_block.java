public class SynchronizedBlockExampleStatic {

    private static int counter = 0;  // shared resource
    private static final Object lock = new Object();  // lock object for synchronization

    public static void increaseCounter() {
        // non-critical work
        System.out.println(Thread.currentThread().getName() + " is doing other work...");

        // synchronized block to lock only this part
        synchronized (lock) {
            counter++;  // critical section
            System.out.println(Thread.currentThread().getName() + " incremented counter to " + counter);
        }

        // more non-critical work
        System.out.println(Thread.currentThread().getName() + " finished work.");
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                increaseCounter();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                increaseCounter();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final counter value: " + counter);
    }
}
