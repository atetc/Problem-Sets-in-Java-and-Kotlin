package atetc.chap02;

import atetc.structures.LinkedList.Node;

/**
 * Implement an algorithm to find the nth to last element of a singly linked list.
 */
public class Q2 {

    //Returns nearest node if index out of bounds.
    public static Node<Integer> nthToLast(Node<Integer> head, int n) {
        if (head == null || n < 1) {
            return null;
        }

        Node<Integer> p1 = head, p2 = head;
        for (int i = 0; i < n - 1; ++i) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.next;
        }

        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }
}