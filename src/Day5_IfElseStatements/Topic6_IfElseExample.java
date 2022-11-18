package Day5_IfElseStatements;

public class Topic6_IfElseExample {
    public static void main(String[] args) {
        //check if the student will be accepted to the school;
        //1)Sat score must be 90 or more
        //2)writing skill 5 or above
        double StScore = 89;
        int wrScore = 7;

        if(StScore>=90 && wrScore>=5){
            System.out.println("the student is accepted");
        } else{
            System.out.println("the student is not accepted");
        }
    }
}
