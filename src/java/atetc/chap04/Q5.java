package atetc.chap04;

import wzhishen.helpers.TreeNode;

/**
 * Write an algorithm to find the 'next' node (i.e., in-order successor)
 * of a given node in a binary search tree. You may assume that each node
 * has a link to its parent.
 */

public class Q5 {

    public static TreeNode inorderSuccessor(TreeNode n) {
        if (n == null) {
            return null;
        }

        // case 1: n has right subtree ->
        //         return leftmost node of right subtree
        if (n.right != null) {
            return leftmostChild(n.right);
        }

        // case 2:   n has no right subtree
        // case 2.1: n is left child of its parent ->
        //           just return its parent
        // case 2.2: n is right child of its parent ->
        //           n goes up until n is left child of its parent,
        //           then return this parent
        // case 3:   n is the last node in traversal ->
        //           return root's parent, ie., null
        while (n.parent != null && n.parent.right == n) {
            n = n.parent;
        }

        return n.parent;
    }

    private static TreeNode leftmostChild(TreeNode n) {
        if (n.left == null) {
            return n;
        } else {
            return leftmostChild(n.left);
        }
    }

    public static TreeNode preorderSuccessor(TreeNode n) {
        if (n == null) return null;

        // case 1: n has a child ->
        //         just return that child (left if exists, otherwise right)
        if (n.left != null) return n.left;
        else if (n.right != null) return n.right;
        // case 2: n has no child ->
        //         n climbs up until reaching a parent that has a right child
        //         (which is not n), then return this right child
        while (n.parent != null && (n.parent.right == null || n.parent.right == n)) {
            n = n.parent;
        }
        // case 3: n is the last node in traversal ->
        //         return root's parent, ie., null
        if (n.parent == null) return null;
        return n.parent.right;
    }

    public static TreeNode postorderSuccessor(TreeNode n) {
        // case 1: n is the last node in traversal ->
        //         return root's parent, ie., null
        if (n == null || n.parent == null) return null;
        // case 2:   n is left child of its parent ->
        //           just return parent
        // case 3:   n is right child of its parent
        // case 3.1: parent has no right child ->
        //           just return parent
        if (n.parent.right == n || n.parent.right == null) return n.parent;
        // case 3.2: parent has right child ->
        //           return leftmost bottom node of parent's right subtree
        return leftmostBottomChild(n.parent.right);
    }

    private static TreeNode leftmostBottomChild(TreeNode n) {
        if (n.left == null && n.right == null) return n;
        if (n.left != null) {
            return leftmostBottomChild(n.left);
        } else {
            return leftmostBottomChild(n.right);
        }
    }

    //TEST----------------------------------
    public static void main(String[] args) {

    }
}
