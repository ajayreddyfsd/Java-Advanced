/*
===============================
 Multithreading Problems & Solutions
===============================

--------------------------------------------------------------------------------

3️⃣ Livelock
  - Super Simple:
    Imagine two people trying to pass through a narrow doorway,
    both keep moving side to side at the same time to let the other go first,
    but because they do it simultaneously, neither actually passes through.
  - Technical:
    Threads are not blocked but keep changing states in response to each other,
    causing no real progress (like both threads continually yielding to each other).
  - Solution:
    Use strategies like random delays or backoff so threads stop continuously reacting
    and allow one to proceed.