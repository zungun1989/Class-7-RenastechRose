package Day31_CollectionsFramework;

import java.util.PriorityQueue;

public class Topic7_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> MyQueue = new PriorityQueue<>();

        MyQueue.offer("Welcome");
        MyQueue.offer("To");
        MyQueue.offer("Java");
        MyQueue.offer("4");
        MyQueue.offer("Testers");

        //4
        //Java
        //testers
        //To
        //Welcome


        System.out.println(MyQueue);

        System.out.println("+++++++++++++++++");
        //peek
        System.out.println(MyQueue.peek());

        //poll
        while (!MyQueue.isEmpty()){
            String s2 = MyQueue.poll();
            System.out.println(s2);
        }
        //4 got it deleted
        //Java
        //testers
        //To
        //Welcome

        System.out.println(MyQueue);

    }
}
