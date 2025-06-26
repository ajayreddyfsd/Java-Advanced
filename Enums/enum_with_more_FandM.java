enum Day {
    // Enum constants with 3 fields: dayNumber, shortName, isWeekend
    SUNDAY(1, "Sun", true),
    MONDAY(2, "Mon", false),
    TUESDAY(3, "Tue", false),
    WEDNESDAY(4, "Wed", false),
    THURSDAY(5, "Thu", false),
    FRIDAY(6, "Fri", false),
    SATURDAY(7, "Sat", true);

    // Fields
    private final int dayNumber;
    private final String shortName;
    private final boolean isWeekend;

    // Constructor
    Day(int dayNumber, String shortName, boolean isWeekend) {
        this.dayNumber = dayNumber;
        this.shortName = shortName;
        this.isWeekend = isWeekend;
    }

    // Getters
    public int getDayNumber() {
        return dayNumber;
    }

    public String getShortName() {
        return shortName;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    // Additional methods
    public boolean isWeekday() {
        return !isWeekend;
    }

    public String getDescription() {
        return this.name() + " (" + shortName + ") - Day " + dayNumber +
               (isWeekend ? " [Weekend]" : " [Weekday]");
    }
}

public class EnumAdvancedExample {
    public static void main(String[] args) {
        Day today = Day.THURSDAY;

        System.out.println("Today is " + today);
        System.out.println("Short name: " + today.getShortName());
        System.out.println("Day number: " + today.getDayNumber());
        System.out.println("Is weekend? " + today.isWeekend());
        System.out.println("Is weekday? " + today.isWeekday());
        System.out.println("Description: " + today.getDescription());

        System.out.println("\nAll days:");
        for (Day day : Day.values()) {
            System.out.println(day.getDescription());
        }
    }
}
