package ControlFlow;

public class SwitchFirst {
    public static void main(String[] args) {
        int value = 6;

        /*switch (value){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5: case 6: case 7:
                System.out.println("Five, Six or Seven");
                break;
            default:
                System.out.println("Wrong number!");
        }*/

        switch (value){
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3,4,5 -> System.out.println("Three, Four or Five");
            default -> System.out.println("Invalid number");
        }
    }
}
