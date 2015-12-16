package atetc.chap02;

import atetc.structures.LinkedList.Node;

/**
 * Implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node.
 *
 */
public class Q3 {

    public static boolean deleteNode(Node n) {
        //XXX: fail if the node is the last element.
        if (n == null || n.next == null) {
            return false;
        }

        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }
}
