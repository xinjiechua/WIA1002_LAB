package LAB07;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Check whether the string is palindrome or not: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        MyQueue<Character> q = new MyQueue<>();
        for (int i = 0; i < s.length(); i++) {
            q.enqueue(s.charAt(i));
        }
        for (int i = s.length() - 1; i >= 0; i--)
            if (q.dequeue() != s.charAt(i))
                return false;
        return true;
    }
}
/*
        MyQueue<Character> list = new MyQueue<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            list.enqueue(input.charAt(i));
        }
        StringBuilder reverse = new StringBuilder();
        while (!list.isEmpty()){
            reverse.append(list.dequeue());
        }
        if (input.equals(reverse.toString())) System.out.println(input +" is palindrome");
        else System.out.println(input +" is not palindrome");

         */
