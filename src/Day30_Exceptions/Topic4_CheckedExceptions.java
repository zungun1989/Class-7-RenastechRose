package Day30_Exceptions;

public class Topic4_CheckedExceptions {
    public static void main(String[] args) {
        // Class.forName("Something");


        try{
            Class.forName("Something");
        }catch (Exception e){
            System.out.println("You got an error!");
        }
    }
}
