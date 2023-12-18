package ControlFlow_Challenges;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(121));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number<0){
            return -1;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(number);
        return Character.getNumericValue(sb.charAt(0)) + Character.getNumericValue(sb.charAt(sb.length()-1));
    }
}
