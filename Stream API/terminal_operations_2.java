import java.util.*;
import java.util.stream.*;

public class StringTerminalOpsDemo {
    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "cherry", "date", "apple");


        // 1️⃣ forEach() - print each fruit
        Stream<String> stream = fruits.stream();
        System.out.println("forEach:");
        stream.forEach(f -> System.out.println(f));



        // 2️⃣ collect() - collect fruits that start with 'a' into a List
        stream = fruits.stream();
        List<String> startsWithA = stream
                                    .filter(f -> f.startsWith("a"))
                                    .collect(Collectors.toList());
        System.out.println("collect (starts with 'a'): " + startsWithA);



        // 3️⃣ reduce() - concatenate all fruits separated by comma
        stream = fruits.stream();
        String allFruits = stream
                            .reduce("", (a, b) -> a.isEmpty() ? b : a + ", " + b);
        System.out.println("reduce (all fruits concatenated): " + allFruits);



        // 4️⃣ count() - count how many fruits contain the letter 'e'
        stream = fruits.stream();
        long countE = stream
                        .filter(f -> f.contains("e"))
                        .count();
        System.out.println("count (fruits containing 'e'): " + countE);



        // 5️⃣ anyMatch() - check if any fruit equals "banana"
        stream = fruits.stream();
        boolean hasBanana = stream.anyMatch(f -> f.equals("banana"));
        System.out.println("anyMatch (has banana?): " + hasBanana);



        // 6️⃣ allMatch() - check if all fruits have length > 2
        stream = fruits.stream();
        boolean allLongerThan2 = stream.allMatch(f -> f.length() > 2);
        System.out.println("allMatch (all fruits length > 2?): " + allLongerThan2);



        // 7️⃣ noneMatch() - check if no fruit equals "kiwi"
        stream = fruits.stream();
        boolean noKiwi = stream.noneMatch(f -> f.equals("kiwi"));
        System.out.println("noneMatch (no kiwi?): " + noKiwi);



        // 8️⃣ findFirst() - get first fruit
        stream = fruits.stream();
        Optional<String> firstFruit = stream.findFirst();
        System.out.println("findFirst: " + firstFruit.orElse("none"));



        // 9️⃣ findAny() - get any fruit (especially useful in parallel)
        stream = fruits.stream().parallel();
        Optional<String> anyFruit = stream.findAny();
        System.out.println("findAny: " + anyFruit.orElse("none"));



        // 🔟 min() - get fruit with minimum length (using Comparator)
        stream = fruits.stream();
        Optional<String> minFruit = stream.min(Comparator.comparingInt(String::length));
        System.out.println("min (fruit with shortest name): " + minFruit.orElse("none"));


        
        // 1️⃣1️⃣ max() - get fruit with maximum length (using Comparator)
        stream = fruits.stream();
        Optional<String> maxFruit = stream.max(Comparator.comparingInt(String::length));
        System.out.println("max (fruit with longest name): " + maxFruit.orElse("none"));
    }
}
