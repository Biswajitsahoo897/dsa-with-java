package linkedlist;

// Single linkedlist (ll)
public class singlyLinkedList {
    public Node head;
    public Node tail;
    public int length;

    class Node {
        int data;
        Node next;
        Node(int value) {
            this.data = value;
        }
    }

    public singlyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void appendNode(int value){
        Node newNode=new Node(value);
        if (length==0) {
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    
        length++;
    }

    public Node removeLast(){
        if(length==0) return null;
        Node temp=head;
        Node pre=head;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }  
    
    public Node removeFirst(){
        if(length==0) return null;
        Node temp;
        temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }

    public Node get(int index){
        Node temp=head;
        if(length<0||index>=length){
            return null;
        }
        for (int i = 0; i <index; i++) {
            temp=temp.next;
        }
        return temp;
    }

    public boolean set(int index,int value){
        Node temp=get(index);
        if(temp!=null){
            temp.data=value;
            return true;
        }
        return false;
    }
    
    public void prependNode(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
            head.next=null;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }
    
    public boolean insert(int index,int value){
        if(index<0||length>=index) return false;
        if(length==0){
            prependNode(value);
            return true;
        }
        if(length==index){
            appendNode(value);
            return true;
        }
        Node newNode=new Node(value);
        Node temp=get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return false;
    }

    public Node remove(int index){
        if(index<0||index>length) return null;

        if(length==0) return removeFirst();
        if(length==index) return removeLast();
        
        Node temp=get(index-1);
        temp.next=temp.next.next;
        length--;
        return temp;
        
    }

    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        Node after=temp.next;
        Node before=null;
        for (int i = 0; i <length; i++) {
            after=temp.next;
            temp.next=before; //this line creates the gap between them
            before=temp;
            temp=after;
        }
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null\n");
    }
    public void getHead(){
        System.out.println("Head: " + head.data);
    }
    public void getTail(){
        System.out.println("Tail: " + tail.data);
    }
    public void getLength(){
        System.out.println("length : " + length);
    }
    public static void main(String[] args) {
        // Creating a linked list with initial value 3
        singlyLinkedList myLinkedList = new singlyLinkedList(3);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        // Appending nodes
        System.out.println("After appending nodes 2,5, 7, 9:");
        myLinkedList.appendNode(2);
        myLinkedList.appendNode(5);
        myLinkedList.appendNode(7);
        myLinkedList.appendNode(9);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        // // Removing last node
        // System.out.println("After removing last node:");
        // System.out.println("Removed node : " + myLinkedList.removeLast().data);
        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();
        // myLinkedList.printList();

        // // Prepending node
        // System.out.println("After prepending node with value 1:");
        // myLinkedList.prependNode(1);
        // myLinkedList.getHead();
        // myLinkedList.getLength();
        // myLinkedList.printList();

        System.out.println("After removing the first Node : "+myLinkedList.removeFirst().data);
        myLinkedList.getHead();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("Getting the element at the index 2 is : "+myLinkedList.get(2).data);
        System.out.println("Setting the value of index 1 : "+myLinkedList.set(1, 34));
        myLinkedList.printList();

        System.out.println("Removing the node at index 2 :"+myLinkedList.remove(2).data);
        myLinkedList.printList();

        System.out.println("Reverse linkedlist : ");
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
