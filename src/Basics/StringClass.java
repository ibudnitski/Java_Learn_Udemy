package Basics;

import java.lang.reflect.Type;

public class StringClass {
    public static void main(String[] args) {
        String myString = "Hello!";
        String name = "Igor!";
        System.out.println("Greetings! " + myString + " " + name);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println("numberString = " + numberString);
        double dNumber = Double.parseDouble(numberString);

    }
}
