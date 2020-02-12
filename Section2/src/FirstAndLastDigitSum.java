public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(101));
        System.out.println(sumFirstAndLastDigit(105));
        System.out.println(sumFirstAndLastDigit(-1));
    }

    public static int sumFirstAndLastDigit(int number) {
        int remainder;
        int firstNumber;

        if (number < 0) {
            return -1;
        }

        remainder = number % 10;
        String numbers = String.valueOf(number);
        String[] stringArray = numbers.split("(?<=.)");
        firstNumber = Integer.parseInt(stringArray[0]);

        return remainder + firstNumber;
    }
}
