package Day5_IfElseStatements;

public class Homework7 {
    public static void main(String[] args) {

        double Height = 5.8;
        double Weight = 260;

        if (Height>=5.5 && (Weight>=140 && Weight<=250)){
            System.out.println("Eric is eligible to join military");
        }else{
            System.out.println("Eric is NOT eligible to join military");
        }
    }
}
