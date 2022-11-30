package Day31_CollectionsFramework;

public class InsufficientException extends Exception {
String Message;

public InsufficientException(){
    Message = "I am sorry! you don't have enough money in your account..";
}
}
