import java.util.List;

public class solution708 {
    public ListNode insert(ListNode head, int insertVal) {
        if(head == null) {
            ListNode newHead = new ListNode(insertVal, null);
            newHead.next = newHead;
            return newHead;
        }
        ListNode cur = head;
        while(cur.val <= cur.next.val && cur.next != head) {
            cur = cur.next;
        }
        ListNode max = cur;
        ListNode dummy = new ListNode(0, max.next);
        max.next = null;
        cur = dummy;
        while(cur.next != null && cur.next.val < insertVal) {
            cur = cur.next;
        }
        cur.next = new ListNode(insertVal, cur.next);
        ListNode newMax = max.next == null ? max : max.next;
        newMax.next = dummy.next;
        return head;
    }
}
