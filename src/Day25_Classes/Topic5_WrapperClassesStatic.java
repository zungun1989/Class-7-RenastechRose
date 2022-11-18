package Day25_Classes;

public class Topic5_WrapperClassesStatic {
    public static void main(String[] args) {
        //we created a new Integer wrapper class with the value of 5
        Integer MyInt = new Integer(5);
        String MyString = MyInt.toString();

        //We convert our Integer(MyInt) to String
        Integer AnotherInteger = Integer.parseInt(MyString);

        //To convert our string to Integer, We used parseInt method of Integer

        Integer.parseInt("5");

    }
}
