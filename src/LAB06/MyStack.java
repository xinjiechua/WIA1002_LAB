package LAB06;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class

MyStack <E> {
    ArrayList<E>list = new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        if(isEmpty())
            throw new EmptyStackException();
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    public E peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return list.get(getSize()-1);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return "stack" + list.toString();
    }

    public boolean search(E o){
        return list.contains(o);
    }

    /*return zero if not found, otherwise return location number for the found element
    public int search(E o){
        int index = 0;
        if(list.contains(o)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(o)) {
                    return i;
                }
                else
                    index=0;
            }
        }
        return index;
    }
    */
}
