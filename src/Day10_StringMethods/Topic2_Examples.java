package Day10_StringMethods;

import java.util.Scanner;

public class Topic2_Examples {
    public static void main(String[] args) {
        String name = "Baran Cevrim"; // BarCev
        String newName= name.substring(0,3) + name.substring(6,9);
        System.out.println("The value of NewName: "+newName);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the firstname");
        String Firstname = scan.next();
        System.out.println("Please enter the lastname");
        String Lastname = scan.next();
        String Changed = (Firstname.replace('a', 'b')+Lastname.replace('a','c')).toUpperCase();
        System.out.println("The value of changed now is : "+Changed);

        String name2 = "Andrew";
        System.out.println(name2.replace('z', 'a'));
    }
}
