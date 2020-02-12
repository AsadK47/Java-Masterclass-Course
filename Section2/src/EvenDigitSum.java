public class EvenDigitSum {
    public static void main(String[] args) {

    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        }

        String numbers = String.valueOf(number);
        String[] stringArray = numbers.split("(?<=.)");

        for (int i = 0; i < stringArray.length; i++) {
            if (Integer.parseInt(stringArray[i]) % 2 == 0) {
                sum += Integer.parseInt(stringArray[i]);
            }
        }

        return sum;
    }
}
