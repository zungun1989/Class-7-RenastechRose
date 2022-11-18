package Sevgin_day19_Methods;

public class c6_maxNumber {
    //create a method that will accept 2 different number
    // and it will print me the maximum one

    public static void maxNumber(int num1, int num2) {
        if (num1 > num2) { // first num1 max
            System.out.println(num1 + " is bigger than " + num2);
        } else if (num1<num2) { //num2 is max
            System.out.println(num2 +" is bigger than "+num1);
        }else {
            System.out.println(num1 + " is equal to "+num2);
        }
    }

    public static void main(String[] args) {
        maxNumber(5,10);
        maxNumber(100,20);
        maxNumber(30,30);
        //2 number compare
        int number1 = 150;
        int number2 = 250;
        maxNumber(number1,number2);
    }

}
