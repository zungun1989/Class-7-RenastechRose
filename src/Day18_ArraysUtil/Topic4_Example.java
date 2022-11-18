package Day18_ArraysUtil;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Topic4_Example {
    public static void main(String[] args) {
        /*
        Write a code with following instructions:
        1) Ask user to enter a sentence
        2) Check each word in the sentence to see how many 'l', 'a' and 'b' characters in the each word

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence: " );
        String str = scan.nextLine();
        String [] words = str.split(" "); // {"Apples", "are", "amazing"}
        System.out.println("All the words in the Sentence: "+ Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            String word = words[i]; // word [0] ="Apple"
            int countA = 0;// to reset the code we have to put counts in outer loop,
            int countB = 0;//  if we put out of for loops it doesn't reset to accumulate for each word.
            int countl = 0; // if we want to check how many a in the sentence then we have put counts out of for loops
            char [] chars = word.toCharArray(); // {'A','p','p','l','e'}

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == 'a' || chars[j] == 'A') {
                    countA++;
                } else if (chars[j] == 'l' || chars[j] == 'L'){
                    countl++;
                } else if (chars[j]=='b' || chars[j]=='B') {
                    countB++;
                }
            }
            System.out.println("The word: "+words[i]+" has "+countA+ " A in it");
            System.out.println("The word: "+words[i]+" has "+countB+ " B in it");
            System.out.println("The word: "+words[i]+" has "+countl+ " L in it");
        }
    }
}
