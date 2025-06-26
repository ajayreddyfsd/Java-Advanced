import java.util.HashMap;
import java.util.Map;

public class DictionaryExample {
    public static void main(String[] args) {
        // Declare and initialize a dictionary
        Map<String, Integer> dict = new HashMap<>();

        // Add key-value pairs (like dict["key"] = value)
        dict.put("apple", 3);
        dict.put("banana", 5);
        dict.put("orange", 2);

        // Access value (like dict["apple"])
        System.out.println("apple: " + dict.get("apple"));  // 3

        // Check if key exists (like "banana" in dict)
        System.out.println("Contains 'banana'? " + dict.containsKey("banana")); // true

        // Iterate over keys and values (like for key, val in dict.items())
        for (Map.Entry<String, Integer> entry : dict.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Remove a key
        dict.remove("orange");

        // Size of dictionary
        System.out.println("Size: " + dict.size());  // 2

        // Check if dictionary is empty
        System.out.println("Is empty? " + dict.isEmpty());  // false
    }
}
