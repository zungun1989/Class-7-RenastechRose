package Day16_Arrays;

public class Topic5_AssigningValueswithForLoop {
    public static void main(String[] args) {

        //write a code where you define an integer array with size/length of 10
        // and assign each index with even numbers starting from 90

        //90,92,94,96,98,100,102,104,106,108

        // array = {90,92,94,96,98,100,102,104,106,108};

         int [] arr1 = new int[10]; // right now they are default values

         int start = 90;
        for (int i = 0; i < arr1.length; i++) {

            arr1[i] =start; // all would be print as 90
            start+=2; // start = start +2;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("The value in index: "+i+ " is: "+arr1[i]);
        }


    }
}
