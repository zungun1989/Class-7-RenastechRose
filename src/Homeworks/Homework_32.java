package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_32 {
    public static void main(String[] args) {
        //Write   a     program   to   with following requirements
        //1) user should be prompted about how many numbers is going to be entered
        //2) User should be prompted for the values of the numbers
        //3) Reverse the all the given numbers and print it

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter how many numbers you want to be in array: ");
        int size = scan.nextInt();

        int [] numbers = new int[size];
        int [] reverse = new int[numbers.length];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter "+(i+1)+". number: ");
            numbers[i] = scan.nextByte();
        }
        System.out.println("The array with the given numbers: "+Arrays.toString(numbers));
        int j = 0;
        for (int i =numbers.length-1; i>=0 ; i--) {
            reverse[i]=numbers[j];
            j++;
        }
        System.out.println("The reversed array: "+ Arrays.toString(reverse));
    }

}

