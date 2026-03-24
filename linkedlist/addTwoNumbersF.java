package linkedlist;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class addTwoNumbersF {
    // public ListNode reverse(ListNode head){
    // if(head==null || head.next==null){
    // return head;
    // }
    // ListNode rest=reverse(head.next);
    // head.next.next=head;

    // head.next=null;
    // return rest;
    // }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode n1=reverse(l1);
        // ListNode n2=reverse(l2);
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        int carry = 0;

        while (n1 != null || n2 != null || carry != 0) {
            int sum = carry;

            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;

            curr = curr.next;

        }
        return temp.next;
    }
}