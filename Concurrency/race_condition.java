/*
===============================
 Multithreading Problems & Solutions
===============================

--------------------------------------------------------------------------------

2️⃣ Race Condition
  - Super Simple:
    Two people racing to grab the last cookie — who gets it depends on timing.
  - Technical:
    Program behavior depends on the order/timing of thread execution.
  - Solution:
    Control access with synchronization to ensure order,
    or design code to avoid shared mutable data (immutable objects).