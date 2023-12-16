package Expressions_Statements_and_more_Challenges;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte byteNumber = 10;
        short shortNumber = 100;
        int intNumber = 5000;
        long longNumber = 50000L + 10L *(byteNumber + shortNumber + intNumber);

        System.out.println("longNumber = " + longNumber);
    }
}
