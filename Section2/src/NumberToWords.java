import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }

    public static void numberToWords(int number) {
        int remainder;
        StringBuilder numberSequence = new StringBuilder();
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(0, "Zero");
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");
        numbers.put(6, "Six");
        numbers.put(7, "Seven");
        numbers.put(8, "Eight");
        numbers.put(9, "Nine");

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        } else if (number == 0) {
            numberSequence.append("Zero");
        }

        int reverseNum = reverse(number);
        int numCount = getDigitCount(number);
        int reverseCount = getDigitCount(reverseNum);

        while (reverseNum != 0) {
            remainder = reverseNum % 10;
            assert false;
            numberSequence.append(numbers.get(remainder)).append(" ");
            reverseNum /= 10;
        }

        if (numCount != reverseCount) {
            for (int i = reverseCount; i < numCount; i++) {
                numberSequence.append("Zero ");
            }
        }

        System.out.println(numberSequence);
    }

    public static int reverse(int num) {
        int remainder;
        int reversed = 0;

        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int num) {
        int remainder;
        List<Integer> integerList = new ArrayList<>();

        if (num < 0) {
            return -1;
        } else if (num == 0) {
            return 1;
        }

        while (num != 0) {
            remainder = num % 10;
            integerList.add(remainder);
            num /= 10;
        }

        return integerList.size();
    }
}
