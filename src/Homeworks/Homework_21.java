package Homeworks;

import java.util.Scanner;

public class Homework_21 {
    //Write a code where user is asked to enter a number:
    //Calculate the square of all the numbers from 0 to given number and print the result for each number,
    // (square of a number is number*number == > 5*5 = 25 or 6*6 = 36)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int Num = scan.nextInt();
        int Result = 0;
        for (int i = 0; i < Num; i++) {
            Result =i*i;
            System.out.println("Square of "+i+ " is: "+Result);
        }
    }
}
