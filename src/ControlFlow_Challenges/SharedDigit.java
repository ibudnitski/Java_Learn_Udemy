package ControlFlow_Challenges;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(54, 23));
    }

    public static boolean hasSharedDigit(int numOne, int numTwo) {
        if (numOne > 99 || numOne < 10 || numTwo > 99 || numTwo < 10) {
            return false;
        }

        return (numOne % 10 == numTwo % 10 || numOne % 10 == numTwo / 10 || numOne / 10 == numTwo % 10 || numOne/10 == numTwo/10);
    }
}
