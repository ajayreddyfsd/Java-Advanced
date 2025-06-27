import java.util.*;
import java.util.stream.*;

public class OptionalInStreamsExplicit {
    public static void main(String[] args) {

        List<Double> prices = List.of(89.99, 49.99, 23.50, 99.99, 150.0, 10.0);

        // 1️⃣ findFirst()
        Stream<Double> stream1 = prices.stream();
        Optional<Double> firstPrice = stream1.findFirst();
        System.out.println("First price: " + firstPrice.orElse(-1.0));


        // 2️⃣ findAny() with parallel stream
        Stream<Double> stream2 = prices.parallelStream();
        Optional<Double> anyPrice = stream2.findAny();
        System.out.println("Any price: " + anyPrice.orElse(-1.0));


        // 3️⃣ min()
        Stream<Double> stream3 = prices.stream();
        Optional<Double> minPrice = stream3.min(Double::compare);
        System.out.println("Minimum price: " + minPrice.orElse(-1.0));


        // 4️⃣ max()
        Stream<Double> stream4 = prices.stream();
        Optional<Double> maxPrice = stream4.max(Double::compare);
        System.out.println("Maximum price: " + maxPrice.orElse(-1.0));


        // 5️⃣ reduce() without identity
        Stream<Double> stream5 = prices.stream();
        Optional<Double> total = stream5.reduce((a, b) -> a + b);
        System.out.println("Total of all prices: " + total.orElse(0.0));


        // 6️⃣ reduce() with identity
        Stream<Double> stream6 = prices.stream();
        double totalSafe = stream6.reduce(0.0, (a, b) -> a + b);
        System.out.println("Total with identity: " + totalSafe.orElse(0));


        // 7️⃣ Handle empty list safely
        List<Double> emptyPrices = List.of();
        Stream<Double> emptyStream = emptyPrices.stream();
        Optional<Double> emptyMin = emptyStream.min(Double::compare);
        System.out.println("Min from empty list: " + emptyMin.orElse(-1.0));
    }
}
