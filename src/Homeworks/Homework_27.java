package Homeworks;

import java.util.Scanner;

public class Homework_27 {
    //Write a code which asks user to enter a String and removes all the duplicate
    // characters from the String and prints the result
    //ex. "AAAAAVVVCCDDAA" ==> "AVCD"


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a string: ");
            String entry= scan.next();

            String reentry = "";
            String retype = "";

            for(int i = 0; i < entry.length() - 1; i++) {

                if(entry.charAt(i) != entry.charAt(i + 1)) {

                    reentry = reentry + entry.charAt(i);
                }
                retype = reentry + entry.charAt(i);
            }
            System.out.println("The string removed duplicated characters is: "+retype);

        }
}
