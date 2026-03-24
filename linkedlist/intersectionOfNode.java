package linkedlist;

import java.util.HashSet;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class intersectionOfNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> setNode=new HashSet<>();

        ListNode curr1=headA;
        while(curr1!=null){
            setNode.add(curr1);
            curr1=curr1.next;
        }
        
        ListNode curr=headB;
        while(curr!=null){
            if(setNode.contains(curr)){
                 //we are checking the object refrernce or the address of the node not the value
                return curr;
            }
            curr=curr.next;
        }
        return null;
    }
}
