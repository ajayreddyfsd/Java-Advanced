// so code is same as eariler thread.java
// just that, we are implementing thread through interface here and without interface there
// so one is main thread and the other is custom thread but both run parallely/concurrently which depends on the system



// ✅ Step 1: Create a class that implements Runnable
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 👇 This is the task that will run in a separate thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("👷 Custom Thread running: Step " + i);
            try {
                Thread.sleep(500); // Pause for 500 ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        // ✅ Step 2: Create an object of the Runnable implementation
        MyRunnable task = new MyRunnable();

        // ✅ Step 3: Pass the task to a Thread object
        Thread thread = new Thread(task);

        // ✅ Step 4: Start the thread
        thread.start();

        // 👇 Meanwhile, the main thread keeps doing its own work
        for (int i = 1; i <= 5; i++) {
            System.out.println("🧠 Main thread running: Step " + i);
            try {
                Thread.sleep(500); // Pause for 500 ms
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
