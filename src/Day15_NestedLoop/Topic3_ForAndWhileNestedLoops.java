package Day15_NestedLoop;

public class Topic3_ForAndWhileNestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is from outer loop : i : "+i);
            int j= 1;
            while (j<10){
                System.out.println("\t this is from the inner loop "+j);
                j++;
            }
            System.out.println("This is from outer loop: i :"+i);
            for (int k = 1; k <4 ; k++) {
                System.out.println("\t this is from inner FOR LOOP k value: "+k);
                System.out.println("\t this is the j value inside of FOR LOOP: "+j);
            }
        }
    }
}
