package Day9;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveKthNode {

    public static ListNode removeNth(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        
        for (int i = 0; i <= n; i++) {
            if (first == null)
                return head;      // Invalid n
            first = first.next;
        }

        
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        
        second.next = second.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = removeNth(head, 2);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}