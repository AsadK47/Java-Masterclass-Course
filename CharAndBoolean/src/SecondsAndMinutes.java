public class SecondsAndMinutes {
    public static void main(String[] args) {
        getDurationString(580, 60);
        getDurationString(3700);
    }

    public static void getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 60)) {
            System.out.println("Invalid value");
            return;
        }

        long hours = 0;

        boolean minutesFromSeconds = seconds % 60 == 0;

        if (minutesFromSeconds) {
            minutes += Math.round(seconds / 60);
            seconds = 0;
        }

        hours += Math.round(minutes / 60);
        minutes = minutes % 60;

        System.out.println(hours + "h " + minutes + "m " + seconds + "s");
    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
            return;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        getDurationString(minutes, remainingSeconds);
    }
}
