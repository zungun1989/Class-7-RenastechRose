package Sevgin_day20_ReturnMethods;

public class c1_UniqueLetterFromArray {
    //write a program that can print out the unique values from String Array
    //          Ex:
    //          if arr->{"A", "A", "B", "C", "C"}
    //             output: B
    //
    //          if arr-> {"A", "B", "B", "C"}
    //          output: A
    //                  C


    public static void main(String[] args) {

        // if the variable is in the list for only one time that means this is a unique value
        // I should only print strings that has count==1
        //to check letter count yo uwill need to compare with all letters and when it equals you increase the count
        //the ones that has count==1 are unique
        //count 0,2 3 4 5 6 ... wont be unique

        String[] letters = {"A", "A", "B", "C", "C", "C", "D", "D", "E"};

        for (String eachLetter : letters) { //A
            int count = 0;
            for (String eachLetter2 : letters) {
                if (eachLetter2.equals(eachLetter)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(eachLetter + " is unique");
            }
        }

        System.out.println("****************************************");

        String [] arr = {"A", "C", "B", "C"};
        uniquesFromArray(arr);
    }

    public static void uniquesFromArray(String[] exampleLetters) {
        //String [] letters = {"A", "A", "B", "C", "C","C","D", "D", "E"};
        // no need for this line. Because we are getting our arrays from method parameters

        for (String eachLetter : exampleLetters) { //A
            int count = 0;
            for (String eachLetter2 : exampleLetters) {
                if (eachLetter2.equals(eachLetter)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(eachLetter + " is unique");
            }
        }
    }
}