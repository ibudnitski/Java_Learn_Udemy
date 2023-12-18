package ControlFlow_Challenges;

public class EvenDgitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum (int number) {
        if (number < 0){
            return -1;
        }
        int evenSum = 0;
        int numberForCheck = 0;
        while (number != 0){
            numberForCheck = number % 10;
            number /= 10;
            if (numberForCheck % 2 == 0){
                evenSum += numberForCheck;
            }
        }
        return evenSum;
    }
}
