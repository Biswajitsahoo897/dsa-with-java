package queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoHalves {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<>();
        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);
        q1.offer(6);
        q1.offer(7);
        q1.offer(8);
        q1.offer(9);
        q1.offer(10);

        Queue<Integer> q2=new LinkedList<>();
        int s=q1.size()/2;
        while(s-->0){
            q2.offer(q1.remove());
        }
        System.out.println(q2);
        System.out.println(q1);
        
        while (!q2.isEmpty()) {
            q1.offer(q2.remove());
            q1.offer(q1.remove());
        }

        System.out.println(q2);
        System.out.println(q1);
    }
}
