import java.util.*;
public class solution445 {
    public class ListNode{
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        ListNode p = l1;
        ListNode q = l2;
        ListNode sum = null;

        while (p != null) {
            s1.push(p.val);
            p = p.next;
        }
        while (q != null) {
            s2.push(q.val);
            q = q.next;
        }
        int add;
        int carry = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int x = 0;
            int y = 0;
            if (!s1.isEmpty()) {
                x = s1.pop();
            }
            if (!s2.isEmpty()) {
                y = s2.pop();
            }
            add = x + y + carry;
            sum = new ListNode(add % 10, sum);
            carry = add / 10;
        }
        if (carry != 0) {
            sum = new ListNode(carry, sum);
        }
        return sum;
    }

}
