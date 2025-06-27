/*
  - When you call T1.sleep(time), it pauses only the T1 thread for that time.
    Other threads, including main, keep running.

  - When main thread calls T1.join(), it pauses the main thread until T1 finishes.
    Meanwhile, T1 and any other threads keep running normally.

  - When T2 thread calls T1.join(), it pauses the T2 thread until T1 finishes.
    Meanwhile, T1 and any other threads keep running normally.
*/