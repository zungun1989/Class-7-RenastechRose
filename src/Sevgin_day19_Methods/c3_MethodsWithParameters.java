package Sevgin_day19_Methods;

public class c3_MethodsWithParameters {

    /*
    declaration of the method
    public                  static          void                    main            (String [] args){
    Access Modifier         specifier       return-type              methodName      (parameter)
    Statements, code
    }
     */

    public static void main(String[] args) {
        hello();
        hello();
        System.out.println("**********************************");
        evenNumbers(0,10);
        System.out.println("**********************************");
        ageCategory(74);
        ageCategory(4);
        ageCategory(17);
        ageCategory(83);
        ageCategory(-5);
    }

    //to print hello
    public static void hello(){
        System.out.println("Hello");
    }

    // even numbers for any range
    public static void evenNumbers( int StartingPoint, int EndingPoint){
        for (int i = StartingPoint; i <=EndingPoint ; i++) {
            if(i%2==0){
                System.out.println(i+" is even number");
            }
        }
    }

    //create a method that will check given age and print the category of each age
    // if age is 0-5 baby
    // if age is 5-18 young
    // if age is 18-80 mature
    // if age is bigger than 80 print old

    public static void ageCategory(int age){
        String result = "";
        if (age>=0 && age<5){
            result= age +" is a baby";
        } else if (age>=5 && age<18) {
            result=age + " is a young";
        } else if (age>=18 && age<80) {
            result=age +" is a mature";
        } else if (age>80) {
            result=age+" is old";
        }else {
            result = age +" is not exist!!!";
        }
        System.out.println(result);
    }






}
