package Homeworks;

import java.util.Scanner;

public class Homework_18 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter an integer number:
        //Using the given number find the factorial of that number and Print the result.
        //example: 5 ==> 5! = 5*4*3*2*1 = 120

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer number :");
        int Num1 = scan.nextInt();

        int result=1;

        for (int i = Num1; i >0 ; i--) {
            result = result*i;
        }
        System.out.println(result);

    }
}
