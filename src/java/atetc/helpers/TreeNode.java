package atetc.helpers;

import static atetc.helpers.Printer.*;

public class TreeNode {

    public int value;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent; /* only used for certain cases */

    public TreeNode(int x) {
        value = x;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        String leftValue = (left == null) ? "*" : String.valueOf(left.value);
        String rightValue = (right == null) ? "*" : String.valueOf(right.value);
        return leftValue + " / "+ String.valueOf(value) + " \\ " + rightValue;
    }

    public static void printTree(TreeNode n) {
        if (n == null) return;
        println(n.value);
        printTree(n.left, 0, true);
        printTree(n.right, 0, false);
    }

    private static void printTree(TreeNode n, int level, boolean isLeft) {
        if (n == null) return;
        for (int i = 0; i < level; ++i) print("  ");
        if (isLeft)
            println("/- " + n.value);
        else
            println("\\- " + n.value);
        printTree(n.left, level + 1, true);
        printTree(n.right, level + 1, false);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (obj.getClass() != getClass()) {
            return false;
        }

        TreeNode node1 = this;
        TreeNode node2 = (TreeNode) obj;

        if (node1.value != node2.value) {
            return false;
        }

        TreeNode leftNode1 = node1.left;
        TreeNode leftNode2 = node2.left;
        TreeNode rightNode1 = node1.right;
        TreeNode rightNode2 = node2.right;

        if (leftNode1 == null) {
            return leftNode2 == null && isEqual(rightNode1, rightNode2);
        } else {
            return leftNode1.equals(leftNode2) && isEqual(rightNode1, rightNode2);
        }
    }

    private boolean isEqual(TreeNode rightNode1, TreeNode rightNode2) {
        if (rightNode1 == null) {
            return rightNode2 == null;
        } else {
            return rightNode1.equals(rightNode2);
        }
    }
}
