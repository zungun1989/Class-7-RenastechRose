package Homeworks;

import java.util.Scanner;

public class Homework_37 {
   //write a method where it takes 2 double values and 1 integer value.
    // When the integer value is 1 it returns to sum of the 2 double numbers, when integer is 2 it returns
    // the subtraction of those 2 double number, when integer value is 3 it returns to the multiplication of those
    // 2 double numbers, and when the integer value is 4 it returns the division of those 2 double numbers

    public static void main(String[] args) {
        double num1 = 1.3;
        double num2 = 2.5;
        int num3 = 3;
        System.out.println(TwoDoubleOneInteger(num1, num2, num3));

    }


    public static double TwoDoubleOneInteger (double param1, double param2, int param3 ){
        if (param3 == 1){
            System.out.println("result is param1+param2");
           return param1+param2;
        } else if (param3==2) {
            System.out.println("result is param1-param2");
            return param1-param2;
        } else if (param3==3) {
            System.out.println("result is param1*param2");
            return param1*param2;
        } else if (param3==4) {
            System.out.println("result is param1/param2");
            return param1/param2;
        }else {
            System.out.println("wrong selection! " );
        }
        return param3;
    }
}
