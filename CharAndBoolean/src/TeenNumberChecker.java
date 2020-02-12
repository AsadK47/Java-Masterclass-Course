public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(0, 0, 18));
        System.out.println(hasTeen(99, 99, 99));
        System.out.println(hasTeen(99, 99, 13));
        System.out.println(isTeen(99));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        int[] teenList = {13, 14, 15, 16, 17, 18, 19};
        for (int teen : teenList) {
            if (num1 == teen) {
                return true;
            } else if (num2 == teen) {
                return true;
            } else if (num3 == teen) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTeen(int num1) {
        int[] teenList = {13, 14, 15, 16, 17, 18, 19};
        for (int teen : teenList) {
            if (num1 == teen) {
                return true;
            }
        }
        return false;
    }
}
