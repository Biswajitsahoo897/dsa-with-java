package linkedlist;

public class RemoveCycle {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    Node addFirst(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return head;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    void removeCycle() {

        // Step 1 : check for cycle
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (!flag)
            return;

        // Step 2: start from the head
        slow = head;

        // Special case: cycle starts at head  
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
        // break the loop

    }

    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        RemoveCycle ll = new RemoveCycle();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(5);
        ll.addFirst(9);
        ll.addFirst(8);
        ll.addFirst(4);
        // ll.printList();

        // create cycle manually
        Node temp = ll.head;

        // go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // connect last node to second node (cycle)
        temp.next = ll.head.next;

        ll.removeCycle();
        ll.printList();

    }
}
