public class CodingExercises {
    private static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = 0;
        if (kilometersPerHour < 0) {
            milesPerHour = -1L;
        } else if (kilometersPerHour >= 0) {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
