package Day15_NestedLoop;

public class Topic1_WhileNestedLoops {
    public static void main(String[] args) {
       /*
        while(condition){
            //code block
            while (condition2){
                //second code block
            }
        }

        */

        int i = 0;
        //int j = 1;
        while (i<10){
            System.out.println("The Value of i: "+i);
            int j = 1;
            while (j<10){
                System.out.println("For each i: "+i+" value "+" the value: "+j);
                j++;

            }
            //System.out.println("This ");
            i++;
        }
    }
}
