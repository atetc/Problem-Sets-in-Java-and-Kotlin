package atetc.chap04;

import atetc.helpers.TreeNode;

/**
 * Design an algorithm and write code to find the first common
 * ancestor of two nodes in a binary tree. Avoid storing additional
 * nodes in a data structure. NOTE: This is not necessarily a binary
 * search tree.
 */
public class Q6 {

    public static TreeNode findFirstCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        if (root == null) {
            return null;
        }

        if (root == n1 && contains(root, n2)
                || root == n2 && contains(root, n1)) {
            return root;
        }

        boolean n1OnLeft = contains(root.left, n1);
        boolean n2OnLeft = contains(root.left, n2);

        if (n1OnLeft != n2OnLeft) {
            return root;
        }

        if (n1OnLeft) {
            return findFirstCommonAncestor(root.left, n1, n2);
        } else {
            return findFirstCommonAncestor(root.right, n1, n2);
        }
    }

    private static boolean contains(TreeNode root, TreeNode n) {
        if (root == null) {
            return false;
        }

        if (root == n) {
            return true;
        }

        return contains(root.left, n) || contains(root.right, n);
    }
}
