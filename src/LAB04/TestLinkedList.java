package LAB04;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        System.out.println("The list is");
        list.print();

        System.out.println("\nThe reverse list is");
        list.reverse();

        System.out.println("\nThe number of elements in the list is " + list.size + "\n");
        System.out.println("First element is " + list.getFirst());
        System.out.println("Last element is " + list.getLast());

        System.out.println("\nDelete the middle value " + list.remove(list.size/2));
        list.print();

        System.out.println("Index of the second value b is " + list.indexOf('b'));
        System.out.println("Index of the third value c is " + list.indexOf('c'));
        System.out.println("The list consist of value 'c: " + list.contains('c'));

        Character []arr = {'h','e','l','l','o'};
        for(int i=0; i<arr.length; i++){
            if(i<list.size)
                list.set(i,arr[i]);
            else
                list.add(arr[i]);
        }
        list.print();

        System.out.println("The middle element is " + list.getMiddleValue());


    }
}
