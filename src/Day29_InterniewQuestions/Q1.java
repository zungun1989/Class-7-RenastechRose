package Day29_InterniewQuestions;

import java.util.Arrays;

public class Q1 {
    // Write a method where it takes array of integers and returns the sorted version of that array

    //create method

    //Engine=> [4,5,1,7,8,9] => [1,4,5,7,8,9]

    public static void main(String[] args) {
        int[] arrayNotSortedExample = new int[]{4,5,1,7,8,9};
        int[] sortedArrayExample = sortTheArray(arrayNotSortedExample);

        System.out.println(Arrays.toString(sortedArrayExample));
    }



    public static int[] sortTheArray(int[] arrayNotSorted){
        for (int i = 0; i < arrayNotSorted.length; i++) {

            //inner nested loop pointing 1 index ahead
            for (int j = i+1; j < arrayNotSorted.length; j++) {

                //checking elements
                int temp = 0;
                if (arrayNotSorted[j] < arrayNotSorted[i] ){

                    //swapping
                    temp = arrayNotSorted[i];
                    arrayNotSorted[i] = arrayNotSorted[j];
                    arrayNotSorted[j] = temp;
                }

            }

        }

        return arrayNotSorted;
    }
}
