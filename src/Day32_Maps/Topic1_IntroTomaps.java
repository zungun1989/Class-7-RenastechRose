package Day32_Maps;

import java.util.ArrayList;

public class Topic1_IntroTomaps {
    public static void main(String[] args) {
        ArrayList<String> MyEmployeeInformation = new ArrayList<>();
        MyEmployeeInformation.add("Hayri");
        MyEmployeeInformation.add("Aslan");
        MyEmployeeInformation.add("34");
        MyEmployeeInformation.add("120459863");

        System.out.println(MyEmployeeInformation.get(0));
        PrintEmployee(MyEmployeeInformation);
    }

    /// please create a method that takes an ArrayList of String as a parameter
    ///No return
    ///Method Name= PrintEmployee

    public static void PrintEmployee(ArrayList<String> param1){
        System.out.println(param1.get(0));
        System.out.println(param1.get(2));
    }


}
