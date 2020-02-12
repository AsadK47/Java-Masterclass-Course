public class Sum3And5Challenge {
    public static void main(String[] args) {
        int numToSum = 0;
        int numToSumCounter = 0;
        for (int i = 1; i < 1000; i++) {
            if (numToSumCounter >= 5) {
                break;
            } else {
                if (i % 15 == 0) {
                    numToSum += i;
                    numToSumCounter++;
                }
            }
        }
        System.out.println(numToSum);
    }
}
