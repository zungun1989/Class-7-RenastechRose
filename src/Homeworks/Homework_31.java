package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_31 {
    public static void main(String[] args) {
        //Write   a   program   that   creates   an   array   of   10   elements   size.
        // Your   program   should   prompt   the   user   to   input   numbers   in   array   and   then
        // display   the   sum   of   all array   elements. ( we already did this in the class but try to do it again)


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many elements you would like in array: ");
        int size = scan.nextInt();
        int [] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter " +(i+1)+". number: ");
            int num = scan.nextInt();
            nums[i] =num;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum =sum+nums[i];
        }
        System.out.println("The array is: "+ Arrays.toString(nums));
        System.out.println("the sum of all numbers in array: "+sum);
    }
}
