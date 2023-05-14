package LAB06;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> ms = new MyStack<>();
        ms.push('a');
        ms.push('b');
        ms.push('c');
        System.out.println(ms);
        System.out.println("Does value b exist in stack1? " + ms.search('b'));
        System.out.println("Does value k exist in stack1? " + ms.search('k'));
        MyStack<Integer> is = new MyStack<>();
        is.push(1);
        is.push(2);
        is.push(3);
        System.out.println(is);
        System.out.println("Does value 6 exist in stack2? " + is.search(6));
    }
}
