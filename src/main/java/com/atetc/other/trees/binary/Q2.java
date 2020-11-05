package com.atetc.other.trees.binary;

import com.atetc.structures.BinaryTree;

/**
 * From Akvelon set 26
 *
 * Please build BST from sorted array of integers.
 */
public class Q2 {

    public static BinaryTree<Integer> getBSTFromSortedArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        return new BinaryTree<>(buildBST(arr, 0, arr.length - 1));
    }

    private static BinaryTree.Node<Integer> buildBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        BinaryTree.Node<Integer> node = new BinaryTree.Node<>(arr[mid]);
        node.left = buildBST(arr, start, mid - 1);
        node.right = buildBST(arr, mid + 1, end);

        return node;
    }
}