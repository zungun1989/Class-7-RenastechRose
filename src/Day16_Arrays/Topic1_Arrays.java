package Day16_Arrays;

public class Topic1_Arrays {
    public static void main(String[] args) {
        // variable:
        //Datatype name = value;

        // Arrays: are the containers where they hold multiples in the same data types.
        // DataType [] name = {value1, value2, value3}

        int [] array1 = {78,23,91,34};

        // In arrays index starts from 0
        //byte [] array2 = {9};

        int [] array2 = {67,          90,            28,          10};
        // the index:  index 0     index 1       index 2        index 3

        System.out.println("The first number in "+array2[0]);
        System.out.println("The first number in "+array2[1]);
        System.out.println("The first number in "+array2[2]);
        System.out.println("The first number in "+array2[3]);

        int var3 = array2[2];
        System.out.println(var3);

        System.out.println("+++++++++++++++++++++++++++++++");

        // Boolean data type arrays;
        boolean [] boolArray= {true, false, true, true};
        System.out.println("the value in index 3 in BoolArray is: "+boolArray[3]);

        boolean var = boolArray[1];
        System.out.println(var);

        System.out.println("+++++++++++++++++++++++++++++++++");

        // double data type arrays

        double [] dobarray = {90, 65.8778, 23}; // 90.000000
        System.out.println("the value in index 0: "+dobarray[0]);


        System.out.println("+++++++++++++++++++++++++++++++++++");

        //String Arrays

        String [] stringArraynames = {"Cheesus", "Zeliha", "Fahrettin", "Eloise", null};
        System.out.println("the name is: "+stringArraynames[2]);
        System.out.println("the name is: "+stringArraynames[4]);


    }
}
