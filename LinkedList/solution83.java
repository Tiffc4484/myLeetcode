
public class solution83 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }
    public ListNode deleteDuplicates(ListNode head){
        if (head == null) {
            return head;
        }
        ListNode dummy = head;
        while (dummy.next != null) {
            if (dummy.val != dummy.next.val) {
                dummy = dummy.next;
            } else {
                if (dummy.next.next != null) {
                    dummy.next = dummy.next.next;
                } else {
                    dummy.next = null;
                }
            }
        }
        return head;
    }
}
