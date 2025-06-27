/*
  IMPORTANT IDEA ABOUT THREADS IN JAVA:

  1. When the program starts, the "main thread" starts running the main() method.

  2. Inside main(), we can create other threads like t1, t2, t3.
     - But at first, creating these thread objects is still done by the main thread.

  3. But when we call t1.start(), t2.start(), or t3.start():
     - These threads start running on their own, separate from the main thread.
     - They run at the same time as the main thread (concurrently).

  4. After starting the threads, the main thread keeps running its code.
     - It does NOT wait for those threads to finish unless we tell it to wait by calling t1.join(), etc.

  5. So basically:
     - Main thread makes threads.
     - Then those threads get seperated and run independently.
     - Main thread moves on and can do other work or wait if we want.

  Think of it like a teacher (main thread) giving homework (threads) to students.
  The students do their homework on their own time.
  The teacher can keep teaching or wait for the students to finish if needed.
*/




// so where does main thread actually start from?
// everything inside the main method is aprt of main thread right from line 1
// its only the other threads that are getting seperated once they are started!




// The main thread actually starts at the very first line inside the main() method.
// Everything inside main() runs on the main thread by default, line by line.
// When you create other threads inside main, those are just objects at first,
// but once you call their start() method, they begin running independently on separate threads!
// So only after calling start(), those threads split off and run separately from main thread.
