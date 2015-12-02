package atetc.set2;

import atetc.structures.Tree;

/**
 * You've got a tree (structure can be random).
 * For two given nodes you should answer if the first of them is the ancestor of the second.
 */
public class Q3 {

    public static boolean isAncestor(Tree.Node<Integer> node1, Tree.Node<Integer> node2) {
        if (node1 == null || node2 == null | node1.equals(node2)) {
            return false;
        }

        Tree.Node<Integer> node = node2;
        while (node.getParent() != null) {
            if (node.equals(node1)) {
                return true;
            }

            node = node.getParent();
        }

        return false;
    }
}