package atetc.other.linkedlists;

import atetc.structures.LinkedList.Node;

/**
 * Microsoft interview.
 *
 * Find and fix the bugs in the following function that is supposed to remove the head element from a singly linked list.
 *
 * void RemoveHead (node * head)
 * {
 * free(head);
 * head = head - > next;
 * }
 *
 */
public class Q1 {

    public static Node removeHead(Node head) {
        Node next = head.next;
        head.next = null;
        return next;
    }
}