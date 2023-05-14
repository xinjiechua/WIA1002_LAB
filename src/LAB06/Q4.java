package LAB06;

import java.util.Scanner;
import java.util.Stack;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any string: ");
        String input = sc.nextLine();
        Stack<Character> a = new Stack<>();
        for(int i=0; i<input.length(); i++){
            a.push(input.charAt(i));
        }
        sc.close();
        String reverse = "";
        while(!a.isEmpty()){
            reverse = reverse + a.pop();
        }
        if(input.equals(reverse)){
            System.out.println(input + " is a palindrome");
        }
        else{
            System.out.println(input + " is not a palindrome");
        }
    }
}
