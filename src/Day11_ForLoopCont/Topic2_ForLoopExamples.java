package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic2_ForLoopExamples {
    public static void main(String[] args) {
        //write a code where it counts all the even numbers in between 2  numbers those have been entered by user.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = scan.nextInt();
        int count = 0;
        int count1 = 0;

        for (int i = num1; i > num2; i--) {
            if (i%2!=0){
                System.out.println(i+ " is even number");
                count++;
            }else{
                count1++;
            }
        }
        System.out.println("the count of all the even numbers: "+ count);
        System.out.println("the count of all the odd numbers: "+ count1);
    }
}
