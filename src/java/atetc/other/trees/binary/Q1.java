package atetc.other.trees.binary;

import java.util.Arrays;
import java.util.Collections;

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

    public static int[][] printTreeFromSpiralArray(int[] arr, int n) {
        if (n == 0) {
            return null;
        }

        int[][] result = new int[n][];

        int level = 0;
        int counter = 0;
        while (level < n) {
            int levelLength = (int) Math.pow(2, level);
            int nextLevelLength = (int) Math.pow(2, n - level - 1);

            if (counter < arr.length) {
                result[level] = Arrays.copyOfRange(arr, counter, counter + levelLength);
            } else {
                int start = arr.length - (counter - arr.length) - levelLength;
                int end = arr.length - (counter - arr.length);
                result[level] = reverse(Arrays.copyOfRange(arr, start, end));
            }

            counter += levelLength + nextLevelLength;
            level++;
        }

        return result;
    }

    private static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }
}
