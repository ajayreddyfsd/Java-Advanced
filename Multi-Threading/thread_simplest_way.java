public class ModernThreadExamples {

    public static void main(String[] args) {


        // 1️⃣ Lambda Runnable #1 - simple message print
        Runnable lambdaRunnable1 = () -> System.out.println("1️⃣ Lambda Runnable #1: Thread running");
        Thread thread1 = new Thread(lambdaRunnable1);
        thread1.start();


        // 2️⃣ Lambda Runnable #2 - print count 1 to 3 with delay
        Runnable lambdaRunnable2 = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("2️⃣ Lambda Runnable #2: Count " + i);
                try {
                    Thread.sleep(300);  // Pause 300 ms between counts
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        };
        Thread thread2 = new Thread(lambdaRunnable2);
        thread2.start();



        // 3️⃣ Lambda Runnable #3 - print thread name
        Runnable lambdaRunnable3 = () -> {
            System.out.println("3️⃣ Lambda Runnable #3: Running on " + Thread.currentThread().getName());
        };
        Thread thread3 = new Thread(lambdaRunnable3);
        thread3.start();



        // simplest way
        // simplest way
        // simplest way
        // simplest way
        // simplest way


        
        // 4️⃣ Direct lambda #1 - simple message
        Thread thread4 = new Thread(() -> System.out.println("4️⃣ Direct lambda #1: Thread running"));
        thread4.start();



        // 5️⃣ Direct lambda #2 - print count 1 to 3 with delay
        Thread thread5 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("5️⃣ Direct lambda #2: Count " + i);
                try {
                    Thread.sleep(300);  // Pause 300 ms between counts
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        });
        thread5.start();



        // 6️⃣ Direct lambda #3 - print thread name
        Thread thread6 = new Thread(() -> {
            System.out.println("6️⃣ Direct lambda #3: Running on " + Thread.currentThread().getName());
        });
        thread6.start();
    }
}
