package CustomClasses;

import java.util.ArrayList;

public class StudentClass {
    public String Name;
    public String StudentNumber;

    private ArrayList<Integer> HomeworkResults;

    //Constructor
    public StudentClass(){
        HomeworkResults = new ArrayList<Integer>();
        System.out.println("Someone created a StudentClass");
    }

    ///AddHomeworkResult : this method will add result to your homework
    ///Returntype =No Return
    ///@param1 is an integer value

    public void AddHomeworkResult(int param1){
        HomeworkResults.add(param1);
    }

    public double GetMean(){
        int sum = 0;
        for (int i = 0; i < HomeworkResults.size(); i++) {
            sum= sum+HomeworkResults.get(i);
        }
        double Mean = sum/HomeworkResults.size();
        return Mean;
    }

}
