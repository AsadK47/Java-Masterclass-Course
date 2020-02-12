public class OperatorsOperandsAndExpressions {
    public static void main(String[] args) {
//        int result = 1 + 2;  // 1 + 2 + 3
//        System.out.println("1 + 2 = " + result);
//        int previousResult = result;
//        System.out.println("previousResult = " + previousResult);

        double value = 20.00;
        double secondValue = 80.00;
        double sumTimesEighty = (value + secondValue) * 100.00;
        System.out.println(sumTimesEighty);
        double remainder = sumTimesEighty % 40.00;
        System.out.println(remainder);

        boolean remainderIsZero = remainder == 0 ? true : false;
        System.out.println(remainderIsZero);

        String remainderIsNotZero = !remainderIsZero ? "Got some reaminder" : "";
        System.out.println(remainderIsNotZero);
    }
}
