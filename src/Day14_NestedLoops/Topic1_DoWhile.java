package Day14_NestedLoops;

import java.util.Scanner;

public class Topic1_DoWhile {
    public static void main(String[] args) {
        //do{
        //CodeBlock
        //}while (condition)

        //print all the numbers 1 to 10

        int i=1;
        do{
            System.out.println("The number is : "+i); // this code block will get executed even if the condition
                                                        //in the while condition is false.
            i++;
        }while(i<10);

        //write a code where user is being asked to enter a one letter string but
        //even if the string has more than char print only the first char

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1 char string: ");
        String st = scan.next();

        int j = 0;
        do{
            System.out.println("The first char of the string is : "+st.charAt(j));
            j++;
        }while (j<0);
    }
}
