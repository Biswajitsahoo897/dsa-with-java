package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElement {
    static void queueReverse(Queue<Integer>q, int k){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.poll());
        }
        
        // st 1 2 3 4

        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=0;i<q.size()-k;i++){
            q.offer(q.poll());
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};

        int k=5;
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }

        queueReverse(queue, k);
        // queue.add(78);
        // System.out.println(queue.poll());
        System.out.println(queue);
    }
}
