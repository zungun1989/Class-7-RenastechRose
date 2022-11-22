package Homeworks;

import java.util.Arrays;

public class Homework_36 {
    //Write a method where it takes array of integers and returns the sorted version of that array

    public static void main(String[] args) {
        int [] num = {56,45,78,900,1,5, 79};
        System.out.println("The sorted array is: "+Arrays.toString(sortArray(num)));

    }
    public static int [] sortArray(int[] nums){

        Arrays.sort(nums);
        return nums;
    }
}
