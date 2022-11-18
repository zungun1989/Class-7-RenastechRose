package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic4_ReverseString {
    public static void main(String[] args) {
        //write a code where user is being asked to enter string, reverse that string and print it
        // Ugur ==> rugU // Sena ==>aneS//

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a Something tht you want to reverse: ");
        String input = sc.nextLine();
        //ziya ==> ayiz
        //String name = "Ziya";
        char ch = input.charAt(0);
        System.out.println("The first character: "+ch);

        char ch1 = input.charAt(1);
        System.out.println("The second character: "+ch1);

        System.out.println("The length of the string is : "+input.length());
        System.out.println("The last character: "+input.charAt(input.length()-1));

        String reverse = "";
        for (int i = input.length()-1; i >=0 ; i--) {
            reverse = reverse+input.charAt(i); // reverse = ""+l ==> l
                                                // reverse = l+e = le
                                                // reverse = le+y = ley
        }
        System.out.println("The reverse of the input is: "+reverse);
    }

}
