package Stack;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Stack{
    Node head=null;
    // push

    void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    void pop(){
        if(head==null){
            System.out.println("Stack is empty");
            return;
        }
        head=head.next;
    }

    int peek(){
        if(head==null){
            System.out.println("Stack is empty!!!");
            return -1;
        }
        return head.data;
    }

    // display
    void display(Node temp){
        if(temp==null){
            return;
        }
        display(temp.next);
        System.out.println(temp.data);
    }
}
public class stackUsingLinkedList {
    
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
        s.display(s.head);


    }
}