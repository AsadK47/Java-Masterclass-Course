public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(5));
    }

    public static boolean isPerfectNumber(int number) {
        int ultraNumber = 0;
        boolean isPerfectNumber = false;

        if (number < 1) {
            return false;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                ultraNumber += i;
            }
        }

        if (ultraNumber == number) {
            isPerfectNumber = true;
        }

        return isPerfectNumber;
    }
}
