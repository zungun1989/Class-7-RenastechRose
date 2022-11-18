package Homeworks;

import java.util.Scanner;

public class Homework_26 {
    //Write a code where it ask user to enter an integer number
    //- Reverse the given number and print the result
    //- Example input ( 5678 )
    //- Example output ( 8765 )

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int Num = scan.nextInt();

        int reverse=0 ;

        for(int i= 0; Num > 0; Num/=10) {
            int digit = Num % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reversed Number: " + reverse);
    }
}


