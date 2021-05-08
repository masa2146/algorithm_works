package org.blt.addtwonumbers;

import lombok.ToString;

@ToString
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode createListNode(int[] val) {
        ListNode finalNode = new ListNode(val[0]), currentNode = finalNode;
        for (int i = 1; i < val.length; i++) {
            currentNode.next = new ListNode(val[i]);
            currentNode = currentNode.next;
        }
        return finalNode;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
