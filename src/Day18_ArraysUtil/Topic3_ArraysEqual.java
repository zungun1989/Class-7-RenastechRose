package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic3_ArraysEqual { // this equals method is everything sensitive.
    public static void main(String[] args) {
        int [] nums = {9,8,7,3,4,5};
        int [] nums1 = {9,8,7,3,4,5};
        System.out.println("Is nums and nums1 equal: "+ Arrays.equals(nums,nums1));

        int [] nums2  = {3,4,5};
        int [] nums3 = {4,3,5};
        System.out.println("Is nums2 and nums3 equal: "+ Arrays.equals(nums2,nums3));

        char [] ch = {'R', 'L', 'E'};
        char [] ch1 = {'r', 'L', 'E'};
        System.out.println("is ch and ch1 arrays equal: "+ Arrays.equals(ch,ch1)); // case sensitive.

        int [] num4 = {7,8,9,5,10};
        int [] num5 = num4;
        System.out.println("the num5 values: "+Arrays.toString(num5));
        System.out.println("is nums4 and num5 equal: "+Arrays.equals(num4, num5));
    }
}
