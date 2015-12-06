package atetc.chap04;

import atetc.helpers.TreeNode;

/**
 * You have two very large binary trees: Tl, with millions of
 * nodes, and T2, with hundreds of nodes. Create an algorithm
 * to decide if T2 is a subtree of Tl. A tree T2 is a subtree
 * of Tl if there exists a node n in Tl such that the subtree
 * of n is identical to T2. That is, if you cut off the tree
 * at node n, the two trees would be identical.
 */
public class Q7 {

    public static boolean isSubtree(TreeNode t1, TreeNode t2) {
        if (t2 == null) {
            return true;
        }

        if (t1 == null) {
            return false;
        }

        if (isEqual(t1, t2)) {
            return true;
        }

        return isSubtree(t1.left, t2) || isSubtree(t1.right, t2);
    }

    private static boolean isEqual(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }

        if (n1 == null || n2 == null) {
            return false;
        }

        if (n1.value != n2.value) {
            return false;
        }

        return isEqual(n1.left, n2.left) && isEqual(n1.right, n2.right);
    }
}