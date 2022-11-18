package Day18_ArraysUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Topic2_ToCharArray {
    public static void main(String[] args) {
        String name= "This is + * ? Ziya Yilmaz";
        char [] ch = name.toCharArray(); // it returns to a char array with every single char in the String
        System.out.println("This is char Arrays: "+ Arrays.toString(ch));


    }
}
