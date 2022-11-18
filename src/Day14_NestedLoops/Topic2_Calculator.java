package Day14_NestedLoops;

import java.util.Scanner;

public class Topic2_Calculator {
    /*
    write a calculator program where it will do following;
    1) User will be asked to make the decision 1 for sum, 2 for sub, 3 for div and 4 for mult, any other numbers to exit
    2) after user make the selection, user should be asked to enter the first number
    3) after that user should be asked to enter teh second number
    4) Perform the calculation and print the result.
    5) perform the calculation for different entries unless user select to exit
     */

    public static void main(String[] args) {
        System.out.println("*****Welcome to Calculator*****");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please make the selection: 1 For SUM, 2 For SUB, 3 For DIV and 4 for Multi, any other to exit:  ");
        int selection = scan.nextInt();

        while (selection==1 || selection==2 || selection==3 || selection==4){

            System.out.println("Please enter the first number: ");
            double num1 = scan.nextDouble();
            System.out.println("Please enter the second number: ");
            double num2 = scan.nextDouble();
            double result = 0;

            if (selection==1){
                result = num1+num2;
            } else if (selection==2) {
                result = num1-num2;
            } else if (selection==3) {
                result = num1/num2;
            } else {
                result = num1*num2;
            }
            System.out.println("The result of the operation is: "+result);
            System.out.println("Please make the selection: 1 For SUM, 2 For SUB, 3 For DIV and 4 for Multi, any other to exit:  ");
            selection = scan.nextInt();
        }
        System.out.println("Thank you for using Calculator, you are exited now ");
    }
}
