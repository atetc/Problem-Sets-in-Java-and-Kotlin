package atetc.other.trees.binary;

import atetc.structures.BinaryTree;
import atetc.structures.BinaryTree.Node;

import java.util.*;

/**
 * From Akvelon set 26
 *
 * Given a binary tree. Print it in inward spiral order i.e first print level 1, then level n, then level 2, then n-1 and so on.
 * For Ex:
 * 1
 * 2 3
 * 4 5 6 7
 * 8 9 10 11 12 13 14 15
 *
 * Print- 1 15 14 13 12 11 10 9 8 2 3 7 6 5 4
 *
 * Extend the algorithm to n-ary tree.
 */
public class Q1 {

    public static List<Integer> buildInwardSpiralArray(BinaryTree<Integer> tree) {
        if (tree == null || tree.root == null) {
            return null;
        }

        List<LinkedList<Integer>> array = new ArrayList<>();

        Queue<Node<Integer>> currentLevel = new LinkedList<>();
        Queue<Node<Integer>> nextLevel = new LinkedList<>();

        currentLevel.add(tree.root);

        while (!currentLevel.isEmpty()) {
            LinkedList<Integer> level = new LinkedList<>();
            for (Node<Integer> node : currentLevel) {
                if (node.left != null) {
                    nextLevel.add(node.left);
                }

                if (node.right != null) {
                    nextLevel.add(node.right);
                }
                level.add(node.data);
            }

            array.add(level);

            currentLevel = nextLevel;
            nextLevel = new LinkedList<>();
        }

        List<Integer> result = new ArrayList<>();
        result.add(tree.root.data);

        if (array.size() == 1) {
            return result;
        }

        int start = 1;
        int end = array.size() - 1;
        while (start < end) {
            result.addAll(array.get(start));
            Collections.reverse(array.get(end));
            result.addAll(array.get(end));
            end--;
            start++;
        }

        return result;
    }
}
