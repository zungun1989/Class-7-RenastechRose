package CustomClasses;

public class RectangleClass {
    //Encapsulation
    //public, private, protected and default
    public int Length;
    public int Breadth;

    ///create a constructor
    ///will take 2 parameters
    //public ClassName(Parametertype parametername..)

    public RectangleClass(int param1, int param2){
        Length = param1;
        Breadth = param2;
    }

    ///PrintArea : This method will print the area of rectangle
    ///Return type = void
    ///No parameter

    // Public or Private Static or Not ReturnType MethodName (Parametertype parametername...)

    public void PrintArea(){
        System.out.println(Length*Breadth);
    }

    ///PrintPerimeter : this method will print perimeter of Rectangle
    ///return type = void
    ///no parameter

    public void PrintPerimeter(){
        System.out.println((2*Length)+(2*Breadth));
    }
}
