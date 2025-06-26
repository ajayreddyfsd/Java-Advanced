enum Day {
    // Enum constants with associated field value (int: day number)
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    // Field
    private final int dayNumber;

    // Constructor (private by default)
    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    // Getter method
    public int getDayNumber() {
        return dayNumber;
    }

    // Custom method
    public boolean isWeekend() {
        return this == SUNDAY || this == SATURDAY;
    }
}

public class EnumWithFields {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        System.out.println("Today is " + today);
        System.out.println("Day number: " + today.getDayNumber());
        System.out.println("Is weekend? " + today.isWeekend());

        // Loop and print details for all days
        for (Day day : Day.values()) {
            System.out.println(day + ": day " + day.getDayNumber() + ", weekend? " + day.isWeekend());
        }
    }
}
