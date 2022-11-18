package Day20_Methods;

public class Topic2_ForEachLoopCont {
    public static void main(String[] args) {
        // write a code where you are given an array of string as shown below to check how many char 'c'
        // or 'C' is in each value.

        String [] animals = {"Cow","Fish","Horse","Lion","Crocodile","Eagle"};

        for (String var: animals){
            System.out.println("The value of var variable: "+var);
            int count = 0;
            char [] letters = var.toCharArray();

            for (char letter: letters){
                if (letter=='c' || letter== 'C'){
                    count++;
                }
            }
            System.out.println("the animal "+var+" has "+count+ " char c or C in the name");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

    }
}
