package org.blt.addtwonumbers;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(), currentNode = headNode;
        int divider = 0;
        while ((l1 != null || l2 != null)) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + divider;
            int remainder = sum % 10;

            divider = sum / 10;
            currentNode.next = new ListNode(remainder);
            currentNode = currentNode.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (divider != 0) {
            currentNode.next = new ListNode(divider);
        }
        return headNode.next;
    }
}
