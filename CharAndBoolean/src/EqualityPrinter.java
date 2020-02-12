public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(-1, 1, 1);
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int n1, int n2, int n3) {
        if (n1 < 0 || n2 < 0 || n3 < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String message = null;

        boolean n1Andn2 = n1 == n2;
        boolean n2Andn3 = n2 == n3;
        boolean n1Andn3 = n1 == n3;

        if (n1Andn2 && n2Andn3 && n1Andn3) {
            message = "All numbers are equal";
        } else if (!n1Andn2 && !n2Andn3 && !n1Andn3) {
            message = "All numbers are different";
        } else {
            message = "Neither all are equal or different";
        }

        System.out.println(message);
    }
}
