package linkedlist;

import java.util.HashSet;

public class hasCycle {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    // this method is known as floyd’s cycle detection algo
    public boolean hasCycleF1(ListNode head) {
        ListNode slow = head , fast = head ;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
    // what's the first thing that comes into mind is hashSet ...
    public boolean hasCycleF2(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        while(head != null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head=head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
