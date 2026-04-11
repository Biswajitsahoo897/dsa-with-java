package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListBasic {
    public static void main(String[] args) {
        
        // -------------------------------------------------------------------
        // 1.Arraylist 
        // -------------------------------------------------------------------
        
        // Maintains insertion order
        // get -> O(1) 
        // insert/delete -> O(N)

        // -------------------------------------------------------------------
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(6);
        al.add(9);
        al.add(1);

        System.out.println(al.size()); //5

        al.set(2, 10);
        al.remove(1); 
        System.out.println(al.get(3));
        System.out.println(al.getFirst());//first element 
        System.out.println(al.getLast()); //last element
        System.out.println(al);
        System.out.println(al.contains(10));

        // -------------------------------------------------------------------
        // 2.LinkedList
        // -------------------------------------------------------------------
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(3);
        ll.add(2);
        ll.add(10);
        ll.add(6);
        ll.add(9);

        ll.addFirst(21);
        ll.addLast(32);
        ll.getFirst();//21
        ll.getLast();//32
        //ll.poll(); //same as ll.pollFirst();
        ll.pollLast();
        System.out.println(ll);
        // ll.pollFirst();
        // ll.pollLast();
        


        // 
    }
}
