package LAB07b;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
        String [] arr1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        PriorityQueue<String>pq1 = new PriorityQueue<>(Arrays.asList(arr1));
        System.out.println("First Priority Queue: "+pq1);

        String [] arr2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
        PriorityQueue<String>pq2 = new PriorityQueue<>(Arrays.asList(arr2));
        System.out.println("Second Priority Queue: "+pq2);

        System.out.print("Union for 2 PQs: ");
        for (String element : pq1){
            System.out.print(element + " ");
        }
        for (String element : pq2){
            if (!pq1.contains(element))
                System.out.print(element + " ");
        }

        /*
        PriorityQueue<String> difference = new PriorityQueue<>(pq1);
        difference.removeAll(pq2);
        System.out.println("Difference: "+ difference);
        */

        System.out.print("\nDifference for 2 PQs: ");
        for (String element : pq1){
            if (!pq2.contains(element))
                System.out.print(element + " ");
        }

        System.out.print("\nIntersection for 2 PQs: ");
        for (String element : pq1){
            if (pq2.contains(element))
                System.out.print(element + " ");
        }
    }
}
