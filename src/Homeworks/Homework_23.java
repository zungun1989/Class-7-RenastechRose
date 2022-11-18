package Homeworks;

import java.util.Scanner;

public class Homework_23 {
    public static void main(String[] args) {
        //Write a program where the user is being asked to enter
        // a String and that   will   count   how   many   times
        // "a" or 'A'   is   found   in that entered String

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String entry = scan.nextLine();

        int count=0;

        for (int i = 0; i <=entry.length() ; i++) {
            if (entry.charAt(i)=='a'||entry.charAt(i)=='A'){
                count++;
            }

        }
        System.out.println("the total number of 'a' or 'A' in the entry is: "+count);
    }
}
