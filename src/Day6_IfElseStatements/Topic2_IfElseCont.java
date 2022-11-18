package Day6_IfElseStatements;

public class Topic2_IfElseCont {
    public static void main(String[] args) {
        //write a code where it checks if a number is negative, positive or zero
        int a = 0;
        if(a>0){
            System.out.println(a+" is positive");
        } else if (a<0) {
            System.out.println(a+" is negative");
        }else {
            System.out.println("The number is 0"); //we cannot use else if anymore, the code should be ended with else
        }
    }
}
