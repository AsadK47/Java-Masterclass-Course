public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year < 1 || year > 9999) {
            return leapYear;
        }

        boolean itIsDivisibleByFour = year % 4 == 0;
        boolean itIsDivisibleByAHundred = year % 100 == 0;
        boolean itIsDivisibleByFourHundred = year % 400 == 0;

        if (itIsDivisibleByFour) {
            if (itIsDivisibleByAHundred) {
                if (itIsDivisibleByFourHundred) {
                    leapYear = true;
                } else {
                    return leapYear;
                }
            } else {
                leapYear = true;
            }
        } else {
            return leapYear;
        }
        return leapYear;
    }
}
