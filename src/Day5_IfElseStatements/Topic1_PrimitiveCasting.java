package Day5_IfElseStatements;

public class Topic1_PrimitiveCasting {
    public static void main(String[] args) {
        //primitive casting is to change the primitive data type but when we do the casting from
        //lower level to upper level we will have issues.
        //we put the type of data in front of it

        byte by = 40;
        System.out.println("the byte value is: "+by);

        int inNum = by;
        System.out.println("the value of int: "+inNum);

        int a = 89009798; // (a binary 1011001010101) it is cutting of on the binary rep number.

        short b = (short) a;
        System.out.println("the b value is: "+b);

        int num1 = 90;
        System.out.println("the num1 value in int is : "+num1);

        float num2 = num1;
        System.out.println("the value is in float: "+num2);

        int num3 = 89;
        int num4 = 23;
        float num5 = (float) num3/num4; // if we didn't put float in front of it the result was to be 3.0 bcz (int/int)
        System.out.println("the operation result is : "+num5);




    }

}
