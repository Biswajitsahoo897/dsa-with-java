package heaps;

// import java.util.Comparator;

import java.util.PriorityQueue;

public class priorityQueueCollectionFw {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(); //by default ascending order
        // PriorityQueue<Integer> pqr=new PriorityQueue<>(Comparator.reverseOrder()); //maxheap
        
        pq.add(3);
        pq.add(2);
        pq.add(9);
        pq.add(5);
        pq.add(7);
        pq.add(1);

        // pqr.add(3);
        // pqr.add(2);
        // pqr.add(9);
        // pqr.add(5);
        // pqr.add(7);
        // pqr.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()+" ");
            pq.remove();
        }
        // it will print in the reverse order
        // while (!pqr.isEmpty()) {
        //     System.out.println(pqr.peek()+" ");
        //     pqr.remove();
        // }
    }
}
