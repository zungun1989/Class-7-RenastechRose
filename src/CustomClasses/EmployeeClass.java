package CustomClasses;

public class EmployeeClass {

    //fields
    public String Name;
    public String Surname;
    public String Department;

    public AddressClass HomeAddress;

    private String SIN;

    // Constructor
    public EmployeeClass(){
        System.out.println("You created an employee");
    }
    ///this is a constructor
    ///@param1 is a string variable that we will use as a Name
    ///@param2 is a string variable that we will use as a Surname
    ///@param3 is a string variable that we will use as a Department
    public EmployeeClass(String Param1, String Param2, String Param3){
        HomeAddress = new AddressClass();
        System.out.println("You created an employee with 3 parameters");
        Name = Param1;
        Surname = Param2;
        Department =Param3;
    }

    //Methods
    ///SetEmployeeSIN : This method will set employee's SIN number
    ///@param1 : This is a string type parameter

    //public static  ReturnType MethodName(ParameterType ParameterName...)
     public void SetEmployeeSIN (String Param1){

        SIN = Param1;
    }

    ///GetEmployeeSIN: this method will return a String type and will return SIN value
    /// I don't have any parameters

    public String GetEmployeeSIN(){

        return SIN;
    }

}
