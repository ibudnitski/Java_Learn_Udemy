package ControlFlow_Challenges;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int counter = 4;
        int endNumber = 20;
        int oddCounter = 0;
        int evenCounter = 0;
        while (counter <= endNumber){
            if (isEven(counter)){
                System.out.println("Even number: " + counter);
                evenCounter++;
            }else {
                oddCounter++;
            }
            counter++;
        }

        System.out.println("evenCounter = " + evenCounter);
        System.out.println("oddCounter = " + oddCounter);
    }

    public static boolean isEven(int number) {
        return number %2 == 0;
    }
}
