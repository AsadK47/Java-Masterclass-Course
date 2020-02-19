public class FlourPackProblem {
    public static void main(String[] args) {
//        System.out.println(canPack(1, 5, 5));
//        System.out.println(canPack(0, 5, 6));
        System.out.println(canPack(2, 7, 18));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCounter = 0;
        int bigCounterX = 0;
        int remaining;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        for (int i = 1; i < (goal + 1); i++) {
            if (i % 5 == 0) {
                if (bigCounter == bigCount) {
                    break;
                }
                bigCounter++;
            }
        }

        if (bigCount > 0) {
            bigCounterX = bigCounter * 5;
        }

        remaining = goal - bigCounterX;

        boolean smallGreaterOrEqualToRem = smallCount >= remaining;

        if (bigCounter < 1 && smallGreaterOrEqualToRem) {
            return true;
        } else return bigCounter > 0 && smallGreaterOrEqualToRem;
    }
}
