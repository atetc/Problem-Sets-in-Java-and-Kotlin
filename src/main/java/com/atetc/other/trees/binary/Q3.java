package com.atetc.other.trees.binary;

import com.atetc.structures.BinaryTree;

/**
 *
 * From Akvelon set 3
 *
 * Given a tree you should determine whether or not the tree is binary search tree.
 */
public class Q3 {

    public static boolean isBST(BinaryTree<Integer> tree) {
        if (tree == null || tree.root == null) {
            return false;
        }

        return isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isBST(BinaryTree.Node<Integer> node, int min, int max) {
        boolean result = (min < node.data) && (node.data < max);

        if (node.left != null) {
            result &= isBST(node.left, min, node.data);
        }

        if (node.right != null) {
            result &= isBST(node.right, node.data, max);
        }

        return result;
    }
}