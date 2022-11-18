package Day14_NestedLoops;

public class Topic5_NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("this is the first outer loop"); // this code will get executed 3 times
            for (int j = 0; j < 3; j++) {
                System.out.println("\t this is the second outer/ first inner loop"); // this code will get executed 9 times
                for (int k = 0; k < 3; k++) {
                    System.out.println("\t \t this is second inner loop"); // this code will get executed 27 times

                }
            }

        }
    }
}
