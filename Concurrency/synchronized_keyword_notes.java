// does the same thing as atomic classes but in a different way using locks
// all good! but this process may create wait time for the threads that do not have the lock yet


/*
  The 'synchronized' keyword can be used in Java with:

  1️⃣ Instance methods:
     - Synchronizes the entire method on the instance (the current object).
     - Only one thread can execute the synchronized method on the same object at a time.
     Example:
       public synchronized void myMethod() { ... }

  2️⃣ Static methods:
     - Synchronizes the entire method on the Class object.
     - Only one thread can execute the synchronized static method across all instances.
     Example:
       public static synchronized void myStaticMethod() { ... }

  3️⃣ Blocks of code inside methods (synchronized blocks):
     - Synchronizes only a specific block of code, not the whole method.
     - You specify the object whose lock you want to use.
     Example:
       synchronized(this) { 
          // critical code here 
       }
     - Or using another object as lock:
       synchronized(lockObject) { 
          // critical section 
       }

  Summary:
  - Use synchronized with methods or blocks to control thread access.
  - Synchronizing smaller blocks can improve performance by reducing contention.
*/