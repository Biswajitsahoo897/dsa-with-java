package queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class queueUsingCollection {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        // Queue<Integer> qq=new ArrayDeque<>(); both are almost same , but they varies in terms of internal memory and storage
    

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}
