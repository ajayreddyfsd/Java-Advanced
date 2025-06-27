/*
  Comparison: Atomic Classes vs synchronized Keyword

  1. Purpose:
     - Both atomic classes and synchronized keyword are used to make code thread-safe,
       preventing data errors when multiple threads access shared resources.

  2. How They Work:
     - synchronized:
       * Uses a lock (monitor) to allow only one thread at a time to execute a synchronized
         method or block.
       * Other threads trying to enter must wait (block) until the lock is released.
       * Suitable for complex, multi-step operations that need exclusive access.

     - Atomic Classes:
       * Use special low-level CPU instructions (like compare-and-swap) to perform atomic
         operations on single variables.
       * Do not block threads but retry operations if conflicts occur (lock-free, non-blocking).
       * Best for simple, single-variable updates.

  3. Waiting / Blocking Behavior:
     - synchronized:
       * Threads can get blocked and wait sometimes longer for the lock.
     - Atomic Classes:
       * Threads may retry quickly if a conflict happens, usually with minimal waiting.

  4. Performance:
     - synchronized can cause overhead due to locking and waiting.
     - Atomic classes typically offer better performance for simple atomic operations.

  5. Usage Guidelines:
     - Use synchronized for protecting multiple statements or complex logic.
     - Use atomic classes for fast, thread-safe updates on single variables.

  Summary:
  Both help in concurrency control but differ in mechanism and best use cases.
*/
