package Homeworks;

import java.util.Scanner;

public class Homework_9 {
    public static void main(String[] args) {
        //Write a code where User is being asked for the first number, second number and third number. Then Compare those number print the maximum number.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int FirstNumber = scan.nextInt(); scan.nextLine();
        System.out.println("Please enter the second number: ");
        int SecondNumber = scan.nextInt(); scan.nextLine();
        System.out.println("Please enter the third number: ");
        int ThirdNumber = scan.nextInt();scan.nextLine();

        if (FirstNumber>SecondNumber && FirstNumber>ThirdNumber){
            System.out.println("The maximum number is: "+ FirstNumber);
        } else if (SecondNumber>FirstNumber && SecondNumber>ThirdNumber) {
            System.out.println("The maximum number is: "+ SecondNumber);
        } else {
            System.out.println("The maximum number is: " + ThirdNumber);
        }
    }
}
