import java.util.*;
import java.util.stream.*;

public class ProductPricePipeline {
    public static void main(String[] args) {

        // ✅ Step 1: Source data - list of product prices with duplicates
        List<Double> prices = List.of(49.99, 89.99, 23.50, 99.99, 89.99, 150.0, 10.0);

        // ✅ Step 2: Convert list to Stream
        Stream<Double> priceStream = prices.stream();

        // ✅ Step 3: Intermediate + Terminal operations
        priceStream
            .filter(p -> p > 50)                        // 🔄 Keep prices > $50
            .distinct()                                 // 🔄 Remove duplicates
            .sorted()                                   // 🔄 Sort in ascending order
            .map(p -> p + (p * 0.15))                   // 🔄 Add 15% tax to each price
            .forEach(p -> System.out.printf("$%.2f\n", p)); // 🔚 Print each final price
    }
}
