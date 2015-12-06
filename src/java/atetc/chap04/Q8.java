package atetc.chap04;

import wzhishen.helpers.TreeNode;

import java.util.LinkedList;

/**
 * You are given a binary tree in which each node contains a
 * value. Design an algorithm to print all paths which sum up to
 * that value. Note that it can be any path in tree - it does not have to start at the root
 */
public class Q8 {

    public static LinkedList<LinkedList<TreeNode>> findSumPaths(TreeNode root, int target) {
        LinkedList<LinkedList<TreeNode>> result = new LinkedList<>();
        LinkedList<TreeNode> path = new LinkedList<>();
        findSumPaths(root, target, path, result);
        return result;
    }

    @SuppressWarnings("unchecked")
    private static void findSumPaths(TreeNode n, int target, LinkedList<TreeNode> path, LinkedList<LinkedList<TreeNode>> result) {
        if (n == null) {
            return;
        }

        path.add(n);

        int sum = 0;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        for (int i = path.size() - 1; i >= 0; --i) {
            TreeNode node = path.get(i);
            nodes.add(node);
            sum += node.value;
            if (sum == target) {
                result.add((LinkedList<TreeNode>) nodes.clone());
            }
        }

        findSumPaths(n.left,  target, path, result);
        findSumPaths(n.right, target, path, result);

        // "Pop" recursion stack top.
        // Alternatively, clone path when passing it in recursive
        // calls, or use native array to hold path.
        path.removeLast();
    }
}
