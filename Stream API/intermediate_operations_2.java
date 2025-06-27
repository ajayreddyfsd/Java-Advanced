import java.util.*;
import java.util.stream.*;

public class IntermediateOperationsOnly {
    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "cherry", "date", "apple");

        // 1️⃣ filter() - keep only fruits with length > 5
        Stream<String> stream = fruits.stream();
        Stream<String> filtered = stream.filter(f -> f.length() > 5);
        // This stream is now ready, but not executed yet (lazy)



        // 2️⃣ map() - convert each fruit to uppercase
        stream = fruits.stream();
        Stream<String> mapped = stream.map(f -> f.toUpperCase());
        // Still not executed — it’s waiting for a terminal operation



        // 3️⃣ distinct() - remove duplicates
        stream = fruits.stream();
        Stream<String> distinct = stream.distinct();
        // Only unique fruits remain in the stream



        // 4️⃣ sorted() - sort fruits in natural (alphabetical) order
        stream = fruits.stream();
        Stream<String> sorted = stream.sorted();
        // This prepares a sorted stream



        // 5️⃣ sorted() with custom comparator - sort by string length
        stream = fruits.stream();
        Stream<String> sortedByLength = stream.sorted(Comparator.comparingInt(String::length));
        // Fruits will be sorted from shortest to longest



        // 6️⃣ peek() - use to debug (print each item while processing)
        stream = fruits.stream();
        Stream<String> peeked = stream
                                .filter(f -> f.contains("a"))
                                .peek(f -> System.out.println("Passing through: " + f))
                                .map(f -> f.toUpperCase());
        // peek() is like a debug print while still building the pipeline



        // 7️⃣ limit() - take only the first 3 elements
        stream = fruits.stream();
        Stream<String> limited = stream.limit(3);
        // This stream will stop after 3 elements



        // 8️⃣ skip() - skip the first 2 elements
        stream = fruits.stream();
        Stream<String> skipped = stream.skip(2);
        // This stream starts from the 3rd fruit onward


        
        // ⚠️ None of these streams will run until a terminal operation is added!
    }
}
