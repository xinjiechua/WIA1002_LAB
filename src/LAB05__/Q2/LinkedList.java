package LAB05__.Q2;

public class LinkedList<E>{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node() {}

        public Node(E item) {
            this.item = item;
        }
    }

    public void add(E e) {
        Node<E> node = new Node<>(e);
        if (tail != null) tail.next = node;
        tail = node;
        if (head == null) head = tail;
        size++;
    }

    public void removeElement(E e) {
        Node<E> dummy = new Node<>();
        dummy.next = head;

        Node<E> current = dummy;
        while (current.next != null) {
            if (e.equals(current.next.item)) {
                current.next = current.next.next;
                size--;
            }
            else
                current = current.next;
        }
        head = dummy.next;
        tail = (current == dummy ? null : current);
    }

    public void printList() {
        if (size == 0) {
            System.out.println();
            return;
        }
        System.out.print(head.item);
        for (Node<E> node = head.next; node != null; node = node.next)
            System.out.print(", " + node.item);
        System.out.println(".");
    }

    public int getSize() {
        return size;
    }

    public boolean contains(E e) {
        for (Node<E> node = head; node != null; node = node.next)
            if (e.equals(node.item))
                return true;
        return false;
    }

    public void replace(E e, E newE) {
        for (Node<E> node = head; node != null; node = node.next)
            if (e.equals(node.item))
                node.item = newE;
    }
}
