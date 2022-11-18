package Day25_Classes;

import java.util.Scanner;

public class Topic2_IntroToClassesCont {
    public static void main(String[] args) {
        StudentRegistrationForm MyForm  = new StudentRegistrationForm();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        MyForm.FirstName = scan.nextLine();
        System.out.println("Please enter your lastname: ");
        MyForm.LastName = scan.nextLine();
        System.out.println("Please enter your Age: ");
        MyForm.Age = scan.nextInt();
        System.out.println("Please enter your gender: ");
        MyForm.Gender = scan.next();

        MyForm.PrintRegistrationForm();

    }
}

class StudentRegistrationForm{
    //Fields
    String FirstName;
    String LastName;
    int Age;
    String Gender;

    //Methods
    void PrintRegistrationForm(){
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(Age);
        System.out.println(Gender);

    }

}
