public class ForStatementChallenge {
    public static void main(String[] args) {
        int numOfPrimesFound = 0;
        for (int i = 10; i < 50; i++) {
            if (numOfPrimesFound >= 10) {
                break;
            } else {
                if (isPrime(i)) {
                    System.out.println(i);
                    numOfPrimesFound ++;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
