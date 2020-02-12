public class WhileStatements {
    public static void main(String[] args) {
//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("****************");
//
//        for (int i = 1; i < 7; i++) {
//            System.out.println("Count value is " + i);
//        }
//
//        count = 1;
//
//        while (true) {
//            if (count == 5) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);

        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(3));

        int number = 4;
        int finishNumber = 20;
        int evenNumberTotal = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("The even number is " + number);
            evenNumberTotal++;

            if (evenNumberTotal >= 5) {
                break;
            }
        }
        System.out.println("The number of even numbers are  " + evenNumberTotal);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
