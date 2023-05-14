package LAB06;

import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        MyStack<Integer> s1 = new MyStack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer:");
        int value = sc.nextInt();
        for(int i=1; i<=value;i++){
            s1.push(i);
        }
        sc.close();
        System.out.println(s1);
        System.out.println("The size of the stack is " + s1.getSize());
        System.out.print("Popping the stack: ");
        while(!s1.isEmpty()){
            int intValue = s1.pop();
            System.out.print(intValue + " ");
        }
        System.out.print("\n");
    }
}

