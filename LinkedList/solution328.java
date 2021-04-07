public class solution328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode EvenHead = head.next;
        ListNode even = EvenHead;
        ListNode odd = head;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = EvenHead;
        return head;
    }
}
