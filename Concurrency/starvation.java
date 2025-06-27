/*
===============================
 Multithreading Problems & Solutions
===============================

--------------------------------------------------------------------------------

4️⃣ Starvation
  - Super Simple:
    Some people always get food first, others wait forever without any.
  - Technical:
    Lower priority threads never get CPU time because higher priority threads dominate.
  - Solution:
    Use fair locks, priority adjustments, or thread scheduling techniques
    to ensure all threads get a chance to run.