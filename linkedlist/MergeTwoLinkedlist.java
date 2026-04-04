package linkedlist;


public class MergeTwoLinkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;
    Node addNode(int x){
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
            return head;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        return head;
    }

    Node mergeTwoList(Node head1,Node head2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
            }else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        if(head1!=null) temp.next=head1;
        if(head2!=null) temp.next=head2;

        return dummy.next;
    }

    Node mergeSort(Node head){
        if(head==null || head.next==null) return head;
        Node mid=findMid(head);
        Node rHead=mid.next;
        mid.next=null;
        Node newleft=mergeSort(head);
        Node newRight=mergeSort(rHead);
        return mergeTwoList(newleft, newRight);
    }

    Node findMid(Node head){
        if(head==null || head.next==null) return head;
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    void printList(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        MergeTwoLinkedlist ll=new MergeTwoLinkedlist();

        ll.addNode(2);
        ll.addNode(-3);
        ll.addNode(10);
        ll.addNode(9);
        ll.addNode(6);
        ll.addNode(4);

        ll.head=ll.mergeSort(ll.head);
        // find the middle and return it
        ll.printList();
    }
}
