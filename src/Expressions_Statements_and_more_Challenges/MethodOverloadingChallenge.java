package Expressions_Statements_and_more_Challenges;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("Person height in cm will be: " + convertToCentimeters(6,0));
    }

    public static double convertToCentimeters(int heightInches){
        return heightInches * 2.54d;
    }

    public static double convertToCentimeters(int heightFeet, int remainingHeightInches){
        return convertToCentimeters((heightFeet * 12) + remainingHeightInches);
    }

}
