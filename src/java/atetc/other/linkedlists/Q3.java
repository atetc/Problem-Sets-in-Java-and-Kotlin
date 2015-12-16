package atetc.other.linkedlists;

import atetc.structures.SinglyLinkedList;
import atetc.structures.SinglyLinkedList.Node;

/**
 * From Akvelon set 3
 *
 * You are given a node that is the beginning of a linked list. This list always contains a tail and a loop.
 * Your objective is to determine the length of the loop.
 */
public class Q3 {

    public static int getLoopSize(SinglyLinkedList<Integer> list) {
        if (list == null || list.head == null || list.head.next == null) {
            return 0;
        }

        Node node = getAnyNodeFromLoop(list);
        int result = 1;

        Node runner = node.next;
        while (runner != node) {
            runner = runner.next;
            result++;
        }

        return result;
    }

    private static Node getAnyNodeFromLoop(SinglyLinkedList<Integer> list) {
        Node<Integer> fast = list.head;
        Node<Integer> slow = list.head;

        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        return slow;
    }
}