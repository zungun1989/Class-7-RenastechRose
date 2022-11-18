package Day12_BreakandContSt;

public class Topic5_ContinueStatement {
    // we use continue keyword to disregard that iteration when certain conditions are met.

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

           // System.out.println("The i value for each iteration: "+i); // this will execute 5 and then continue
           if (i == 5){
               continue;

           }
            System.out.println("The i value for each iteration: "+i);// this will not execute 5 but continue
        }
    }
}
