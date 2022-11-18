package Day19_MultiDimensionArrays;

import java.util.Scanner;

public class Topic8_ForeachLoopEx {
    public static void main(String[] args) {
        //Write a code where a user check every string values in array and see if that string has a in it



        String [] str = {"Alibaba", "Omur", "Gorkem", "Nasrettin", "Hoca"};

        for(String var:str){
            if(var.contains("a") || var.contains("A")){
                System.out.println("the word: "+var+ ", contains a or A");
            }else {
                System.out.println("the word: "+var+ ", doesn't contains a or A");
            }
        }
    }
}
