public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        int sumOfNumbers = 0;
        if (number < 10) {
            return -1;
        }

        String numbers = String.valueOf(number);
        String[] stringArray = numbers.split("(?<=.)");

        for (int i = 0; i < stringArray.length; i++) {
            sumOfNumbers += Integer.parseInt(stringArray[i]);
        }
        return sumOfNumbers;
    }
}
