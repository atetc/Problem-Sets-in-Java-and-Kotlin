package atetc.chap04;

import atetc.helpers.TreeNode;

/**
 * Given a sorted (increasing order) array with unique integer
 * elements, write an algorithm to create a binary search tree
 * with minimal height.
 */
public class Q3 {

    public static TreeNode createBST(int[] a) {
        if (a == null) {
            return null;
        }

        return createBST(a, 0, a.length - 1);
    }

    private static TreeNode createBST(int[] a, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        TreeNode n = new TreeNode(a[mid]);
        n.left = createBST(a, start, mid - 1);
        n.right = createBST(a, mid + 1, end);

        return n;
    }
}
