public class solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newTail = head;
        ListNode temp = head;
        int size = 1;
        while(temp.next != null) {
            size ++;
            temp = temp.next;
        }
        for(int j = 1; j <size - k%size; j ++ ) {
            newTail = newTail.next;
        }
        temp.next = head;
        head = newTail.next;
        newTail.next = null;
        return head;
    }
}
