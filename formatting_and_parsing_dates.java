import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatParseDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 6, 25);

        // Formatting date to string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
        // Output: Formatted Date: 25-06-2025

        // Parsing string to date
        String dateString = "31-12-2023";
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed Date: " + parsedDate);
        // Output: Parsed Date: 2023-12-31
    }
}
