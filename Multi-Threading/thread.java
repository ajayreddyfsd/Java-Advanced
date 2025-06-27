public class SimpleThreadExample {
    public static void main(String[] args) {

        // so one is main thread and the other is custom thread 
        //but both run parallely/concurrently which depends on the system


        //custom thread
        // 👇 Creating a thread using a lambda expression (Runnable)
        Thread myThread = new Thread(() -> {
            // This is the code that runs in the new thread
            for (int i = 1; i <= 5; i++) {
                System.out.println("👷 Thread is working... Step " + i);
                try {
                    Thread.sleep(500);  // Pause for 500 milliseconds
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted!");
                }
            }
        });

        // 🔄 Start the thread (this runs in parallel with main thread)
        myThread.start();



        // main thread
        // 👇 This is the main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("🧠 Main is working... Step " + i);
            try {
                Thread.sleep(500);  // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main was interrupted!");
            }
        }
    }
}
