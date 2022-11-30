package Day30_Exceptions;

public class Topic9_FinallyCont {
    public static void main(String[] args) {
        try{
            System.out.println("Do Something");
        }catch (Exception e){
            e.printStackTrace();
        }
    //    System.out.println("something"); you cannot put anything like that in between
        finally {
            System.out.println("Finally");
        }

        //final, finally, finalize

        //another code starts here
        System.out.println("No Finally");
    }
}
