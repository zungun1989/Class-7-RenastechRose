package Day11_ForLoopCont;

public class Topic3_ForLoopEx2 {
    public static void main(String[] args) {
        //write a code where you find the even numbers between 10 -120(not included)

        int count = 0;
        int count1 = 0;
        for (int i = 10; i < 120; i+=2) { //if we start with odd number, it will execute the count of odd numbers vice versa
            count++;//count = count +1;
        }
        System.out.println("The count of even numbers: "+count);

        // write a code where you find the odd numbers between 11-120 (not included)
        for (int i = 11; i <120 ; i+=2) {
            count1++;
        }
        System.out.println("The count of odd numbers: "+count1);
    }
}
