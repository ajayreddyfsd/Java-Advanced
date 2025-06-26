import java.util.Set;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate, will be ignored
        
        System.out.println("Set elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
