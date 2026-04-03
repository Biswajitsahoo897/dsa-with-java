package linkedlist;

public class CheckForPalindrome {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node addFirst(int x){
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
            return head;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        return head;
    }

    static Node head=null;
    boolean isPalindrome(){
        if(head==null || head.next==null)return true;

        //S1->first find the mid of the linkedlist
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node curr=slow.next;
        Node prev=null;
        //S2->reverse the second half ll
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        // S3-> 
        Node first=head;
        Node sec=prev;
        while(sec!=null){
            if(first.data!=sec.data) return false;
            first=first.next;
            sec=sec.next;
        }
        return true;
    }
    public static void main(String[] args) {
        CheckForPalindrome ll=new CheckForPalindrome();
        ll.addFirst(1);
        ll.addFirst(9);
        ll.addFirst(4);
        ll.addFirst(9);
        ll.addFirst(1);

        System.out.println(ll.isPalindrome());
        
    }
}
