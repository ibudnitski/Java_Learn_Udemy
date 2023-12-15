package Basics;

import java.util.Scanner;

public class GameOverGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNext("exit")){
            int score = sc.nextInt();
            finalScoreCalculation(score);
        }
    }

    public static void finalScoreCalculation(int userScore){
        if(userScore >= 1000){
            System.out.println("Your final score is " + (userScore + 1000));
        } else if ((userScore < 1000) && (userScore > 500)) {
            System.out.println("Your final score is " + (userScore + 500));
        } else {
            System.out.println("Your final score is " + (userScore + 200));
        }
    }
}
