package Day17_ArraysCont;

import java.util.Scanner;

public class Topic1_ArraySumElements {
    //write a code with following requirements
    //user should be asked about how many numbers that us going add to array
    //user should be asked for each element for the array
    //find the sum of all the elements in array

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of elements would you like to add to Array: ");
        int size = sc.nextInt();

        double [] numbers = new double[size];

        for (int i = 0; i <size ; i++) {

            System.out.println("Please enter the " + (i + 1)+". number: ");
            double num = sc.nextDouble();
            numbers[i] = num;
        }

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum= sum+numbers[i];

        }
        System.out.println("The sum of all the numbers in the array is: "+sum);
    }
}
