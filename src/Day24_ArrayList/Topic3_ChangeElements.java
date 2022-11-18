package Day24_ArrayList;

import java.util.ArrayList;

public class Topic3_ChangeElements {
    public static void main(String[] args) {
        ArrayList<String> RandomWords = new ArrayList<>(4);
        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("youth");

        System.out.println(RandomWords);

        /*
        To change elements of the ArrayList, we use set() method of the array
         */

        RandomWords.set(1,"noodle");
        System.out.println(RandomWords);

        /*
        Here, the set() method changes the element at index 1 to noddle   ("rice" => "noddle")
         */

        /*

         */

        int IndexOfElastic = RandomWords.indexOf("elastic");
        //-1 0 1 2 3 ....
        int IndexOfZeliha = RandomWords.indexOf("Zeliha");
        if (IndexOfZeliha>-1){
            System.out.println("We have zeliha in the ArrayList");
        }else {
            System.out.println("We do Not have zeliha in the ArrayList");
        }
        boolean DoWeHaveBulgurInArrayList = RandomWords.contains("Bulgur");
        System.out.println(DoWeHaveBulgurInArrayList);

        System.out.println("-----------------------------------");

        System.out.println(RandomWords);
        RandomWords.set(RandomWords.indexOf("elastic"),"chocolate" );
        System.out.println("Modified Array List: "+RandomWords);


    }
}
