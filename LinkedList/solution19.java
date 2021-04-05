public class solution19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode front = head;

        int i = 0;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        if (i == 1) {
            return null;
        }
        if (i == n) {
            head = head.next;
        }
        int j = 1;
        while (j < i - n) {
            front = front.next;
            j++;
        }
        front.next = front.next.next;
        return head;

    }
}
