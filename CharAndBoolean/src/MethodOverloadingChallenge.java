public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(calcFeetAndInchesToCentimeters(10), -10);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches parameter");
            return -1;
        }

        double feetInCentimetres = feet * 30.48;
        double inchInCentimetres = inches * 2.54;
        double valueInCentimetres = feetInCentimetres + inchInCentimetres;

        System.out.println(feet + " feet, " + inches + " inches = " + valueInCentimetres + " cm");
        return valueInCentimetres;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        return inches / 12;
    }
}
