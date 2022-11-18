package Day16_Arrays;

public class Topic4_ArrayExamples {
    public static void main(String[] args) {
        int [] arr = {9, 3, 4, 5, 2,10,34};
        System.out.println("the size-length of arr is: "+arr.length);
        int length = arr.length; //length method returns to an integer value which is the size or the length of an array
        System.out.println("the variable length is the length of array: "+length);

        System.out.println("The value in index 0: "+ arr[0]);
        System.out.println("The value in index 1: "+ arr[1]);
        System.out.println("The value in index 2: "+ arr[2]);
        System.out.println("The value in index 3: "+ arr[3]);
        System.out.println("The value in index 4: "+ arr[4]);
        System.out.println("The value in index 5: "+ arr[5]);
        System.out.println("The value in index 6: "+ arr[6]);

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < 7; i++) { // i<arr.length == i<=arr.length-1
            System.out.println("the value in index "+i+" : "+arr[i]);
            //System.out.print(" ");

        }


    }
}
