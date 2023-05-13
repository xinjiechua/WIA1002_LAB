package LAB05.Q2;

public class MyLinkedList<E>{
    private Node<E> head, tail;
    int size = 0;

    public MyLinkedList(){}

    public MyLinkedList(E[]objects){
        for(int i=0; i< objects.length; i++){
            add(objects[i]);
        }
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null){
            tail = head;
        }
    }

    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if (tail == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void add(E e){
        add(size,e);
    }

    public void add(int index, E e){
        if (index == 0){
            addFirst(e);
        }
        else if (index >= size){
            addLast(e);
        }
        else{
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }

    public E removeFirst(){
        if(size == 0){
            return null;
        }
        else{
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head == null){
                tail = null;
            }
            return temp.element;
        }
    }

    public E removeLast(){
        if (size == 0){
            return null;
        }
        else if (size == 1){
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }else{
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) { // stop at second last node
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index){
        if (index < 0 || index >= size) return null;
        if (index == 0) return removeFirst();
        else if (index == size - 1) return removeLast();
        else{
            Node<E> cur = head;
            for (int i = 0; i < index - 1; i++) { // stop at the node before the index
                cur = cur.next;
            }
            Node<E> temp = cur.next;
            cur.next = cur.next.next;
            size--;
            return temp.element;
        }
    }

    public void removeElement(E e){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element.equals(e)){
                remove(i);
            }

        }
        current = current.next;
    }

    public boolean contains(E e){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void replace(E e, E newE){
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if(current.element.equals(e)){
                current.element = newE;
            }
            current = current.next;
        }
    }

    public void printList(){
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.element);

            if (i == size-1) {
                System.out.print(". ");
            }
            else {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }

    public E get(int index){
        if (index < 0 || index >= size-1)
            return null;
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.element;
    }

    public E getFirst(){
        if (head == null)
            return null;
        else return head.element;
    }

    public E getLast(){
        if (tail == null)
            return null;
        else return tail.element;
    }
}