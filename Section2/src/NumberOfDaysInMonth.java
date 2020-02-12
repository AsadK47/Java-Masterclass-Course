public class NumberOfDaysInMonth {
    public static void main(String[] args) {

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

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        boolean itIsDivisibleByFour = year % 4 == 0;
        boolean itIsDivisibleByAHundred = year % 100 == 0;
        boolean itIsDivisibleByFourHundred = year % 400 == 0;

        if (itIsDivisibleByFour) {
            if (itIsDivisibleByAHundred) {
                if (itIsDivisibleByFourHundred) {
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            return 31;

                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            return 30;

                        case 2:
                            return 29;

                        default:
                            return -1;
                    }
                } else {
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            return 31;


                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            return 30;

                        case 2:
                            return 28;

                        default:
                            return -1;
                    }
                }
            } else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;


                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;

                    case 2:
                        return 29;

                    default:
                        return -1;
                }
            }
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;

                case 2:
                    return 28;

                default:
                    return -1;
            }
        }
    }
}
