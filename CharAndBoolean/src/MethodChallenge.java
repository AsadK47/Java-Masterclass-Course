public class MethodChallenge {
    public static void main(String[] args) {
        String playerOne = "Triss";
        String playerTwo = "Yennefer";
        String playerThree = "Jaskier";
        String playerFour = "Geralt";

        int playerOneScore = 1500;
        int playerTwoScore = 900;
        int playerThreeScore = 400;
        int playerFourScore = 50;

        int playerOnePosition = calculateHighScorePosition(playerOneScore);
        int playerTwoPosition = calculateHighScorePosition(playerTwoScore);
        int playerThreePosition = calculateHighScorePosition(playerThreeScore);
        int playerFourPosition = calculateHighScorePosition(playerFourScore);

        displayHighScorePosition(playerOne, playerOnePosition);
        displayHighScorePosition(playerTwo, playerTwoPosition);
        displayHighScorePosition(playerThree, playerThreePosition);
        displayHighScorePosition(playerFour, playerFourPosition);
    }

    private static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " has managed to get into position " + position + " on the high score table.");
    }

    private static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;

        int position = 4; // Assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
