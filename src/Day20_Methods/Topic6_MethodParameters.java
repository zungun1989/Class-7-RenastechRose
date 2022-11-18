package Day20_Methods;

public class Topic6_MethodParameters {
    public static void main(String[] args) {
        MyMethod("Zeliha",33);
        System.out.println("Cont from here");
        System.out.println("+++++++++++++++");
        MyMethod("Fahrettin",38);
        System.out.println("+++++++++++++++++");
        MyMethod("Nurcan",60);

    }

    public static void MyMethod (String name, int age){
        System.out.println("My name is "+name);
        System.out.println("I am "+age+" years old");
    }
}
