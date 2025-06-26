import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class EnhancedForLoopExamples {
    public static void main(String[] args) {
        // 1. Enhanced for loop with an array of ints
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Array element: " + num);
        }

        // 2. Enhanced for loop with a List of Strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        for (String fruit : fruits) {
            System.out.println("List element: " + fruit);
        }

        // 3. Enhanced for loop with a Set of Doubles
        Set<Double> prices = new HashSet<>();
        prices.add(9.99);
        prices.add(19.99);
        prices.add(29.99);
        for (double price : prices) {
            System.out.println("Set element: " + price);
        }

        // 4. Enhanced for loop with keys of a Map
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);
        for (String name : ageMap.keySet()) {
            System.out.println("Map key: " + name);
        }

        // 5. Enhanced for loop with values of a Map
        for (int age : ageMap.values()) {
            System.out.println("Map value: " + age);
        }
    }
}
