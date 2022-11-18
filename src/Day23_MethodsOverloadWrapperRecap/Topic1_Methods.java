package Day23_MethodsOverloadWrapperRecap;

public class Topic1_Methods {
    /*
    Define 2 numbers and print sum of them

    define a string variable and print lowercase of it.

    define 2 numbers and print numbers from 1 to sum of them.

    define another string and print lowercase of it
 */

    public static void main(String[] args) {
        int a = 5;
        int b = 6;

       // int sum = a * b;
        int sum = Add(a,b);
        System.out.println(sum);
        //String s1 = "Renastech";
        //System.out.println(s1.toUpperCase());

        PrintLowerCase("RenastEch");

        int c = 7;
        int d = 3;

      //  int sum2 = c + d;
        int sum2 = Add(c,d);
        for (int i = 1; i <= sum2; i++) {
            System.out.println(i);
        }

        //String s2="WhatEVer";
       // System.out.println(s2.toLowerCase());

        PrintLowerCase("WhatEVer");
    }

    public static int Add (int param1, int param2){
        return param1+param2;
    }

    public static void PrintLowerCase (String param1){
        System.out.println(param1.toUpperCase());
    }


}
