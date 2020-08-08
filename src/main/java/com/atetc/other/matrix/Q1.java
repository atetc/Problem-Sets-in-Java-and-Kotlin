package com.atetc.other.matrix;

/**
 * You are given an array of integers of size N. Can you find the sum of the elements in the array?
 */
public class Q1 {

    public static int getAbsoluteDiagonalDifference(int n, int[][] a) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i][i] - a[i][(n - 1) - i];
        }

        return Math.abs(result);
    }
}