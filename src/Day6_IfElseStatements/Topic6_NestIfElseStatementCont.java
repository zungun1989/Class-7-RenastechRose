package Day6_IfElseStatements;

public class Topic6_NestIfElseStatementCont {
    public static void main(String[] args) {
        //Last names = Doe, yilmaz, Ekinci
        // if last name is yilmaz and the age is over 20 print th elastname and the age is if not just print the name
        // if lastname is Doe and the ae is over 10 print just the lastname if not print the just age
        // if it Ekinci print lastname and age.

        String lastname="Doe";
        int age=9;

        if (lastname=="Yilmaz"){
            if(age>20){
                System.out.println("the lastname is:"+ lastname+"the age is:" + age);
            }else{
                System.out.println("Just lastname: "+lastname);
            }
        } else if (lastname== "Doe") {
            if (age>10){
                System.out.println("Just the lastname:"+lastname);
            }else{
                System.out.println("the age:"+age);
            }
        }else{
            System.out.println("lastname:"+ lastname+" The age:"+ age);
        }
    }
}
