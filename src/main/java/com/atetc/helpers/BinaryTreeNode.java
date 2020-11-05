package com.atetc.helpers;

public class BinaryTreeNode {

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    public BinaryTreeNode parent; /* only used for certain cases */

    public BinaryTreeNode(int x) {
        value = x;
    }

    public BinaryTreeNode(int value, BinaryTreeNode left, BinaryTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        String leftValue = (left == null) ? "*" : String.valueOf(left.value);
        String rightValue = (right == null) ? "*" : String.valueOf(right.value);
        return leftValue + " / "+ String.valueOf(value) + " \\ " + rightValue;
    }

    public static void printTree(BinaryTreeNode n) {
        if (n == null) return;
        Printer.println(n.value);
        printTree(n.left, 0, true);
        printTree(n.right, 0, false);
    }

    private static void printTree(BinaryTreeNode n, int level, boolean isLeft) {
        if (n == null) return;
        for (int i = 0; i < level; ++i) Printer.print("  ");
        if (isLeft)
            Printer.println("/- " + n.value);
        else
            Printer.println("\\- " + n.value);
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

        BinaryTreeNode node1 = this;
        BinaryTreeNode node2 = (BinaryTreeNode) obj;

        if (node1.value != node2.value) {
            return false;
        }

        BinaryTreeNode leftNode1 = node1.left;
        BinaryTreeNode leftNode2 = node2.left;
        BinaryTreeNode rightNode1 = node1.right;
        BinaryTreeNode rightNode2 = node2.right;

        if (leftNode1 == null) {
            return leftNode2 == null && isEqual(rightNode1, rightNode2);
        } else {
            return leftNode1.equals(leftNode2) && isEqual(rightNode1, rightNode2);
        }
    }

    private boolean isEqual(BinaryTreeNode rightNode1, BinaryTreeNode rightNode2) {
        if (rightNode1 == null) {
            return rightNode2 == null;
        } else {
            return rightNode1.equals(rightNode2);
        }
    }
}
