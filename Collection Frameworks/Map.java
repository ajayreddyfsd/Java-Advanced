//using hashmap

import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        
        System.out.println("Map elements:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
        // Get value by key
        System.out.println("Student with ID 102: " + studentMap.get(102));
    }
}
