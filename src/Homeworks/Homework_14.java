package Homeworks;

import java.util.Scanner;

public class Homework_14 {

    //Write a code where user is being asked to enter a name:
    //if Name Starts with "A" and ends with "L" replace "A" with "B" and print the result

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scan.next();

        if (name.startsWith("A") && name.endsWith("L")){
            System.out.println("rename: "+ name.replace('A','B'));
        } else {
            System.out.println(name);
        }
    }
}
