/*
  What is Deadlock?

  Deadlock happens in a multithreaded program when two or more threads
  are stuck forever, each waiting for the other to release a resource.

  Imagine two people with two forks trying to eat:
  - Person A holds Fork 1 and waits for Fork 2.
  - Person B holds Fork 2 and waits for Fork 1.
  Neither can proceed because both need the other’s fork to continue.

  In programming, this happens when:
  - Thread 1 locks Resource A and waits for Resource B.
  - Thread 2 locks Resource B and waits for Resource A.
  Both wait forever and the program freezes.

  Deadlock causes the program to stop progressing and must be avoided.
*/
