public class solution138 {
    public ListNode copyRandomList(ListNode head) {
        if(head == null) {
            return head;
        }

        Node temp = head;
        Node next = head;

        while(temp != null) {
            next = temp.next;

            Node copy = new Node(temp.val);
            temp.next = copy;
            copy.next = next;

            temp = next;
        }

        temp = head;
        while(temp != null) {
            if(temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        temp = head;
        Node newHead = head.next;
        Node newCopy = newHead;
        while(temp != null) {
            next = temp.next.next;
            newCopy = temp.next;
            temp.next = next;

            if(next != null) {
                newCopy.next = next.next;
            }
            temp = next;
        }

        return newHead;
    }
}
