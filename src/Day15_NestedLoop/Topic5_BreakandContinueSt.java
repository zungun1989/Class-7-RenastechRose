package Day15_NestedLoop;

public class Topic5_BreakandContinueSt {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("From outer loop the i value: "+i);
            for (int j = 1; j <10 ; j++) {
                if (i==5){
                    break;
                }
                System.out.println("\t from inner loop the i value is: "+i+ " and the j value: "+j);
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < 10; i++) {
            System.out.println("From outer loop the i value: "+i);
            for (int j = 1; j <10 ; j++) {
                if (j==5){
                    break;
                }
                System.out.println("\t from inner loop the i value is: "+i+ " and the j value: "+j);
            }
        }
    }
}
