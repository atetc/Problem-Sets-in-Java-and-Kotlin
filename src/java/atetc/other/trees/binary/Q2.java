package atetc.other.trees.binary;

import atetc.structures.BinaryTree;

/**
 * From Akvelon set 26
 *
 * Please build BST from sorted array of integers.
 */
public class Q2 {


    public static BinaryTree getBSTFromSortedArray(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        if (array.length == 1) {
            return new BinaryTree<>(array[0]);
        }

        return null;
    }
}