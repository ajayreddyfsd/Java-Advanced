import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class DateTimeExample {
    public static void main(String[] args) {
        // Current date
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);  // e.g. 2025-06-25

        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);  // e.g. 19:30:45.123

        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + now);  // e.g. 2025-06-25T19:30:45.123

        // Zoned date and time (with timezone)
        ZonedDateTime zonedNow = ZonedDateTime.now();
        System.out.println("Zoned Now: " + zonedNow);  // e.g. 2025-06-25T19:30:45.123-04:00[America/Toronto]

        // Creating specific date with of()
        LocalDate specificDate = LocalDate.of(2023, 12, 31);
        System.out.println("Specific Date: " + specificDate);  // 2023-12-31

        // Creating specific time with of()
        LocalTime specificTime = LocalTime.of(14, 30, 0);
        System.out.println("Specific Time: " + specificTime);  // 14:30

        // Creating specific datetime with of()
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 12, 31, 14, 30, 0);
        System.out.println("Specific DateTime: " + specificDateTime);  // 2023-12-31T14:30

        // Creating ZonedDateTime for a specific timezone
        ZonedDateTime zonedSpecific = ZonedDateTime.of(specificDateTime, ZoneId.of("Asia/Tokyo"));
        System.out.println("Zoned Specific DateTime: " + zonedSpecific);  // 2023-12-31T14:30+09:00[Asia/Tokyo]
    }
}
