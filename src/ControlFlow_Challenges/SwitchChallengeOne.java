package ControlFlow_Challenges;

public class SwitchChallengeOne {
    public static void main(String[] args) {

        char charA = 'A';

        switch (charA){
            case 'A':
                System.out.println(charA + " means Alpha");
                break;
            case 'B':
                System.out.println(charA + " means Bravo");
                break;
            case 'C':
                System.out.println(charA + " means Charlie");
                break;
            case 'D':
                System.out.println(charA + " means Delta");
                break;
            default:
                System.out.println(charA + " is invalid!");
                break;
        }
    }
}
