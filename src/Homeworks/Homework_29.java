package Homeworks;

public class Homework_29 {
    public static void main(String[] args) {
        //write a code with following requirements
        //- define an array with following values {90,34,23,87,45,36,98}
        //- Print the values that can be divided by 2 or 3

        int [] nums = {90,34,23,87,45,36,98};
        int dev = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0 || nums[i]%3==0){
                dev= nums[i];
                System.out.println("the number that can be devided by 2 or 3 is: "+dev);
            }
        }
    }
}
