package LAB05.SList;

public class SList <E>{

    protected SNode<E> head, tail;
    int size = 0;

    public SList() {
        head = tail = null;
    }

    public void appendEnd(E e) {
        SNode<E> newNode = new SNode<>(e);
        if (tail == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public E removeInitial() {
       if(size == 0) {
           return null;
       }
       else {
           SNode<E> temp = head;
           head = head.next;
           size--;
           if (head == null) {
               tail = null;
           }
           return temp.element;
       }
    }

    public boolean contains(E e) {
        SNode<E> current = head;
        for (int i=0; i<size; i++) {
            if(current.element.equals(0))
                return true;
            current = current.next;
        }
        return false;
    }

    public void clear() {
        size = 0;
        head = tail = null;
        System.out.println("list is now empty.");
    }

    public void display() {
        for (SNode<E> tmp = head; tmp!= null; tmp = tmp.next)
            System.out.println(tmp.element);
    }
}

