package Challenges;

/*
* We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
* Write a method named hasTeen with 3 parameters of type int.
* The method should return boolean
* and it needs to return true if one of the
* parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
* */
public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 99, 1339));
    }
    public static boolean hasTeen(int age1, int age2, int age3){
        if ((age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19)){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }

}
