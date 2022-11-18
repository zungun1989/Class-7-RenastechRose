package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic4_BreakStatementExample {
    public static void main(String[] args) {
        //User is being asked to enter a name and restructure the name but as soon as it sees the "l" you should
        //stop restructure.
        // Kyle ==> Ky

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name= scan.next();

        String rename = "";
        for (int i = 0; i < name.length(); i++) {

            //rename=rename+name.charAt(i);// this will add l then break it

            if (name.charAt(i)=='l' || name.charAt(i)=='L'){
                break;
            }
            rename=rename+name.charAt(i); // this will not add l at all

        }
        System.out.println("The rename value is: "+rename);
    }
}
