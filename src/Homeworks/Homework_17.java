package Homeworks;

import java.util.regex.Pattern;

public class Homework_17 {
    //First create one string and copy paste below paragraf.
    //And make modifications on the given paragraph listed below.
    //Make sure to create multiple string with each sentence from given paragraph
    //Make sure each sentence start with upper case letter.
    //Make sure city name start with the capital letter.
    //Make sure the rest of the letters are lower case.
    //Make sure to change the name, age and city information based on your information
    //make sure to get rid of the empty spaces in front and end of the sentences.
    //after you make the modification check each sentence’s length
    //Print each sentence and make sure they are correctly modified.
    //Print 1st, 4th and 5th indexed characters for each sentence
    //At the end combine all the sentence to get proper paragraph with modified sentences

    public static void main(String[] args) {
        String paragraph = "hello my name is <yourname>.       i am <yourage> years old.  i live in <yourcity>.   I have been in IT industry for about 6 years. I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. I have experience in EducatION, energy,finance and some manY Other AREAs. i HAve scrum master and Oracle java Programmer certificates.   i love JaVA.   I designed and DEVELoped many automation test cases using BDD FRamework.";

        String myname = "Zeliha";
        String myage = "34";
        String mycity = "Calgary";

        Pattern p = Pattern.compile("([\\.\\?\\!]\\s)");
        String[] result =p.split(paragraph);

        for (int i=0; i<result.length; i++){
            result[i] = result[i].trim();
            result[i] = result[i].substring(0,1).toUpperCase() + result[i].substring(1).toLowerCase();
            result [i] = result[i].replace("<yourname>", myname);
            result [i] = result[i].replace("<yourage>", myage);
            result [i] = result[i].replace("<yourcity>", mycity);
            System.out.println(result[i]);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("Sentence "+ (i+1)+": length is; "+ result[i].length()+ " and 1st, 4th and 5th indexed characters are :" + result[i].charAt(0)+ "," + result[i].charAt(3) + ","+ result[i].charAt(4));
        }
        String newparagraph= "";
        for (String s : result) {
            newparagraph = newparagraph.concat(s.concat(". "));
        }
        System.out.println(newparagraph);

    }
}
