package ControlFlow_Challenges;

public class NumberPolindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome (int number) {
        if (number < 0){
            number *= -1;
        }
        int reverse = 0;
        int numberToUse = number;
        StringBuilder answer = new StringBuilder();

        while (numberToUse != 0){
            answer.append(numberToUse % 10);
            numberToUse /= 10;
        }
        reverse = Integer.parseInt(answer.toString());
        return number == reverse;
    }
}
