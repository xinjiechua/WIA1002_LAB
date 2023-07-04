package LAB07;
import java.util.Collections;
import java.util.LinkedList;

public class MyQueue <E>{
    private LinkedList<E> list;

    public MyQueue(E[] e) {
        this();
        Collections.addAll(list, e);
    }

    public MyQueue() {
        list = new LinkedList<>();
    }

    public void enqueue(E e) {
        list.add(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public E getElement(int i) {
        return list.get(i);
    }

    public E peek() {
        return list.getFirst();
    }

    public int getSize() {
        return list.size();
    }

    public boolean contains(E e) {
        return list.contains(e);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        String[] fruits = {"Durian","Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<>(fruits);
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        System.out.println(fruitQ);
        System.out.println("Top item: "+ fruitQ.peek());
        System.out.println("Queue size: " + fruitQ.getSize());
        System.out.println("Delete" + fruitQ.dequeue());
        System.out.println("Item in index of position of 2: " + fruitQ.getElement(2));
        System.out.println("Queue consists of Cherry: " + fruitQ.contains("Cherry"));
        System.out.println("Queue consists of Durian: " + fruitQ.contains("Durian"));
        System.out.print("The list is: ");
        if(!fruitQ.isEmpty())
            System.out.println(fruitQ.toString());

        /*
        while(!fruitQ.isEmpty()) {
            System.out.print(fruitQ.dequeue() + " ");
        }
        System.out.println();
        */
    }
}
