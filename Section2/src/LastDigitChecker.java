public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 51, 61));
        System.out.println(hasSameLastDigit(44, 53, 55));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        boolean x = false;
        if ((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {
            return false;
        }

        int remainderNum1 = num1 % 10;
        int remainderNum2 = num2 % 10;
        int remainderNum3 = num3 % 10;

        if ((remainderNum1 == remainderNum2) || (remainderNum1 == remainderNum3) || (remainderNum2 == remainderNum3)) {
            x = true;
        }

        return x;
    }

    public static boolean isValid(int num1) {
        boolean x = true;
        if (num1 < 10 || num1 > 1000) {
            x = false;
        }

        return x;
    }
}
