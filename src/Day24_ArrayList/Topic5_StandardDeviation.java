package Day24_ArrayList;

import java.util.ArrayList;

public class Topic5_StandardDeviation {
    public static void main(String[] args) {
        ArrayList<Integer> MyDataSet = new ArrayList<>();

        // For Example: a set of test scores is 10, 8 , 10 , 8, 8, and 4.

        MyDataSet.add(10);
        MyDataSet.add(8);
        MyDataSet.add(10);
        MyDataSet.add(8);
        MyDataSet.add(8);
        MyDataSet.add(4);

        int n = MyDataSet.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + MyDataSet.get(i);
        }
        System.out.println("Sum: "+sum);
        int mean = sum/n;

        System.out.println("Mean: "+mean);
        ArrayList<Integer> MyCalculatedVariance= CalculateVarianceArrayList(MyDataSet,mean);

        double SumOfVariance = 0;

        for (int i = 0; i < MyCalculatedVariance.size(); i++) {
            // SumOfVariance += MyCalculatedVariance.get(i); same as below
            SumOfVariance = SumOfVariance + MyCalculatedVariance.get(i);
        }
        System.out.println("Sum of the Variance ArrayList: "+ SumOfVariance);

        double ValueOfVariance = SumOfVariance / (n-1);

        System.out.println("Varience: "+ ValueOfVariance);

        double StandardDeviation = Math.sqrt(ValueOfVariance);

        System.out.println("The standard deviation is: "+StandardDeviation);


    }

    /// This method will calculate Variance of given ArrayList
    /// @param1 = this is an ArrayList that you will pass your Data set
    /// @param2 = this is an int that you will pass you calculated mean value
    public static ArrayList<Integer> CalculateVarianceArrayList (ArrayList<Integer> MyDataSet, int mean){
        ArrayList<Integer> Variance = new ArrayList<>();

        for (int i = 0; i < MyDataSet.size(); i++) {
         // Variance.set(i, MyDataSet.get(i)-mean); this is will throw an error as the size of the arraylist=0
            Variance.add(MyDataSet.get(i)-mean);
        }

        for (int i = 0; i < Variance.size(); i++) {

            int SquareOfElement = Variance.get(i)*Variance.get(i);

        //  same as above:
        //  double SquareOfElementUsingPow = Math.pow(Variance.get(i),2);

            Variance.set(i,SquareOfElement);
        }
        return Variance;
    }
}
