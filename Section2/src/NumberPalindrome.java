public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int remainder;
        int sum = 0;

        while (number > 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }

        if (sum == originalNumber || number == originalNumber) {
            return true;
        }

        return false;
    }
}
