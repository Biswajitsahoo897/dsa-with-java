package collections;

import java.util.HashSet;
// import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetBasic {
    public static <E> void main(String[] args) {
        // 1.HashSet

        // Unordered , No Duplicates , can contains NULL , every operation happens in O(1)
        // worst case O(N)

        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(1);
        set.add(4);
        

        set.remove(1);
        System.out.println(set.contains(6));
        System.out.println(set.size());
        System.out.println(set.hashCode()); // adds them all 
        System.out.println(set.stream().filter(x->x%2==0).count());
        System.out.println("HashSet (order not maintained):"+set);



        // Iterator in java (printing the values)----1
        // Iterator it= set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


        // using for each loop ------2 (Interation of the set)
        for (Integer s :set) {
            System.out.println(s);
        }


        // 2.LinkedHashSet

        // insertion order maintained , uses doubly linkedlist internally , operation same as the HashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(10); // duplicate, won't be added
        
        lhs.remove(20);
        lhs.addFirst(45);
        lhs.addLast(55);


        System.out.println("LinkedHashSet (Order maintained+unique): " + lhs);

        // 3.TreeSet
        // Sorted order (Ascending) , No Duplicates , does NOT allow NULL , operations O(log N)
        // uses red-black tree internally(Balaced BST)

        // we can get smallest unique and largest unique value

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(21);
        ts.add(4);
        ts.add(1);
        ts.add(10);
        ts.add(2);


        System.out.println(ts.first());
        System.out.println(ts.last());
        // System.out.println(ts.getLast()); //same as above
        // ts.pollFirst();
        // ts.pollLast();
        System.out.println("TreeSet (Sorted Order): " + ts);
        
    }
}
