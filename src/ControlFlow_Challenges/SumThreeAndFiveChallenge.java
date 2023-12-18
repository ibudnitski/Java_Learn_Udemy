package ControlFlow_Challenges;

public class SumThreeAndFiveChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Found mathc: " + i);
                sum += i;
                counter++;
                if (counter == 5){
                    break;
                }
            }
        }
        System.out.println("counter = " + counter);
        System.out.println("sum = " + sum);
    }
}
