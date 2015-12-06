package atetc.chap02;

import wzhishen.helpers.LinkedListNode;

/**
 * Given a circular linked list, implement an algorithm which returns
 * the node at the beginning of the loop.
 */
public class Q5 {

    public static LinkedListNode findBeginning(LinkedListNode head) {

        LinkedListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}