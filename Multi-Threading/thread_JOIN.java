// ✅ Only the thread that calls .join() gets paused.
// ❌ All other threads — including the one you're joining on — keep running undisturbed.


// if inside t1, we get t2.join(), since t1 is calling join, it will be paused until t2 is completed. 
// rest of the other threads are undisturbed.


// if inside main, we get t1.join(), since t1.join() is inside main, main gets paused until t1 is completed. 
//rest of the other threads are undisturbed


public class JoinBehaviorExample {
    public static void main(String[] args) throws InterruptedException {

        // Thread T1: sleeps 2 seconds
        Thread t1 = new Thread(() -> {
            System.out.println("✅ T1: Started (Sleeps 2s)");
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            System.out.println("✅ T1: Finished");
        });

        // Thread T2: sleeps 1 second
        Thread t2 = new Thread(() -> {
            System.out.println("✅ T2: Started (Sleeps 1s)");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("✅ T2: Finished");
        });

        // Thread T3: sleeps 1.5 seconds
        Thread t3 = new Thread(() -> {
            System.out.println("✅ T3: Started (Sleeps 1.5s)");
            try { Thread.sleep(1500); } catch (InterruptedException e) {}
            System.out.println("✅ T3: Finished");
        });

        // 🔷 Start all three threads together
        t1.start();  // Will finish after 2s
        t2.start();  // Will finish after 1s
        t3.start();  // Will finish after 1.5s


        
        // -----------------------------------------------------------------------------
        // CASE 1: main thread calls t1.join()
        // -----------------------------------------------------------------------------
        System.out.println("🔷 Main: Waiting for T1 to finish...");
        t1.join();  // ⏸ Main thread pauses here until T1 completes

        // ⚠️ While main is paused:
        //    ✅ T1 is running and will complete in 2s
        //    ✅ T2 and T3 are also running independently
        //    ❌ Only main thread is paused — others are undisturbed

        // -----------------------------------------------------------------------------
        // CASE 2: main thread calls t2.join()
        // -----------------------------------------------------------------------------
        System.out.println("🔶 Main: T1 finished. Now waiting for T2...");

        t2.join();  // ⏸ Main thread waits for T2, but it probably already finished

        // ✅ If T2 already finished earlier (after 1s), main continues instantly
        // ✅ If not, main waits until it does
        // ❌ Still, only main is paused — t1 and t3 remain unaffected

        // -----------------------------------------------------------------------------
        // CASE 3: main thread calls t3.join()
        // -----------------------------------------------------------------------------
        System.out.println("🔶 Main: T2 finished. Now waiting for T3...");

        t3.join();  // ⏸ Main waits for T3 if not done already

        // ✅ If T3 already finished, main continues
        // ❌ Still, only main is paused — other threads aren't touched

        // -----------------------------------------------------------------------------
        System.out.println("🏁 Main: All threads have finished.");
    }
}
