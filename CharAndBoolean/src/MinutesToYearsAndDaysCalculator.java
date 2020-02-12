public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(527040);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
            return;
        }

        int days = 0;
        int years = 0;

        long yearsRemainder = minutes % 525600;

        years += Math.round(minutes / 525600);
        days += yearsRemainder / 1440;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

}
