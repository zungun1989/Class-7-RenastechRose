package Day6_IfElseStatements;

public class Topic1_IfElseCont {
    public static void main(String[] args) {
        /// write a code where determines students grade based on the points they received
        // 90--100 is A
        // 80-90 is B
        // 70 -80 is C
        // 60-70 is D
        // rest is F
        // also if the given point is greater than 100 or less then 0 print "not valid point"

        double points=120;
        if(points<0 || points>100){
            System.out.println("Not Valid Point");
        } else if (points>=90) {
            System.out.println("The Grade is A");
        } else if (points>=80) {
            System.out.println("The Grade is B");
        } else if (points>=70) {
            System.out.println("The Grade is C");
        } else if (points>=60) {
            System.out.println("The Grade is D");
        } else {
            System.out.println("The Grade is F");
        }
    }
}
