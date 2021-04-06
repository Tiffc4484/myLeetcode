public class solution86 {
    public ListNode partition(ListNode head, int x) {
        ListNode LEFT = new ListNode(0);
        ListNode left = LEFT;
        ListNode RIGHT = new ListNode(0);
        ListNode right = RIGHT;

        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        right.next = null;
        left.next = RIGHT.next;
        return LEFT.next;
    }
}
