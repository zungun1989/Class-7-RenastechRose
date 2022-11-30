package Day30_Exceptions;

import sun.plugin2.message.Message;

public class Topic10_CustomException {
    public static void main(String[] args) {
        try {
            ValidateAge(15);
        }catch (NotEligibleToVoteException e){
            System.out.println(e.Message);
        }

        try{
            ValidateAge(19);
        }catch (NotEligibleToVoteException e){
            System.out.println("An Error Happened!");
        }

        try{
            throw new NoSuchFieldException();
        }catch (NoSuchFieldException e){
            System.out.println("I handled NoSuchFieldException");
        }

    }

    /*
    All the keywords about exception
    try
    catch
    finally
    throw
    throws
     */

    public static void ValidateAge(int param1) throws NotEligibleToVoteException {
        if (param1<18){
            throw new NotEligibleToVoteException("You cannot vote!");
        //    System.out.println("You cannot vote!");
        }else {
            System.out.println("You can vote");
        }
    }
}

class NotEligibleToVoteException extends Exception{

    String Message;
    ///Please create a constructor for this class with one string parameter

    //public ClassName (Parameter1Type, Parameter1Name....)

    public NotEligibleToVoteException (String param1){
        Message = param1;
    }

}
