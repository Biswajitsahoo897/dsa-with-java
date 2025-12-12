package linkedlist;

public class doublyLinkedList {
    class Node {
        Node prev;
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    // Constructor
    public doublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // Append
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void prepend(int value) {

        if (length == 0) {
            append(value);
            return;
        } else {
            Node newNode = new Node(value);
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // remove last node
    public Node removeLast() {
        Node temp = tail;
        if (length == 0)
            return null;
        if (length == 1) {
            head = null;
            tail = null;
            length--;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
            length--;

        }
        return temp;
    }

    public Node removeFirst() {
        Node temp = head;
        if (length == 0)
            return null;
        if (length == 1) {
            return removeLast(); // as this is the first-cum-last Node
        } else {
            head = head.next;
            temp.next = null;

        }
        length--;
        return temp;
    }

    public Node remove(int index){
        if(length<0||index>=length) return null;
        if(length==0) return removeFirst();
        if(length-1==index) return removeLast();
        Node temp=get(index);
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.next=null;
        temp.prev=null;
        length--;
        return temp;
    }   
    
    public Node get(int index) {
        Node temp = head;
        if (index < 0 || index >= length)
            return null;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = head;
        if (index < 0 || index >= length)
            return false;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.value = value;
            return true;
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
            temp.value = value;
            return true;
        }
    }

    public boolean insert(int index, int value) {
        if (index > length || index < 0)
            return false;
        if (length == 0) {
            prepend(value);
            return true;
        }
        if (length == index) {
            append(value);
            return true;
        }
        Node newNode=new Node(value);
        Node before = get(index-1);
        Node after=before.next;
        before.next=newNode;
        newNode.prev=before;
        newNode.next=after;
        after.prev=newNode;
        length++;
        return true;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void getHead() {
        System.out.println("head :" + head.value);
    }

    public void getTail() {
        System.out.println("tail :" + tail.value);
    }

    public void getLength() {
        System.out.println("length :" + length);
    }

    public static void main(String[] args) {
        doublyLinkedList myDLL = new doublyLinkedList(8);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        System.out.println("After insertion ---- ");
        myDLL.append(4);
        myDLL.append(67);
        myDLL.append(89);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.printList();

        // System.out.println("Removing the last node : "+myDLL.removeLast().value);
        // myDLL.printList();
        // myDLL.getLength();

        // System.out.println("Prepending the node : ");
        // myDLL.prepend(10);
        // myDLL.printList();
        // myDLL.getLength();

        // System.out.println("Removing the first node :"+myDLL.removeFirst().value);
        // myDLL.printList();
        // myDLL.getLength();

        System.out.println("Get the node from index 2 :" + myDLL.get(2).value);
        System.out.println("Set the value at index 2 to 48 :");
        myDLL.set(1, 48);
        myDLL.printList();

        System.out.println("Inserting element at the index 3");
        myDLL.insert(3, 20);
        myDLL.printList();
        
        System.out.println("Removing element at the index 3");
        myDLL.remove(3);
        myDLL.printList();
    }
}
