public class SimpleSyncExampleStatic {

    private static int counter = 0;

    // synchronized static method to safely increase the counter
    public static synchronized void increaseCounter() {
        counter++;  // only one thread can run this at a time
        System.out.println(Thread.currentThread().getName() + " counted: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {

        // Thread 1 increases the counter 5 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                increaseCounter();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-1");

        // Thread 2 increases the counter 5 times
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
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
