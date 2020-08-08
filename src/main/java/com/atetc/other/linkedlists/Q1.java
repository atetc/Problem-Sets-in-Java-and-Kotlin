package com.atetc.other.linkedlists;

import com.atetc.structures.LinkedList;

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

    public static LinkedList.Node removeHead(LinkedList.Node head) {
        LinkedList.Node next = head.next;
        head.next = null;
        return next;
    }
}