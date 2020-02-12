public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double positiveNum1;
        double positiveNum2;

        if ((num1 > 0.0 && num2 > 0.0) || (num1 < 0.0 && num2 < 0.0)) {
            positiveNum1 = Math.abs(num1 * 1000);
            positiveNum2 = Math.abs(num2 * 1000);
        } else {
            return Math.floor(num1) == Math.floor(num2);
        }

        return Math.floor(positiveNum1) == Math.floor(positiveNum2);
    }
}
