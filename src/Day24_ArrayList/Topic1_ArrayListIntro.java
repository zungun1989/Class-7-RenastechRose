package Day24_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Topic1_ArrayListIntro {
    public static void main(String[] args) {
        int [] MyOldArray = new int[3];

        MyOldArray [0]=55;
        MyOldArray [1] = 47;
        MyOldArray [2] = 99;

        System.out.println(Arrays.toString(MyOldArray));

        String [] MyOldStringArray = {"food", "family", "expense"};

        /*
        In Java, we need to declare teh size of an array before we can use it.
        Once size is declared, it is hard to change

        To handle this issue we can use ArrayList class.
         */

        ArrayList<Integer> MyNewArray = new ArrayList<Integer>();

        /*
        Basic Operations on ArrayList

        Add elements
        Access (get) elements
        Change (set) elements
        Remove elements

         */

        MyNewArray.add(55);
        MyNewArray.add(47);
        MyNewArray.add(99);
        MyNewArray.add(108);
        System.out.println(MyNewArray);
        MyNewArray.add(2,77);

        System.out.println(MyNewArray);
        MyNewArray.add(0,11);
        System.out.println(MyNewArray);



    }
}
