package LAB07b;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q1 {

    public static void main(String[] args) {
        Integer [] arr = {4,8,1,2,9,6,3,7};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(arr));

        System.out.println("Elements in the priority queue: " + pq);
        System.out.println("Retrieve and remove first element "+ pq.poll());
        System.out.println("Add new element 5");
        pq.add(5);

        System.out.println("Priority queue converted to an array: " + Arrays.toString(pq.toArray()));

        System.out.println("\nFirst element: " + pq.peek());

        System.out.println("Does the priority queue consists of element 1 ? " + pq.contains(1));

        System.out.println("Size of priority queue: " + pq.size());
        System.out.print("Removing elements from priority queue: ");
        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
        System.out.println();

        pq = new PriorityQueue<>((a, b) -> b - a);  //PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.addAll(Arrays.asList(arr));
        System.out.println("Reversed priority queue: " + pq);
    }
}
