package Sevgin_day19_Methods;

import MyUtils.GenericUtils;

public class c4_reverseString {
    public static void main(String[] args) {

        c2_Methods.hello();
        GenericUtils.evenNumbers(40,48);
        reverseString("Zeliha");
        reverseString("Renastech");
    }

    //we will create our own library that will reverse any string
    //this method will accept string so we can reverse string
    // as a result i should see reversed string

    public static void reverseString(String name){
        String reversedResult= "";

        for (int i = name.length()-1; i >=0; i--) {
         reversedResult += name.charAt(i);
        }
        System.out.println(reversedResult);
    }
}
