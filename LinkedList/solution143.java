public class solution143 {
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

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        //head of first half
        ListNode l1 = head;
        //head of second half
        ListNode slow = head;
        //tail of second half
        ListNode fast = head;
        //tail of first half
        ListNode prev = null;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            prev = slow;

            fast = fast.next.next;
        }
        slow = slow.next;
        prev.next = null;
        ListNode l2 = reverse(slow);

        merge(l1,l2);
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }

    public void merge(ListNode l1, ListNode l2) {
        while (l2 != null) {
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;
            l1.next = l2;

            l2.next = l1Next;
            l1 = l1Next;
            l2 = l2Next;
        }
    }
}
