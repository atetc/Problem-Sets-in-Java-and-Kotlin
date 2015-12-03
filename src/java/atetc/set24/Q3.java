package atetc.set24;

import atetc.structures.SinglyLinkedList.Node;

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
public class Q3 {

    public static Node<Integer> removeHead(Node<Integer> head) {
        Node<Integer> next = head.getNext();
        head.setNext(null);
        return next;
    }
}