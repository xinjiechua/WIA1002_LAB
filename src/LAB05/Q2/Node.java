package LAB05.Q2;


public class Node <E>{
    Node<E> next;
    E element;

    public Node(){
        element = null;
        next = null;
    }

    public Node(E item) {
        element = item;
        next = null;
    }
}