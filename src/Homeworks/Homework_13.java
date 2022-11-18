package Homeworks;

import java.util.Scanner;

public class Homework_13 {
    public static void main(String[] args) {
        /*
        Write a calculator program by following instructions:
        1) Ask the user to enter 1st number
        2) Ask the user to enter second number
        3) Ask the user to select the operation ( ask user to enter 1 for Summation, 2 for Subtraction, 3 for
        Multiplication, and 4 for division.)
        4) based on the selection perform operation and print the result of the operation
        (Ex. enter 1st number : 20
	         enter 2nd number: 25
	    Select operation  enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division.: 1
	    The result is : 45.)
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        double number1 = scan.nextDouble();scan.nextLine();
        System.out.println("Please enter the second number: ");
        double number2 = scan.nextDouble();scan.nextLine();
        System.out.println("Please select an operation; enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division ");
        int operation = scan.nextInt();

        if (operation ==1){
            System.out.println("The result is: "+ (number1+number2));
        } else if (operation==2) {
            System.out.println("The result is: "+ (number1- number2));
        } else if (operation==3) {
            System.out.println("The result is: "+ (number1*number2));
        } else {
            System.out.println("The result is: "+(number1/number2));
        }
    }
}
