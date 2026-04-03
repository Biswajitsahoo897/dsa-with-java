package linkedlist;

public class LinkedListOperation {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;

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

    Node addLast(int x){
        Node curr=head;
        Node newNode= new Node(x);
        if(head==null){
            head=newNode;
            return head;
        }
        while (curr.next!=null) {
            curr=curr.next;
        }
        curr.next=newNode;
        return head;
    }
    
    void addInMiddle(int pos,int x){
        Node curr=head;
        Node newNode=new Node(x);
        int len=0;

        while(len<pos-1){
            len++;
            curr=curr.next;
        }

        newNode.next=curr.next;
        curr.next=newNode;
        
    }

    void deleteFirst(){
        if(head==null)return;
        Node curr=head;
        head=head.next;
        curr.next=null;
    }

    void deleteLast(){
        if(head==null)return;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    void deleteFromN(int n){
        Node curr=head;
        int sz=0;
        while(curr!=null){
            sz++;
            curr=curr.next;
        }
        //also n is from right to left 
        if(n==sz){//delete first node 
            head=head.next;
        }

        int i=1;
        int toFind=sz-n+1;
        Node prev=head;
        while (i<toFind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }

    int searchIterative(int x){
        Node temp=head;
        int pos=0;
        while(temp!=null){
            pos++;
            if(temp.data==x){
                return pos;
            }
            temp=temp.next;
        }
        return -1;
    }
    boolean recursiveSearch(Node head,int x){
        if(head.data==x && head!=null) return true;
        return recursiveSearch(head.next,x);
    }

    void reverseIterative(){
        Node before=null;
        Node curr=head;

        while (curr!=null) {
            Node next=curr.next;
            curr.next=before;
            before=curr;
            curr=next;
        }
        head=before;
    }

    void printLinkedList(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListOperation ll=new LinkedListOperation();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(5);
        ll.addFirst(9);

        ll.addLast(10);
        ll.addLast(8);
        ll.addLast(7);

        ll.addInMiddle(3, 100);
        
        // ll.deleteFirst();
        // ll.deleteLast();
        ll.deleteFromN(3);
        // System.out.println(ll.searchIterative(10));
        // System.out.println(ll.recursiveSearch(head, 10));
        ll.reverseIterative();
        ll.printLinkedList();
    }
}
