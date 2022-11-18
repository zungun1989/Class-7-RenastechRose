package Day6_IfElseStatements;

public class Topic5_NestedIfElseStatements {
    public static void main(String[] args) {
        //write a code when the number is even and between 10 - 40 double the number and print it if not
        //just print the number
        // if it is odd and between 33-99 triple the number if not double the number and print the results.

        int num1=101;
        if (num1%2==0){
            if(num1>=10 && num1<40){
                num1=num1 * 2;
                System.out.println("the result is:" + num1);
            }else {
                System.out.println("the result is:" + num1);
            }
        }else{
            if(num1>=33 && num1<99) {
                num1 = num1 * 3;
                System.out.println("the result is :" + num1);
            }else{
                num1=num1*2;
                System.out.println("the result is :"+num1);
            }
        }
    }
}
