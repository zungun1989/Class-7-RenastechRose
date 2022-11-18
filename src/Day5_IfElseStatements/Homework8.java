package Day5_IfElseStatements;

public class Homework8 {
    public static void main(String[] args) {
        String name = "Elton";
        String lastname = " John";
        int CreditScore = 678;

        if (CreditScore<500){
            System.out.println(name + lastname +" has Bad Credit Score");
        }
        if (CreditScore>=500 && CreditScore<700){
            System.out.println(name + lastname + " has Bad Credit Score");
        }
        if (CreditScore>=700 && CreditScore<750){
            System.out.println(name + lastname + " has Good Credit Score");
        }
        if (CreditScore>=750){
            System.out.println(name + lastname + " has Great Credit Score");
        }
    }
}
