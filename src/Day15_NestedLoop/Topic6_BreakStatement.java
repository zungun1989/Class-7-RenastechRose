package Day15_NestedLoop;

public class Topic6_BreakStatement {
    public static void main(String[] args) {
        lbl: //label
        for (int i = 0; i < 10; i++) {
            System.out.println("From outer loop i value: "+i);
            for (int j = 0; j < 10; j++) {
                if (i==5){
                   // break lbl; //it breaks where the label level is, in this case outer loop.lbl is just name, can be anything.
                    continue lbl; // same as just break in inner loop
                }
                System.out.println("\t from the inner loop i: "+i+" j value: "+j);
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++");

        CON:
        for (int i = 0; i < 10; i++) {
            System.out.println("From outer loop the i value: "+i);
            for (int j = 1; j <10 ; j++) {
                if (i==5){
                    continue CON;
                }
                System.out.println("\t from inner loop the i value: "+i+" the j value: "+j);
            }
        }
    }
}
