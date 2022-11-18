package Homeworks;

import java.util.Scanner;

public class Homework_11 {
    public static void main(String[] args) {
        //Write a Revenue program, Where user enters the quantity of the products sold and  the price for each product.
        // Then Calculate the revenue based on giving information (hint: Revenue = quantity x price)

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the quantity sold: ");
        double quantity = scan.nextDouble();scan.nextLine();
        System.out.println("Please enter the price: $");
        double price = scan.nextDouble();scan.nextLine();


        Double Revenue = quantity * price;
        System.out.println("The revenue earned from this transaction is: $"+Revenue);
    }
}
