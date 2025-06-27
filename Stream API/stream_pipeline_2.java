import java.util.*;
import java.util.stream.*;

public class EmployeeNamePipeline {
    public static void main(String[] args) {

        // ✅ Step 1: Raw employee names (duplicates, random casing, extra spaces)
        List<String> employees = List.of(
            "  alice", "Bob", "ALICE", " anna ", "bob", "charlie", "Anna", "alex", "ALex"
        );

        // ✅ Step 2: Create stream from the list
        Stream<String> nameStream = employees.stream();

        // ✅ Step 3: Stream pipeline to clean, filter, and print names
        nameStream
            .map(String::trim)                            // 🔄 Remove extra spaces
            .map(name -> name.toLowerCase())              // 🔄 Normalize casing
            .distinct()                                   // 🔄 Remove duplicates
            .map(name -> Character.toUpperCase(name.charAt(0)) + name.substring(1))  // 🔄 Capitalize first letter
            .filter(name -> name.startsWith("A"))         // 🔄 Keep only names starting with A
            .sorted()                                     // 🔄 Alphabetical sort
            .forEach(name -> System.out.println(name));   // 🔚 Print cleaned names
    }
}
