package ControlFlow_Challenges;

public class DigitSumChallenge {
    public static void main(String[] args) {
/*        int startNumber = 125;
        int number = 0;

        number = number + 125 % 10;
        System.out.println("number = " + number);
        startNumber /= 10;
        System.out.println("startNumber = " + startNumber);
        number = number + startNumber % 10;
        System.out.println("number = " + number);
        startNumber /= 10;
        System.out.println("startNumber = " + startNumber);
        number += startNumber;
        System.out.println("number = " + number);
        startNumber -= startNumber;
        System.out.println("startNumber = " + startNumber);*/
        System.out.println(sumDigit(1000));
        System.out.println(sumDigit(125));
        System.out.println(sumDigit(111111111));
        System.out.println(sumDigit(456));
    }

    public static int sumDigit(int number) {
        int result = 0;
        if (number < 0) {
            return -1;
        }
        while (number != 0){
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
