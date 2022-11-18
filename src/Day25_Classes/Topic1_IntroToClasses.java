package Day25_Classes;

public class Topic1_IntroToClasses {

    public static void main(String[] args) {
        String Car1Make = "Ford";
        String Car1Model = "Mustang";
        String Car1Color = "Red";

        PrintCar(Car1Make, Car1Model,Car1Color);

        System.out.println("----------------------------");

        String Car2Make = "BMW";
        String Car2Model = "M3";
        String Car2Color =  "Black";

        PrintCar(Car2Make, Car2Model, Car2Color);
        /*
        String MyString = new String( "Something");
        Car MyCar = new Car ();

        Integer MyInteger = new Integer(5);
        Double MyDouble = new Double(1.2);
        */
        System.out.println("--------------------------------");

        Car MySportsCar = new Car();
        MySportsCar.Make = "Subaru";
        MySportsCar.Model = "BRZ";
        MySportsCar.Color = "Blue";
        MySportsCar.ModelYear =2021;

        PrintCarClass(MySportsCar);


    }
    // this method will print Car specifications
    //@param1 is Car class that will we use as our parameter
    public static void PrintCarClass(Car param1){
        System.out.println("make: "+ param1.Make);
        System.out.println("model: "+ param1.Model);
        System.out.println("color: "+ param1.Color);
        System.out.println("model year: "+ param1.ModelYear);
    }

    //This method will print car specifications
    //@param1 is a string parameter that we will use as Make name
    //@param2 is a string parameter that we will use as Model name
    //@param2 is a string parameter that we will use as color name

    public static void PrintCar (String param1, String param2, String param3){
        System.out.println("Make: "+param1);
        System.out.println("Model: "+param2);
        System.out.println("Color: "+param3);
    }
}

class Car{
    String Make;
    String Model;
    String Color;

    int ModelYear;
}

