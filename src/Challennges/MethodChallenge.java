package Challennges;

public class MethodChallenge {
    public static void main(String[] args) {
        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(1000));
        System.out.println(calculateHighScorePosition(500));
        System.out.println(calculateHighScorePosition(100));
        System.out.println(calculateHighScorePosition(25));
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
