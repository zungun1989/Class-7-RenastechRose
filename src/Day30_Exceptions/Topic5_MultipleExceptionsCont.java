package Day30_Exceptions;

import java.util.Scanner;

public class Topic5_MultipleExceptionsCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       try {

           System.out.println("please enter a number ");
           int ValueA = scan.nextInt();

           System.out.println("Please enter another number ");
           int ValueB = scan.nextInt();

           double ValueC = ValueA/ValueB;
       }catch (ArithmeticException e){
           System.out.println("You cannot divide by zero!");
       }
        int [] MyArray = {1,5,9,6};
        System.out.println("Please enter an index: ");
        int MyIndex = scan.nextInt();
       try{

           System.out.println(MyArray[MyIndex]);//this may throw an error
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("We don't have a value on index : "+ MyIndex);
       }



       System.out.println("Rest of the code");
    }
}
