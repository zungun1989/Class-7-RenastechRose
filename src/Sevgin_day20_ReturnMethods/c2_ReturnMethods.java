package Sevgin_day20_ReturnMethods;

public class c2_ReturnMethods {
    /*
    decleration of the method
    public                  static          void                    main            (String [] args){
    Access Modifier         specifier       returntype              methodName      (parameter)
    Statements, code
    }
     */

    //Access-Modifier=public, protected, defult, private
    // specifier= static, final, abstract, synchronized
    //return type= void, any datatype (int, string, char, int [].....)
    //some method has parameters some don't have parameter

    //create a method that will print minimum number from 2 number

    public static void minNumber (int i1, int i2){
        String result="";
        if(i1<i2){
            result = i1+" is min";
        } else if (i2<i1) {
            result = i2 + " is min";
        }else {
            result = "equal";
        }
        System.out.println(result);
    }

    public static String minNumber2 (int i1, int i2){
        String result="";
        if(i1<i2){
            result = i1+" is min";
        } else if (i2<i1) {
            result = i2 + " is min";
        }else {
            result = "equal";
        }
        System.out.println(result);
        // you a=have to return a string
        return result;
    }



    public static void main(String[] args) {
        minNumber(4,5);

        /*
        Group 1; 63, 44
        Group 2; 23,35
        Group 3; 13,115
        Group 4; 0, 35
        Group 5; 23,0
        Group 6; 2, 35

         */

    }
}
