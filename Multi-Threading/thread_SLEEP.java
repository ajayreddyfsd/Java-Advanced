public class SleepOnlyExample {
    public static void main(String[] args) {


/*
  When you create a Thread like T1, it's just fully prepared — not running yet.
  Once you call T1.start(), the thread officially "starts" and parts its way and runs its code.
  Before start(), it's just an object waiting to run.
*/


        Thread t1 = new Thread(() -> {
            System.out.println("T1: Started");
            try {
                // Pause this thread (T1) for 3 seconds (3000 milliseconds)
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("T1: Interrupted during sleep");
            }
            System.out.println("T1: Finished after sleeping");
        });

        t1.start();  // Start the T1 thread

        System.out.println("Main thread: Continues running immediately without waiting");
    }
}
