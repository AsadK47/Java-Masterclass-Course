public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = false;
        boolean wakingTime = hourOfDay < 8 && hourOfDay >= 0 || hourOfDay == 23;

        if (barking && wakingTime) {
            wakeUp = true;
        }

        return wakeUp;
    }
}
