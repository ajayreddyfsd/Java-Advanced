/*
  ExecutorService and ThreadPool.

  Imagine you have many jobs to do, but only a few workers (threads) to do them.

  Instead of hiring a new worker every time a job comes, you have a small team of workers
  who wait and pick up jobs from a queue. This team is called a "Thread Pool."

  ExecutorService helps manage this team of workers for you:
    - You give it tasks (jobs).
    - It gives each task to a worker when they are free.
    - It reuses the same workers to save time and resources.
    - You can tell it to stop accepting new jobs and finish existing ones.

  This makes handling many tasks easier and more efficient than creating threads manually.
*/



/*
  ExecutorService and ThreadPool:

  Managing threads manually (creating, starting, stopping) can be complex and error-prone.

  Java provides ExecutorService as a higher-level API to manage a pool of threads (ThreadPool).

  A ThreadPool holds a fixed number of threads ready to run tasks.
  When you submit tasks (Runnable or Callable) to the ExecutorService,
  it assigns them to available threads in the pool.

  Benefits:
    - Reuse threads instead of creating new ones every time.
    - Control max number of concurrent threads.
    - Easier to manage and shutdown threads cleanly.

  Common types:
    - FixedThreadPool: a fixed number of threads.
    - CachedThreadPool: creates new threads as needed but reuses idle ones.
*/



/*
  In the ExecutorService example:

  - We never create Thread objects ourselves.
  - When we create a ThreadPool using Executors.newFixedThreadPool(3),
    it automatically creates 3 threads for us behind the scenes.
  - These threads wait ready to pick up tasks we submit.

  - So, we just submit tasks (Runnable) to the ExecutorService,
    and it assigns those tasks to the available threads.
  - This means you don't need to manually create or manage threads,
    making your code simpler and less error-prone.
*/




import java.util.concurrent.*;

public class SimpleExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException {


        // This line does two things:
        // 1. It creates a thread pool with 3 worker threads ready to run tasks.
        // 2. It initializes the ExecutorService variable 'executor' to manage that pool.
        //
        // So, after this line, you have 3 threads created and waiting inside the pool,
        // and 'executor' is what you use to give tasks to those threads.
        ExecutorService executor = Executors.newFixedThreadPool(3);



        // Submit 5 tasks (jobs) to the executor
        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;

            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " started task " + taskNumber);

                try {
                    Thread.sleep(100); // Pretend to work for 100 milliseconds
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(Thread.currentThread().getName() + " finished task " + taskNumber);
            });
        }



        // Tell executor: No more new tasks, finish the ones you have
        executor.shutdown();


        
        // Wait up to 1 minute for all tasks to finish
        if (executor.awaitTermination(1, TimeUnit.MINUTES)) {
            System.out.println("All tasks done!");
        } else {
            System.out.println("Timeout! Some tasks didn't finish.");
        }
    }
}
