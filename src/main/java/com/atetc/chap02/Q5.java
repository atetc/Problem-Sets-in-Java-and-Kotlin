package com.atetc.chap02;

import com.atetc.structures.LinkedList;

/**
 * Given a circular linked list, implement an algorithm which returns
 * the node at the beginning of the loop.
 */
public class Q5 {

    public static LinkedList.Node<Integer> findBeginning(LinkedList.Node<Integer> head) {

        LinkedList.Node<Integer> fast = head, slow = head;

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