import java.util.Arrays;
import java.util.List;

public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(8);
        printDayOfTheWeekInIf(4);
    }

    public static void printDayOfTheWeek(int day) {
        String message = "";
        switch (day) {
            case 0:
                message = "Sunday";
                break;

            case 1:
                message = "Monday";
                break;

            case 2:
                message = "Tuesday";
                break;

            case 3:
                message = "Wednesday";
                break;

            case 4:
                message = "Thursday";
                break;

            case 5:
                message = "Friday";
                break;

            case 6:
                message = "Saturday";
                break;

            default:
                message = "Invalid day";
                break;

        }
        System.out.println(message);
    }

    public static void printDayOfTheWeekInIf(int day) {
        List<String> daysOfTheWeek = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        if (day > -1 && day < 7) {
            System.out.println(daysOfTheWeek.get(day));
        } else {
            System.out.println("Invalid day");
        }

    }
}
