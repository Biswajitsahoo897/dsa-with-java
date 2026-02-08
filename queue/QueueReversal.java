package queue;

import java.util.*;

public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<>();
        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);

        Stack<Integer> st=new Stack<>();
        while (!q1.isEmpty()) {
            st.push(q1.remove());
        }
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

        // deque- Double ended queue
        Deque<Integer>d=new ArrayDeque<>();
        d.add(1);
        d.addLast(3);
        d.addFirst(2);
        d.addFirst(4);
        d.addLast(9);
        System.err.println(d);
        d.removeFirst();
        d.removeLast();
        System.err.println(d);
    }
}
