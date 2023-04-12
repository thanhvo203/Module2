package lesson8.exercise.tennis_game;

public class TennisGame {
    private static int playerScore1;
    private static int playerScore2;
    private static String playerName1;
    private static String playerName2;


    public static String equalScore(int playerScore1, int playerScore2) {
        String score = "";
        if (playerScore1 == playerScore2) {
            switch (playerScore1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        return score;
    }

    public static String advantagePlayer() {
        int pointAdvantage = playerScore1 - playerScore2;
        if (pointAdvantage == 1) {
            return playerName1 = "Advantage player1";
        } else {
            return playerName2 = "Advantage player2";
        }
    }

    public static String win() {
        int pointWin = playerScore1 - playerScore2;
        if (pointWin >= 2) {
            return playerName1 = "Win for player1";
        } else {
            return playerName1 = "Win for player2";
        }
    }

    public static String getScore(String playerName1, String playerName2, int playerScore1, int playerScore2) {
        String score = " ";
        int countScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                countScore = playerScore1;
            } else {
                score += "-";
                countScore = playerScore2;
            }
            switch (countScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}
