package CustomClasses;

public class AnimalClass {
    public String AnimalName;
    public String AnimalType;

    public String AnimalColor;

    ///This is a constructor. This will be called when you create Class
    ///@param1 is a String variable and we will use it as AnimalName
    ///@param2 is a String variable and we will use it as AnimalType

    public AnimalClass(String param1, String param2){
        AnimalName = param1;
        AnimalType = param2;
    }

    //How to define a Constructor
    //public ClassName(ParameterType ParameterName, ....)

    ///This is a constructor. This will be called when you create Class
    ///@param1 is a String variable and we will use it as AnimalName
    ///@param2 is a String variable and we will use it as AnimalType
    ///@param3 is a String variable and we will use it as AnimalColor

    public AnimalClass(String param1, String param2,String param3){
        AnimalName = param1;
        AnimalType = param2;
        AnimalColor = param3;
    }



    public void AMethod (String param3){

        System.out.println(param3);
    }
}
