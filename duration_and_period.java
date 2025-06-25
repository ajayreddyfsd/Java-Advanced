import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DurationPeriodExample {
    public static void main(String[] args) {
        // Period between two dates (date-based)
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 6, 25);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " 
            + period.getYears() + " years, " 
            + period.getMonths() + " months, " 
            + period.getDays() + " days");
        // Output: Period: 3 years, 5 months, 24 days

        // Duration between two times (time-based)
        LocalTime startTime = LocalTime.of(9, 0, 0);
        LocalTime endTime = LocalTime.of(17, 30, 0);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " 
            + duration.toHours() + " hours and " 
            + (duration.toMinutes() % 60) + " minutes");
        // Output: Duration: 8 hours and 30 minutes
    }
}
