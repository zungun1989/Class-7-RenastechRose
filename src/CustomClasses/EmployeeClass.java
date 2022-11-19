package CustomClasses;

public class EmployeeClass {

    //fields
    public String Name;
    public String Surname;
    public String Department;

    private String SIN;

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
