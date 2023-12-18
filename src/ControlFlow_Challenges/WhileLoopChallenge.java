package ControlFlow_Challenges;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int counter = 4;
        int endNumber = 20;
        while (counter <= endNumber){
            if (isEven(counter)){
                System.out.println("Even number: " + counter);
            }
            counter++;
        }
    }

    public static boolean isEven(int number) {
        return number %2 == 0;
    }
}
