package LAB07b;

import java.util.PriorityQueue;

public class Q1 {

    public static void main(String[] args) {
        int [] num = {4,8,1,2,9,6,3,7};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : num){
            pq.add(i);
        }

        System.out.println("Priority queue: " + pq);
        System.out.println("Remove first element "+ pq.poll());
        System.out.println("Add new element 5");
        pq.add(5);

        Object[] arr = pq.toArray();
        System.out.print("Value in array: ");
        for(Object a : arr)
            System.out.print(a + " ");

        System.out.println("\nFirst element: " + pq.peek());

        System.out.println("Does the priority queue consists of element 1 ? " + pq.contains(1));

        System.out.println("Size of priority queue: " + pq.size());
        System.out.print("Removing elements from priority queue: ");
        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
        System.out.println();

        pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i : num){
            pq.add(i);
        }
        System.out.println("Reversed priority queue: " + pq);
    }
}
