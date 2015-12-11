package atetc.other.trees.binary;

import atetc.structures.BinaryTree;

/**
 * From Akvelon set 26
 *
 * Given a binary tree print it in inward spiral order i.e first print level 1, then level n, then level 2, then n-1 and so on.
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

    public static BinaryTree getBinaryTreeFromInwardSpiralArray(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        if (array.length == 1) {
            return new BinaryTree<>(array[0]);
        }

        for (int i : array) {

        }

        return null;
    }
}
