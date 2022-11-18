package MyUtils;

public class GenericUtils {
    public static void evenNumbers( int StartingPoint, int EndingPoint){
        for (int i = StartingPoint; i <=EndingPoint ; i++) {
            if(i%2==0){
                System.out.println(i+" is even number");
            }
        }
    }

    public static void reverseString(String name){
        String reversedResult= "";

        for (int i = name.length()-1; i >=0; i--) {
            reversedResult += name.charAt(i);
        }
        System.out.println(reversedResult);
    }
}
