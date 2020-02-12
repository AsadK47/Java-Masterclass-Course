public class Switch {
    public static void main(String[] args) {
        int switchValue = 3;
        char charValue = 'C';

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was a 3, 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        switch (charValue) {
            case 'A':
                System.out.println("Value is A");
                break;

            case 'B':
                System.out.println("Value is B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("Value is " + charValue);
                break;

            default:
                System.out.println("Value is not the first 5 letters of the alphabet");
                break;
        }

        String month = "JunE";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }
    }
}
