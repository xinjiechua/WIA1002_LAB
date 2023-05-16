package LAB07b;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
        String [] arr1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        PriorityQueue<String>pq1 = new PriorityQueue<>();
        for(String i : arr1)
            pq1.add(i);

        String [] arr2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
        PriorityQueue<String>pq2 = new PriorityQueue<>();
        for(String i : arr2)
            pq2.add(i);

        PriorityQueue<String> union = new PriorityQueue<>(pq1);
        union.addAll(pq2);
        System.out.println("Union: "+ union);

        PriorityQueue<String> difference = new PriorityQueue<>(pq1);
        difference.removeAll(pq2);
        System.out.println("Difference: "+ difference);

        Set<String> set1 = new HashSet<String>(pq1);
        Set<String> set2 = new HashSet<String>(pq2);
        set1.retainAll(set2);
        PriorityQueue<String> intersection = new PriorityQueue<String>(set1);
        System.out.println("Intersection: " + intersection.toString());
    }
}
