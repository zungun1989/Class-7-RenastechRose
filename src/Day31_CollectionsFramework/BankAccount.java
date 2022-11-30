package Day31_CollectionsFramework;

public class BankAccount {
    double Balance;

    /// please create a constructor that takes one double parameters
    //public ClassName(parameter1type parameter1name...)

    public BankAccount(double param1) {
        Balance = param1;
    }

    /// please create a method that takes a double as parameter
    ///No return
    ///This method will add the parameter to your balance.
    ///Method name = Deposit

    public void Deposit (double param1){
       Balance= Balance+param1;
        System.out.println("Available balance: "+Balance);
    }

    /// please create a method that takes a double as parameter
    ///No return
    ///This method will subtract the parameter to your balance.
    ///Method name = Withdrawal

    public void Withdrawal (double param1) throws InsufficientException {
        if (Balance< param1){

            /*
            try
            catch
            finally
            throw
            throws
             */

            throw new InsufficientException();

        }else {
            Balance = Balance-param1;
            System.out.println("Available balance: "+Balance);
        }

    }


}
