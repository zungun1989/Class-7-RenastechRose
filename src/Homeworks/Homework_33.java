package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_33 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter for 5 employee salaries and store those salaries
        //Then find the average salary of those 5 employees

        Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter how many salaries you want to be in the array: ");
        int size = Scan.nextInt();

        double [] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter "+(i+1)+". salary: ");
            numbers[i]=Scan.nextInt();
        }
        System.out.println("The salaries in the array: "+ Arrays.toString(numbers));

        double average = (numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4])/5;
        System.out.println("the average salary is: "+average);

    }
}
