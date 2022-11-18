package Day7_SwitchStatements;

public class Topic1_IfElseExample {
    public static void main(String[] args) {
        //write a code where students are placed in the classes based on individuals preference and knowledge.
        // Our school allows students to have only one preference.

        String Firstname = "Zeliha";
        String Pre = "DA";
        int level = 1;

        if (Pre == "QA"){
            if(level ==1){
                System.out.println((Firstname+ " is placed in beginner level class for QA"));
            } else if (level ==2) {
                System.out.println(Firstname+ "is placed in Mid level Class for QA");
            } else {
                System.out.println(Firstname+ " is placed in Advanced level class for QA");
            }
        } else if (Pre == "SE") {
            if (level ==1){
                System.out.println(Firstname+" is placed in beginner level class for SE");
            } else if (level == 2) {
                System.out.println(Firstname+" is placed in Mid level class for SE");
            } else {
                System.out.println(Firstname+ " is placed in Advanced level class for SE");
            }
        }else if (Pre == "DA") {
            if(level==1){
                System.out.println(Firstname+ " is placed in beginner level class for DA ");
            } else if (level ==2) {
                System.out.println(Firstname+" is placed in Mid level class for DA ");
            }else {
                System.out.println(Firstname+ " is placed in Advanced level class for DA");
            }
        }else {
            System.out.println("Invalid Selection");
        }
    }
}
