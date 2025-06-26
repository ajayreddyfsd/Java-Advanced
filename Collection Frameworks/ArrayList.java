import java.util.ArrayList;
import java.util.List;

public class MultiTypeAndTypedLists {
    public static void main(String[] args) {
        // Mixed type ArrayList using Object
        List<Object> mixedList = new ArrayList<>();
        mixedList.add("Hello");            // String
        mixedList.add(100);                // Integer (autoboxed)
        mixedList.add(45.67);              // Double (autoboxed)
        mixedList.add(true);               // Boolean (autoboxed)
        mixedList.add(new int[]{1, 2, 3});// int array

        System.out.println("Mixed List:");
        for (Object item : mixedList) {
            System.out.println(item + " - " + item.getClass().getSimpleName());
        }

        System.out.println();

        // Homogeneous ArrayList of Strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        System.out.println("String List:");
        for (String item : stringList) {
            System.out.println(item);
        }

        System.out.println();

        // Homogeneous ArrayList of Integers
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        System.out.println("Integer List:");
        for (Integer item : intList) {
            System.out.println(item);
        }

        System.out.println();

        // Homogeneous ArrayList of Doubles
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        System.out.println("Double List:");
        for (Double item : doubleList) {
            System.out.println(item);
        }

        System.out.println();

        // Homogeneous ArrayList of Booleans
        List<Boolean> booleanList = new ArrayList<>();
        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(true);

        System.out.println("Boolean List:");
        for (Boolean item : booleanList) {
            System.out.println(item);
        }
    }
}
