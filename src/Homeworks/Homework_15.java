package Homeworks;


import java.util.Scanner;

public class Homework_15 {
    public static void main(String[] args) {
        //Write a Code where user is being asked to enter a sentence
        //if Sentence starts with "B" or "b" and ends with "E" or "e" also contains "A" or "a" replace second and fourth characters with "G"

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = scan.nextLine();

        if ((sentence.startsWith("B")||sentence.startsWith("b")) && (sentence.endsWith("E") || sentence.endsWith("e")) && (sentence.contains("A") || sentence.contains("a"))){
            String newsentence = sentence.substring(0,1)+'G'+sentence.substring(2,3)+'G'+sentence.substring(4);
            System.out.println("New Sentence: " +newsentence);
        } else {
            System.out.println("Your sentence: " +sentence);
        }
    }
}
