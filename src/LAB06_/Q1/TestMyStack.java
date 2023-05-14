package LAB06_.Q1;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        for (char c = 'a'; c <= 'c'; c++)
            stack.push(c);
        System.out.println(stack);
        System.out.println("'b' is in the stack: " + stack.search('b'));
        System.out.println("'k' is in the stack: " + stack.search('k'));
        System.out.println();

        MyStack<Integer> stack2 = new MyStack<>();
        for (int i = 1; i <= 3; i++)
            stack2.push(i);
        System.out.println(stack2);
        System.out.println("'6' is in the stack: " + stack2.search(6));
    }
}
