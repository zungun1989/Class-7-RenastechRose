package Day6_IfElseStatements;

public class Topic4_MultipleTernary {
    public static void main(String[] args) {
        /*
        (condition)?first:(condition)?second:third; //it is like (if-elseif-else) or you can continue.
         */
        //write a code where it checks if the number is even or odd or zero
        //(a%2==0)?"the number is even":(a%2!=0)?"the number is odd":"the number is 0";

        int num1 = 0;
        String result = (num1==0)?"the num1 is zero":(num1%2!=0)?"the number is odd":"the number is even";
        System.out.println(result);

    }
}
