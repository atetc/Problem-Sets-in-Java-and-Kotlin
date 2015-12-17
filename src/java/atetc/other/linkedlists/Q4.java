package atetc.other.linkedlists;

import atetc.structures.LinkedList;
import atetc.structures.LinkedList.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * From Akvelon set 4
 *
 * Given two singly linked lists, that might intersect, print out the element, at which they intersect and its index.
 */
public class Q4 {

    public static int getIntersectionIndex(LinkedList list1, LinkedList list2) {
        int result = -1;
        if (list1 == null | list2 == null) {
            return result;
        }

        List<Node> list = new ArrayList<>();
        Node node = list1.head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }

        node = list2.head;
        while (node != null) {
            if (list.contains(node)) {
                result = list.indexOf(node);
                break;
            }
            node = node.next;
        }

        return result;
    }
}