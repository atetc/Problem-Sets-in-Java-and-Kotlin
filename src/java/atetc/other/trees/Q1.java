package atetc.other.trees;

import atetc.structures.Tree;

/**
 * From Set 2 Akvelon
 *
 * You've got a tree (structure can be random).
 * For two given nodes you should answer if the first of them is the ancestor of the second.
 */
public class Q1 {

    public static boolean isAncestor(Tree.Node<Integer> node1, Tree.Node<Integer> node2) {
        if (node1 == null || node2 == null) {
            return false;
        }

        if (node1.equals(node2)) {
            return false;
        }

        if (node1.getChildren().isEmpty()) {
            return false;
        }

        for (Tree.Node<Integer> node : node1.getChildren()) {
            if (node.equals(node2)) {
                return true;
            }

            if (isAncestor(node, node2)) {
                return true;
            }
        }

        return false;
    }
}