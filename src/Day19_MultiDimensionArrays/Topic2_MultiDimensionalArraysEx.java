package Day19_MultiDimensionArrays;

public class Topic2_MultiDimensionalArraysEx {
    public static void main(String[] args) {
        String [][] names = {{"Ziya","Seda"},{"Sena","Anil","Hrakar"},{"Ferah","Onder","Fahrettin","Amer"}};
        //index                 names [0]       names[1]        names[2]
        //String [] regular = names[0] == {"Ziya", "Sena"}
        // regular[0] == "Seda" ====> names [0][1] == "Seda"

        String [] regular = names[0];
        System.out.println("The value in index 1: "+regular[1]);
        System.out.println("the value in index 1: "+names[0][1]);

        //Getting the length(size) of multidimension arrays

        int namesLen = names.length;
        System.out.println("The length of names array: "+namesLen);


        //names[0], names[1], names[2] ==> names.[index].length == to find inner array's length

        System.out.println("The length of names[0] array is: "+names[0].length);
        System.out.println("The length of names[1] array is: "+names[1].length);
        System.out.println("The length of names[2] array is: "+names[2].length);

    }
}
