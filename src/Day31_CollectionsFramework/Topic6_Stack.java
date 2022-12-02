package Day31_CollectionsFramework;

import java.util.Stack;

public class Topic6_Stack {
    public static void main(String[] args) {
        //in stack last in first out, like stackable things
        Stack<String> MyStack = new Stack<>();

        //push() method
        // to add an element on top of the stack
        MyStack.push("Dog");
        MyStack.push("Horse");
        MyStack.push("Cat");
        System.out.println(MyStack);

        //peek() method
        // returns the element from the top of the stack
        String MyPeek  = MyStack.peek();
        System.out.println(MyPeek);

        //pop() method
        //removing the first element (element on top of the stack)

        //access and remove the element

        System.out.println("++++++++++++++++++++");
        String MyPop = MyStack.pop();
        System.out.println(MyPop);
        System.out.println(MyStack);

        //search() Method
        //searching the element and giving the index of it.
        System.out.println("++++++++++++++++++++");
        int Position  = MyStack.search("Horse");
        System.out.println(Position);

        System.out.println("++++++++++++++++++++");
        int Position2  = MyStack.search("Monkey");
        System.out.println(Position2);
    }
}
