package Day5_IfElseStatements;

public class Homework5 {
    public static void main(String[] args) {
        double Temp = 65;
        if (Temp<10){
            System.out.println("The Weather is So Cold");
        }
        if (Temp>=10 && Temp<40){
            System.out.println("The Weather is Cold");
        }
        if (Temp>=40 && Temp<70){
            System.out.println("The Weather is Good");
        }
        if (Temp>=70 && Temp<90){
            System.out.println("The Weather is Hot");
        }
        if (Temp>=90){
            System.out.println("The Weather is So Hot");
        }
    }
}
