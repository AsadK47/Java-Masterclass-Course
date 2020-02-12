public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 20));
        System.out.println(isCatPlaying(false, 25));
        System.out.println(isCatPlaying(true, 37));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean catPlaying = false;
        boolean tempForCat = temperature > 24 && temperature < 36;
        boolean tempForCatInSummer = temperature > 24 && temperature < 46;

        if (!summer && tempForCat || summer && tempForCatInSummer) {
            catPlaying = true;
        }

        return catPlaying;
    }


}
