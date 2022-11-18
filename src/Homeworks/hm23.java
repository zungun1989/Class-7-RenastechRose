package Homeworks;

import java.util.Scanner;

public class hm23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write something: ");
        String topic = scan.nextLine();
        String low = topic.toLowerCase();

        String reverse = "";
        for (int i = low.length() - 1; i >= 0; i--) {
            reverse = reverse + low.charAt(i);
        }
        if (low.equals(reverse)) {
            System.out.println(low + "is a Palindrome");
        } else {
            System.out.println("not plo");
        }
    }
}

