public class SumOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(2));
        System.out.println(sumOdd(1, 11));
        System.out.println(sumOdd(10, 20));
    }

    public static boolean isOdd(int number) {
        boolean myBoolean = false;

        if (number < 1) {
            return false;
        }

        if (number % 2 != 0) {
            myBoolean = true;
        }

        return myBoolean;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0) {
            return -1;
        }

        int sum = 0;

        for (int i = start; i < end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        if (isOdd(end)) {
            sum += end;
        }

        return sum;
    }
}
