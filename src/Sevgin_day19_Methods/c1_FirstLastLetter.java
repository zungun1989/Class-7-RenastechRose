package Sevgin_day19_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class c1_FirstLastLetter {

    //crate a java program that will ask for 5 string name to store in the array
    // and print first and last letter from each string

    // example
    //input: berkan, firas, merve
    // output: bn, fs, me

    public static void main(String[] args) {
        //Scanner: to store numbers
        //Array string: to store 5 names
        //loop to store 5 names (for loop while loop)
        //charAt: to get each letter from each name
        //for each: to store initials from each name to new string

        Scanner input= new Scanner(System.in);

        String [] nameList = new String[5]; // to store 5 names

        for (int i=0; i< nameList.length; i++){
            System.out.println("Enter a name for index "+i+":");
            nameList[i]=input.next();
        }

        //to print all names
        System.out.println(Arrays.toString(nameList));

        String firstLastLatters = "";

        for (String eachName:nameList){

            firstLastLatters+= " " + eachName.charAt(0)+eachName.charAt(eachName.length()-1);

        }
        System.out.println(firstLastLatters);
    }

}
