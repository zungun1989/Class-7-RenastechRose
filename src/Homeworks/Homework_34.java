package Homeworks;

import java.util.Arrays;

public class Homework_34 {
    public static void main(String[] args) {
        //Write code where it shifts all the elements in array by one index and put the first index at the end of the array
        //example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}

        int [] numbers = {2,3,4,5,6,7,8,9};

        int dummy = numbers[0];
        numbers [0] = numbers[1];
        numbers[1]=numbers[2];
        numbers[2] =numbers[3];
        numbers [3] = numbers [4];
        numbers [4] = numbers[5];
        numbers [5] = numbers[6];
        numbers [6] = numbers[7];
        numbers[7] = dummy;

        System.out.println("The shifted array is: "+ Arrays.toString(numbers));
    }
}
