package Day23_MethodsOverloadWrapperRecap;

import java.awt.*;
import java.util.ArrayList;

public class Topic5_FerreroRocher {
    public static void main(String[] args) {

        double d1 = 85.66;
        Double wrapped_d1 = d1;
        //Double wrapped_d1 = new Double(d1);
        PrintParameters(wrapped_d1.toString()); //we are using wrapper to get more functions





        int chocolate  = 5;
        Integer WrappedChocolate = new Integer(chocolate);
        ArrayList<Integer> MyBox = new ArrayList<Integer>();
        MyBox.add(WrappedChocolate);


        String s = WrappedChocolate.toString(); // lots of methods to convert

        int UnwrappedChocolate = WrappedChocolate.intValue();




       // MyBox.add(chocolate); // it will work in version 5
    }

    public static void PrintParameters (String param1){
        System.out.println(param1);
    }

    public static int ReturnIntValue(double param1){
        Double wrapped_param1 = param1;
        int a = wrapped_param1.intValue();
        return a;
    }

}
