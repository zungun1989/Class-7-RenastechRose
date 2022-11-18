package Day5_IfElseStatements;

public class Topic4_IfStatementCont {
    public static void main(String[] args) {

        int num1 = 9;
        int num2 = 9;

        int ans = num1 - num2;

        if (ans>0){
            System.out.println("the result is positive: "+ans);
        }

        if (ans<0){
            System.out.println("the answer is negative:"+ans);
        }

        if(ans==0){
            System.out.println("the answer is 0");
        }

    }
}
