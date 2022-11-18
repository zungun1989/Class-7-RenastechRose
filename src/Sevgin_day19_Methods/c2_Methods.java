package Sevgin_day19_Methods;

public class c2_Methods {

    public static void main(String[] args) {
        //we call printJava10 in order to print it
        //printJava10();
        evenNumbers100();

    }
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

    //create a method that will print java 10 times

    public static void printJava10(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Java");
        }
    }

    //create a method that will print even numbers between 1-100
    //name this method evenNumbers100

    public static void evenNumbers100(){
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


    public static void hello() {
        System.out.println("hello");
    }
}

//void method (without parameters
// void method (with parameters)
//return method (without parameters)
//return method (with parameters)

//you can use above methods with different access modifier and specifier

