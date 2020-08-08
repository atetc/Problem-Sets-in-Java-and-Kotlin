package com.atetc.chap01;

/**
 * Given an image represented by an NxN matrix, where each pixel in
 * the image is 4 bytes, write a method to rotate the image by 90
 * degrees. Can you do this in place?
 */
public class Q6 {

    // With extra space.
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ret = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ret[i][j] = matrix[n-1-j][i];
            }
        }
        return ret;
    }

    // In place.
    // Relation matrix[i][j] = matrix[n-1-j][i] holds.
    public static void rotateInPlace(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n/2; ++i) {
            for (int j = i; j < n-1-i; ++j) {
                // save top
                int tmp = matrix[i][j];
                // left to top
                matrix[i][j] = matrix[n-1-j][i];
                // bottom to left
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                // right to bottom
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                // top to right
                matrix[j][n-1-i] = tmp;
            }
        }
    }
}
