package Challenges;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("Person height in cm will be: " + convertToCentimeters(5,8));
    }

    public static double convertToCentimeters(int heightInches){
        return heightInches * 2.54d;
    }

    public static double convertToCentimeters(int heightFeet, int remainingHeightInches){
        int result = (heightFeet * 12) + remainingHeightInches;
        return convertToCentimeters(result);
    }

}
