package Homeworks;

import java.util.Scanner;

public class Homework_25 {
    //Write a code where the user is asked to enter an integer number
    //- sum of all the odd numbers between 1 to given number (included) but exclude the 9,11,23,35 from
    // the total sum if those numbers happen to be in the range of 1 to the given number.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int Num = scan.nextInt();

       int count = 0;

        for (int i = 0; i <=Num ; i++) {

            if(i%2!=0 && i!=9 && i!=11 && i!=23 & i!=35){
                count=count+i;
                System.out.println("the numbers : "+i);
            }
        }
        System.out.println(count);
    }
}
