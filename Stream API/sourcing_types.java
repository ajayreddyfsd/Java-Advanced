/*
================================================================================
                           🌀 Java Stream Types - Easy Guide
================================================================================

Streams are used to **process data** (like filtering, mapping, sorting) in a 
**clean and chainable way**.

But before processing, you need to know what kind of stream you're using.

Here are the **main kinds of streaming** in Java:

--------------------------------------------------------------------------------
1️⃣ Sequential Stream  -->  (Default)
--------------------------------------------------------------------------------
👉 Processes data one item at a time, in **order**.
👉 Runs on **single thread**.

Example:
    List<String> names = List.of("Ajay", "Kim", "Lee");
    names.stream().forEach(System.out::println);  // One by one

--------------------------------------------------------------------------------
2️⃣ Parallel Stream  -->  (Optional)
--------------------------------------------------------------------------------
👉 Splits data and runs on **multiple threads**.
👉 Can be **faster**, but result order is **not guaranteed**.

Example:
    names.parallelStream().forEach(System.out::println);  // Can run in parallel

🔸 Use it for big data sets where speed matters.
🔸 Be careful: Parallel does NOT always mean faster for small tasks.

--------------------------------------------------------------------------------
3️⃣ Infinite Stream using Stream.iterate()
--------------------------------------------------------------------------------
👉 Creates an endless stream by **repeating a pattern** (like counting).

Example:
    Stream.iterate(0, n -> n + 1)
          .limit(5)
          .forEach(System.out::println);

🔹 Always use `.limit()` to avoid infinite loops!

--------------------------------------------------------------------------------
4️⃣ Infinite Stream using Stream.generate()
--------------------------------------------------------------------------------
👉 Keeps generating random or custom values.

Example:
    Stream.generate(Math::random)
          .limit(3)
          .forEach(System.out::println);

🔸 Uses a Supplier function to keep producing values.

--------------------------------------------------------------------------------
5️⃣ Primitive Streams  (IntStream, LongStream, DoubleStream)
--------------------------------------------------------------------------------
👉 Special streams made for **primitive types** (int, long, double).
👉 Saves memory, avoids boxing/unboxing.

Example:
    int[] nums = {1, 2, 3};
    IntStream.of(nums).forEach(System.out::println);

--------------------------------------------------------------------------------
6️⃣ Streaming from Files
--------------------------------------------------------------------------------
👉 Reads each line of a file as a stream element.

Example:
    Files.lines(Paths.get("file.txt")).forEach(System.out::println);

--------------------------------------------------------------------------------
7️⃣ Stream from a List (Collection)
--------------------------------------------------------------------------------
👉 Start a stream from any List or Collection using `.stream()`.

Example:
    List<String> names = List.of("Ajay", "Kim", "Lee");
    names.stream().forEach(System.out::println);

--------------------------------------------------------------------------------
8️⃣ Stream from an Array
--------------------------------------------------------------------------------
👉 Use `Arrays.stream(array)` to start a stream from an array.

Example:
    String[] fruits = {"apple", "banana", "cherry"};
    Arrays.stream(fruits).forEach(System.out::println);

--------------------------------------------------------------------------------
9️⃣ Stream from Fixed Values
--------------------------------------------------------------------------------
👉 Use `Stream.of(...)` to create a stream from fixed values.

Example:
    Stream.of(10, 20, 30).forEach(System.out::println);

================================================================================
✅ Summary:
Use streams to **loop, filter, map, sort** — in a clean, readable, and flexible way.
Choose the right kind of stream depending on your data and goal.
================================================================================
*/
