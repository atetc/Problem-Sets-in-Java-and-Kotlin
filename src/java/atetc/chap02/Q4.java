package atetc.chap02;

import atetc.helpers.LinkedListNode;

/**
 * You have two numbers represented by a linked list, where each node contains a
 * single digit. The digits are stored in reverse order, such that the 1 's digit
 * is at the head of the list. Write a function that adds the two numbers and
 * returns the sum as a linked list.
 */
public class Q4 {

    public static LinkedListNode addLists(LinkedListNode n1, LinkedListNode n2) {
        if (n1 == null && n2 == null) {
            return null;
        }

        LinkedListNode n = new LinkedListNode(-1);
        LinkedListNode head = n;
        int carry = 0;
        while (n1 != null || n2 != null || carry != 0) {
            int sum = 0;
            if (n1 != null) {
                sum += n1.data;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.data;
                n2 = n2.next;
            }
            if (carry != 0) {
                sum += carry;
            }
            int digit = sum % 10;
            carry = sum / 10;
            n.next = new LinkedListNode(digit);
            n = n.next;
        }
        return head.next;
    }


    // recursively
    public static LinkedListNode addLists2(LinkedListNode n1, LinkedListNode n2, int carry) {
        if (n1 == null && n2 == null) {
            return null;
        }

        LinkedListNode result = new LinkedListNode(carry, null, null);
        int value = carry;
        if (n1 != null) {
            value += n1.data;
        }

        if (n2 != null) {
            value += n2.data;
        }

        result.data = value % 10;

        LinkedListNode more = addLists2(n1 == null ? null : n1.next,
                n2 == null ? null : n2.next,
                value > 9 ? 1 : 0);

        result.next = more;

        return result;
    }
}