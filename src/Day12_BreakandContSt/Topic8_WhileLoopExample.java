package Day12_BreakandContSt;

public class Topic8_WhileLoopExample {
    public static void main(String[] args) {
        int start = 0;
        while (start<10){ //same as for loop kind of// condition (or end point)
            //start ++; // increase first then print, so 9<10 then increase by 1 and print, it prints 1 to 10
            System.out.println("the number is "+start);
            start ++; //if I don't use start++ it will run nonstop// increase or decrease //prints 0 to 9
        }

        while (true){
            System.out.println("Zeliha"); // this will run until your computer gives up.
        }
    }
}
