package Homeworks;

import java.util.Scanner;

public class Homework_24 {
    //Write a code where user is being asked to enter a String and that checks if the String is Palindrome
    //PS. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
    // such as madam or racecar. (Java, or Ziya or Cat are not palindrome)
    //(This is a bit hard question, It is an Interview question. Work on it we can solve it later on together)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter whatever you want: ");
        String entry = scan.nextLine();

        String reverse="";

        for (int i = entry.length()-1; i >=0 ; i--) {
            reverse=reverse+entry.charAt(i);
        }
        System.out.println(reverse);

        String entry1=entry;
        String reverse1=reverse;

        if (entry1.equals(reverse1)){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("this is not a Palindrome");
        }
    }
}
