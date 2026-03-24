package linkedlist;

import java.util.HashSet;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class intersectionOfNode {

    public Node getIntersectionNode(Node headA, Node headB) {
        HashSet<Node> setNode=new HashSet<>();

        Node curr1=headA;
        while(curr1!=null){
            setNode.add(curr1);
            curr1=curr1.next;
        }
        
        Node curr=headB;
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
