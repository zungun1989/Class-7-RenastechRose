package Homeworks;

import java.util.Scanner;

public class Homework_35 {
    //Write a method where it takes 2 strings as a parameter and returns true when 2 strings are equal
    // and returns false when they are not equal.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the first word: ");
        String param1 = scan.nextLine();
        System.out.println("Please enter the second word: ");
        String param2 = scan.nextLine();

        AreTheyEqual(param1,param2);

    }
    public static boolean AreTheyEqual(String param1, String param2){
        if (param1.equals(param2)){
            System.out.println("They are equal");
            return true;
        }
        System.out.println("They are not equal");
        return false;
    }
}
