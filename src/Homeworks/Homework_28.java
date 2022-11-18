package Homeworks;

public class Homework_28 {
    public static void main(String[] args) {
        //Write a code with following requirements:
        //- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
        //- Print the minimum number in the given array

        int [] nums = {6,7,2,3,90,-2,-90,-122,96,35};
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(min>nums[i]){
                min=nums[i];
            }
        }
        System.out.println("The min number is: "+min);
    }
}
