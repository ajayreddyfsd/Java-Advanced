public class ModernThreadExamples {

    public static void main(String[] args) {



        // 1️⃣ Anonymous Runnable #1 - prints a message
        Runnable anonymousRunnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("1️⃣ Anonymous Runnable #1: Thread running");
            }
        };
        Thread thread1 = new Thread(anonymousRunnable1);
        thread1.start();



        // 2️⃣ Anonymous Runnable #2 - prints numbers 1 to 3 with delay
        Runnable anonymousRunnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("2️⃣ Anonymous Runnable #2: Count " + i);
                    try {
                        Thread.sleep(300);  // Pause 300 ms between counts
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted");
                    }
                }
            }
        };
        Thread thread2 = new Thread(anonymousRunnable2);
        thread2.start();



        // 3️⃣ Anonymous Runnable #3 - prints thread name
        Runnable anonymousRunnable3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("3️⃣ Anonymous Runnable #3: Running on " + Thread.currentThread().getName());
            }
        };
        Thread thread3 = new Thread(anonymousRunnable3);
        thread3.start();

    }
}
