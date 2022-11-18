package Day7_SwitchStatements;

public class Topic4_SwitchStamentsCont {
    public static void main(String[] args) {
        //write a code where it prints the name of the day based on the weeks days

        int day = 1;
        int hours = 12;
        switch (day){
            case 1 :
                switch (hours){ //nested switch statement
                    case 12:
                        System.out.println("this is day 1 monday hours 12");
                        break;
                    case 13:
                        System.out.println("this is day 1 monday hours 13");
                        break;
                    default:
                        System.out.println("invalid hours");
                }
                System.out.println("the 1st day of the week is Monday");
                break;// break is where the code stop executing the code inside the switch statements

            case 2 :
                System.out.println("the 2nd day of the week is Tuesday");

            case 3 :
                System.out.println("the 3rd day of the week is Wednesday");

            case 4 :
                System.out.println("the 4th day of the week is Thursday");

            case 5 :
                System.out.println("the 5th day of the week is Friday");

            case 6 :
                System.out.println("the 6th day of the week is Saturday");

            case 7 :
                System.out.println("the 7th day of the week is Sunday");

            default:
                System.out.println("invalid day of the week");
        }
    }
}
