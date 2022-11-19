package Day26_ClassesAndConstructors;

import CustomClasses.CarClass;
import CustomClasses.EmployeeClass;

public class Topic1_PublicClasses {
    public static void main(String[] args) {
        //How to define an Object
        //DataType VariableName = New Constructor;
        CarClass MyElectricCar= new CarClass();
        MyElectricCar.Make = "Tesla";
        MyElectricCar.Model = "3";
        MyElectricCar.Color = "White";
        MyElectricCar.ModelYear = 2021;

        EmployeeClass MyEmployee = new EmployeeClass();
        MyEmployee.Name = "Hayri";
        MyEmployee.Surname = "Aslan";
        MyEmployee.Department = "R&D";

        MyEmployee.SetEmployeeSIN("123 456 789");

        System.out.println(MyEmployee.GetEmployeeSIN());





    }
}
