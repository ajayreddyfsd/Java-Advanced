import java.util.*;
import java.util.stream.*;

public class TerminalOperationsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(3, 6, 9, 12, 15);

        // Convert List to Stream once and save it in a variable
        Stream<Integer> numberStream = numbers.stream();

        // 1️⃣ forEach() - print every number
        numberStream.forEach(n -> System.out.println(n));




        // After terminal operation (forEach), stream is closed and can't be reused.
        // So, we need to create a new stream for the next operation.

        // Create a new stream for the next operation:
        numberStream = numbers.stream();

        // 2️⃣ collect() - collect numbers greater than 6 into a List
        List<Integer> collected = numberStream
                                    .filter(n -> n > 6)
                                    .collect(Collectors.toList());
        System.out.println("collect (numbers > 6): " + collected);




        // Create a new stream for the next operation, 
        // since the previously created stream closes automatically after terminal operation
        numberStream = numbers.stream();

        // 3️⃣ reduce() - sum all numbers
        int sum = numberStream.reduce(0, (a, b) -> a + b);
        System.out.println("reduce (sum): " + sum);




        // Create a new stream for the next operation, 
        // since the previously created stream closes automatically after terminal operation
        numberStream = numbers.stream();

        // 4️⃣ count() - count numbers divisible by 3
        long count = numberStream
                        .filter(n -> n % 3 == 0)
                        .count();
        System.out.println("count (divisible by 3): " + count);


        

        // Create a new stream for the next operation, 
        // since the previously created stream closes automatically after terminal operation
        numberStream = numbers.stream();

        // 5️⃣ anyMatch() - check if any number is even
        boolean hasEven = numberStream.anyMatch(n -> n % 2 == 0);
        System.out.println("anyMatch (has even?): " + hasEven);




        // Create a new stream for the next operation, 
        // since the previously created stream closes automatically after terminal operation
        numberStream = numbers.stream();

        // 6️⃣ allMatch() - check if all numbers are divisible by 3
        boolean allDivBy3 = numberStream.allMatch(n -> n % 3 == 0);
        System.out.println("allMatch (all divisible by 3?): " + allDivBy3);




        // Create a new stream for the next operation, 
        // since the previously created stream closes automatically after terminal operation
        numberStream = numbers.stream();

        // 7️⃣ findFirst() - get the first number if exists
        Optional<Integer> first = numberStream.findFirst();
        System.out.println("findFirst: " + first.orElse(-1));




        // Create a new stream for the next operation, 
        // since the previously created stream closes automatically after terminal operation
        numberStream = numbers.stream();

        // 8️⃣ findAny() - get any number (useful for parallel)
        Optional<Integer> any = numberStream.parallel().findAny();
        System.out.println("findAny: " + any.orElse(-1));
    }
}
