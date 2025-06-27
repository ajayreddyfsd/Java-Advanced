import java.util.*;              // For List, Arrays
import java.util.stream.*;       // For Stream, IntStream
import java.nio.file.*;          // For file path
import java.io.IOException;      // For file operations

public class StreamSourcingExamples {

    public static void main(String[] args) throws IOException {

        // 1️⃣ Stream from a List
        // 2 ways - normal stream from a list & parallel stream from a list
        // Create a list of names
        List<String> names = List.of("Ajay", "Kim", "Lee");

        // Turn the list into a stream - a sequential stream
        Stream<String> fromList = names.stream();

        // Print each name in the stream
        fromList.forEach(name -> System.out.println("From List: " + name));




        // 2️⃣ Parallel Stream from the same above List (uses multiple threads behind the scenes)
        Stream<String> parallelNames = names.parallelStream();

        // This also prints names (order may be different because it's parallel)
        parallelNames.forEach(name -> System.out.println("Parallel: " + name));




        // 3️⃣ Stream from fixed values using Stream.of()
        // Use when you have fixed values, not in a list or array
        Stream<Integer> fromValues = Stream.of(10, 20, 30);

        fromValues.forEach(val -> System.out.println("From values: " + val));




        // 4️⃣ Stream from an array of strings
        String[] fruits = {"apple", "banana", "cherry"};

        // Convert array to stream
        Stream<String> fromArray = Arrays.stream(fruits);

        fromArray.forEach(fruit -> System.out.println("From array: " + fruit));




        // 5️⃣ Stream from an array of numbers (int[])
        int[] numbers = {1, 2, 3, 4};

        // Use IntStream for primitive int arrays
        IntStream fromIntArray = Arrays.stream(numbers);

        fromIntArray.forEach(n -> System.out.println("From int array: " + n));




        // 6️⃣ Infinite Stream using Stream.iterate()
        // Starts from 0, keeps adding +2 each time
        // limit(5) stops it after 5 numbers. 
        // limit is mandatory for infinite seqs, else code runs forever. 
        // so properly set the limit value as per how much do u actually need
        Stream<Integer> evens = Stream.iterate(0, n -> n + 2).limit(5);

        evens.forEach(n -> System.out.println("Even number: " + n));




        // 7️⃣ Infinite Stream using Stream.generate()
        // Keeps generating random numbers
        // limit(3) stops it after 3 numbers
        // limit is mandatory for infinite seqs, else code runs forever. 
        // so properly set the limit value as per how much do u actually need
        Stream<Double> randoms = Stream.generate(Math::random).limit(3);

        randoms.forEach(r -> System.out.println("Random number: " + r));




        // 8️⃣ Stream from a File (each line becomes an item in the stream)
        // First, create a text file with 3 lines
        Path file = Paths.get("example.txt");

        // Write lines to file (this step just prepares the example)
        Files.write(file, List.of("Line 1", "Line 2", "Line 3"));

        // Now read the file line by line as a stream
        Stream<String> fileLines = Files.lines(file);

        fileLines.forEach(line -> System.out.println("From file: " + line));




        // Cleanup: Delete the temporary file after use
        Files.delete(file);
    }
}
