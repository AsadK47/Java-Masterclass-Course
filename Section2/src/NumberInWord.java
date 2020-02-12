import java.util.Arrays;
import java.util.List;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(10);
    }

    public static void printNumberInWord(int number) {
        List<String> numbersAsLetters = Arrays.asList("Zero", "One", "Two", "Three",
                "Four", "Five", "Six", "Seven", "Eight", "Nine");
        if (number <  0 || number > 9) {
            System.out.println("Other");
        } else {
            System.out.println(numbersAsLetters.get(number).toUpperCase());
        }
    }
}
