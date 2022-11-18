package Homeworks;


import java.util.Scanner;

public class Homework_16 {
    public static void main(String[] args) {
        //Write a code where it meets the below requirements
        //- a couple just got married and goes to city hall to get their last name changed
        //- the officer who works there asks the couple about their first name and last name for each
        //- also asks if they want to use the same last name or keep their original last names ( for the same last name you can use either one of them)
        //- based on the answer print the couples first names and last names

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String WomanFirstName = scan.nextLine();
        System.out.println("Please enter your last name: ");
        String WomanLastName = scan.nextLine();
        System.out.println("Do you want to keep your lastname, please say Yes or No: ");
        String answerW = scan.nextLine();
        String Yes ="Yes";
        String No = "No";

        System.out.println("Please enter your first name: ");
        String ManFirstName = scan.nextLine();
        System.out.println("Please enter your last name: ");
        String ManLastName = scan.nextLine();
        System.out.println("Do you wan to keep your last name, please say Yes or No: ");
        String answerM = scan.nextLine();

        if (answerW.equals(Yes) && answerM.equals(Yes)){
            System.out.println("Woman's first name and last name is: "+ WomanFirstName+" "+ WomanLastName);
            System.out.println("Man's first name and last name is: "+ManFirstName+ " "+ ManLastName);
        } else if(answerW.equals(No) && answerM.equals(Yes) ) {
            System.out.println("Woman's first name and last name is: "+ WomanFirstName.concat("  "+ ManLastName));
            System.out.println("Man's first name and last name is: "+ManFirstName+ " "+ ManLastName);
        } else if (answerW.equals(Yes) && answerM.equals(No) ) {
            System.out.println("Woman's first name and last name is: "+ WomanFirstName+" "+ WomanLastName);
            System.out.println("Man's first name and last name is: " + ManFirstName.concat("  "+ WomanLastName));
        } else if ( answerW.equals(No) && answerM.equals(No)) {
            System.out.println("Woman's first name and last name is: "+ WomanFirstName.concat("  "+ ManLastName));
            System.out.println("Man's first name and last name is: " + ManFirstName.concat("  "+ WomanLastName));
        } else {
            System.out.println("Please enter valid answer!");
        }

    }
}
