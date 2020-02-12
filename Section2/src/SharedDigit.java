import java.util.stream.Stream;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 54));
        System.out.println(hasSharedDigit(55, 55));
        System.out.println(hasSharedDigit(9, 11));
        System.out.println(hasSharedDigit(11, 49));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        boolean x = false;
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return x;
        }

        String numbers = String.valueOf(num1);
        String[] stringArray = numbers.split("(?<=.)");

        String numbers2 = String.valueOf(num2);
        String[] stringArray2 = numbers2.split("(?<=.)");

        int[] arr = Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Stream.of(stringArray2).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            for (int n : arr2) {
                if (n == arr[i]) {
                    x = true;
                }
            }
        }

        return x;
    }
}
