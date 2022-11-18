package Day15_NestedLoop;

public class Topic4_BreakAndContinueStatements {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==5){
                continue;
            }
            System.out.println("The i value is: "+i);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int j=0;
        while (j<10){
            if(j==7 || j==8){
                j++;
                continue;
            }
            System.out.println("The j value: "+j);
            j++;
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < 10; i++) {
            System.out.println("From outer loop the i value is: "+i );
            for (int k = 1; k < 10; k++) {
                if (i == 5 || i == 8) {
                    continue;
                }
                System.out.println("\t the outer loop k value: " + k);
            }
        }
    }
}
