package ControlFlow_Challenges;

public class PrimeNumberChallenge {
    public static void main(String[] args) {
        int primeNumberCounter = 0;
        for (int i = 10; i <= 50 ; i++) {
            if (isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                primeNumberCounter++;
                if (primeNumberCounter == 3){
                    System.out.println("First three prime numbers found!");
                    break;
                }
            }
        }
    }

    public static boolean isPrime( int wholeNumber){
        if (wholeNumber <= 2 ){
            return wholeNumber == 2;
        }

        for (int devisor = 2; devisor <= wholeNumber / 2; devisor++) {
            if (wholeNumber % devisor == 0){
                return false;
            }
        }
        return true;
    }

}
