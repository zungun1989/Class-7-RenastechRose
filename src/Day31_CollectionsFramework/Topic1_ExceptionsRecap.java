package Day31_CollectionsFramework;

public class Topic1_ExceptionsRecap {
    public static void main(String[] args) {
        //DataType VariableName = new Constructor (parameter defined in constructor)
        //DataType VariableName = new DataType (parameter defined in constructor)

      BankAccount MyAccount = new BankAccount(100);

      MyAccount.Deposit(900);
        try {
            MyAccount.Withdrawal(1500);
        } catch (InsufficientException MyError) {
            System.out.println(MyError.Message);
        }

    }
}
