package Homeworks;

import java.util.Scanner;

public class Homework_20 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter a number.
        //Find the sum of all the even numbers between 0 to that number (included)
        //Find the sum of all the odd numbers between 0 to that number (included)

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();

        int ResultEven = 0;
        int ResultOdd = 0;

        for (int i = 0; i <= num ; i++) {
            if (i%2==0){
                ResultEven=ResultEven+i;
            } else {
                ResultOdd = ResultOdd+i;
            }
        }
        System.out.println("The sum of all even numbers between 0 and "+num+": "+ResultEven);
        System.out.println("The Sum of all odd numbers between 0 and "+num+": "+ResultOdd);
    }
}
