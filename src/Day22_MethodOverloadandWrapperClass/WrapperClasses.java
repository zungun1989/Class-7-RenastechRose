package Day22_MethodOverloadandWrapperClass;

import java.util.ArrayList;

import static Day22_MethodOverloadandWrapperClass.RecapMethodOverload.line;

public class WrapperClasses {
    public static void main(String[] args) {
        //primitive data tyoes
        // int
        //short
        //long
        //float
        //byte
        //double
        //boolean
        //char


        // Non-Primitive object and object are getting created by classes

        int number = 5;

        Integer numbers = 5;

        System.out.println(numbers.toString());


        //Example

        //ArrayList <int> myNumber = new ArrayList<int>();   //invalid
        //ArrayList<Integer> myNumber = new ArrayList<Integer>();
        //[1,2,3,4]

        String name  = ""; //non primitive

        Character myChar = 'A'; //wrapper

        Byte b1 = 11;//wrapper
        byte b2 = 12;//primitive
        Byte b3 = b2; //wrapper

        line();


        //toString

        Integer myInt = 5;
        System.out.println(myInt);
        String myString = myInt.toString();
        System.out.println(myString.length());

        line();

        //Data Structure and Algorithm




    }
}
