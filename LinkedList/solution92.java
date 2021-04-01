public class solution92 {
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode cur = head;
        int i = 1;
        while (i < left) {
            prev = cur;
            cur = cur.next;
            i++;
        }

        ListNode con = prev;
        ListNode tail = cur;
        while (i < right + 1) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            i++;
        }
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
    }

}
