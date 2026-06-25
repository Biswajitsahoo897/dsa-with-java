package heaps;

import java.util.PriorityQueue;

public class FindKthLargestElement {
    public static void main(String[] args) {
        int nums[]={3,2,1,5,6,4};
        // if we sort the array the sec largest element from the right side of the array will be 5 
        // that what it is , by default priorityqueue stores min heap , max heap can also be used
        
        int k=2;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add(x);
            while(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
}
