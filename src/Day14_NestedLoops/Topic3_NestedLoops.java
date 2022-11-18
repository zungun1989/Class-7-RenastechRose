package Day14_NestedLoops;

public class Topic3_NestedLoops {
    public static void main(String[] args) {
        //Nested Loops

        // Assume you have 3 different fruit each have 10. you want to give 10 people equally each one of the fruit

        for (int i = 0; i < 3; i++) { //outer loop
            System.out.println("The distribution: "+i);
            for (int j = 1; j <= 10; j++) { //inner loop
                System.out.println("Fruit: "+i+" for the kid: "+j);
            }
        }
        System.out.println("All the fruits are distributed");
    }
}
