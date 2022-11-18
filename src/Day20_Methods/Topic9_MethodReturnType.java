package Day20_Methods;

public class Topic9_MethodReturnType {
    public static void main(String[] args) {

        System.out.println("The Food is: "+ Kitchen("Tomato", "SeaSalt", "OliveOil"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        int result = Sum2nums(45,23);
        System.out.println("The result is: "+result);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("the result also: "+ Sum2nums(34,67));

        System.out.println(function(67));
    }

    public static String Kitchen (String Veggies, String Salt, String Oil){

        String food = Veggies+Salt+Oil;
        return "Menemen";
        /*
        Access Modifiers Specifiers Return Type (String, Int, Object, Array, List) MethodName(Params){
        code block
        }
         */
    }
    public static int Sum2nums (int a, int b){
        return a+b;
        //or int sum = a+b;
        //   return sum;
    }

    public static  String function(int a) {
        if (a<10)
            return "Number less than 10.";
        if (a<100)
            return "Number greater than 10 but less than 100.";
        a = a * 10;
        return "Number greater than or equal to 100.";
    }
}
