package Homeworks;

import java.util.Scanner;

public class Homework_12 {
    public static void main(String[] args) {
        /*
        -Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
        - based on the point the code should automatically determine the grade of Student with the full name of the student
        - This should be done for each student
        - Assuming we do not know how many student are there but your code should still handle this situation
        -  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
        - When the point is between 90 to 100 the grade should be A
        - When the point is between 80 to 90(excluded) the grade should be B
        - When the point is between 70 to 80(excluded) the grade should be C
        - When the point is between 60 to 70 (excluded) the grade should be D
        - When the point is less than 60 the grade should be F
        - Example output (First Name = Ziya Last Name = Yilmaz Grade: A )
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the student's first name: ");
        String name = scan.nextLine();
        System.out.println("Please enter the student's last name: ");
        String lastname = scan.nextLine();
        System.out.println("Please enter the point the student received: ");
        double point = scan.nextDouble();


        if (point>=90 && point<=100){
            System.out.println("Firstname: "+name +" Lastname: "+lastname+" Grade: A");
        } else if (point>=80 && point<90) {
            System.out.println("Firstname: "+name +" Lastname: "+lastname+" Grade: B");
        } else if (point>=70 && point<80) {
            System.out.println("Firstname: "+name +" Lastname: "+lastname+" Grade: C");
        } else if (point>=60 && point<70) {
            System.out.println("Firstname: "+name +" Lastname: "+lastname+" Grade: D");
        } else if (point<60) {
            System.out.println("Firstname: "+name +" Lastname: "+lastname+" Grade: F");
        } else {
            System.out.println("Invalid entry.");
        }
    }
}
