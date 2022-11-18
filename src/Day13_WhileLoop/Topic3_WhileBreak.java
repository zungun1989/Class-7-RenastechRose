package Day13_WhileLoop;

public class Topic3_WhileBreak {
    public static void main(String[] args) {
        //print all the numbers between 1 and 10 but when the number is 5 break the loop.

        int start = 1;
        while (start<10){
            //start++;  // if I use like this then 1 will be gone, cuz it'll start with increasing
           System.out.println("the numbers are: "+start);  //print before if, will include 5

            if (start==5){
                break;
            }
            // System.out.println("the numbers are: "+start); //print after if, will exclude 5
            start++;
        }

        System.out.println("***************************************");

        // print all the characters in String value of "Nawras" but break it when there is a char 'a'.

        String name = "Nawras";
        int i  = 0;
        while (i<name.length()){
            System.out.println("The char at index "+i+ " is "+name.charAt(i));
            if (name.charAt(i)=='a'){
                break;
            }
            i++;
        }




    }
}
