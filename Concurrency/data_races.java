/*
===============================
 Multithreading Problems & Solutions
===============================

1️⃣ Data Race
  - Super Simple:
    Two people writing on the same notebook page at the same time,
    causing messy and wrong writing.
  - Technical:
    Concurrent unsynchronized access to shared data causing inconsistent results.
  - Solution:
    Use synchronization (like 'synchronized' keyword, locks, or atomic classes)
    to make sure only one thread modifies data at a time.
    