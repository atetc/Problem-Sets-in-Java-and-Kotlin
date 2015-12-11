package atetc.chap04;

import atetc.helpers.BinaryTreeNode;

/**
 * Implement a function to check if a binary tree is balanced.
 * For the purposes of this question, a balanced tree is defined
 * to be a tree such that the heights of the two subtrees of any
 * node never differ by more than one.
 */
public class Q1 {

    public static boolean isBalanced(BinaryTreeNode n) {
        if (n == null) {
            return true;
        }

        return Math.abs(getHeight(n.left) - getHeight(n.right)) <= 1 &&
               isBalanced(n.left) &&
               isBalanced(n.right);
    }

    public static boolean isBalanced2(BinaryTreeNode n) {
        if (n == null) return true;
        if (Math.abs(getHeight(n.left) - getHeight(n.right)) > 1) {
            return false;
        }

        if (!isBalanced(n.left) || !isBalanced(n.right)) {
            return false;
        }

        return true;
    }

    public static boolean isBalanced3(BinaryTreeNode n) {
        return getHeightBalanced(n) != -1;
    }

    private static int getHeight(BinaryTreeNode n) {
        if (n == null) {
            return 0;
        }

        return 1 + Math.max(getHeight(n.left), getHeight(n.right));
    }

    private static int getHeightBalanced(BinaryTreeNode n) {
        if (n == null) return 0;
        int leftHeight = getHeightBalanced(n.left);
        int rightHeight = getHeightBalanced(n.right);
        if (leftHeight == -1 || rightHeight == -1) return -1;
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
