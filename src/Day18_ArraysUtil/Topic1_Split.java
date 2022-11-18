package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic1_Split {
    // Split() method in Arrays Util, it creates a string Array based on the given String expression.

    public static void main(String[] args) {
        String names = "Ziya Hrakar Nilufer Sena";
        System.out.println("The string name is : "+names);
        String [] nm = names.split(" ");
        String [] nm1 = names.split("", 3);
        System.out.println("nm contains: "+ Arrays.toString(nm));
        System.out.println("the length of nm is: "+nm.length);
        System.out.println(Arrays.toString(nm1));

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        String nums = "1234517619871";
        String [] numbers = nums.split("1");
        System.out.println("the numbers array is: "+Arrays.toString(numbers));

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        String var = "thisisjustaString";
        String [] var1 = var.split("");
        System.out.println("The var1 values: "+Arrays.toString(var1));

        String forbid = "Thisisjust a TEST";
        String [] tst = forbid.split(""); //you can NOT use (*, ?, +) on the split.

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        String var2 = "THISISATESTFORALI";
        String [] test = var2.split("",5);
        System.out.println("The test array is : "+Arrays.toString(test));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        String var3= "This is just a test but I want to try again";
        String [] test1 = var3.split(" ", 20);
        System.out.println("The test1 values: "+Arrays.toString(test1));



    }
}
