package Expressions_Statements_and_more_Challenges;

public class CelciusConverter {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
        System.out.println(9/5.0 + 32);
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код

        double result = 32 + celsius;

        return result;
    }
}
