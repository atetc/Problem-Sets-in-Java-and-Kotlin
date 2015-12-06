package atetc.other.matrix;

/**
 * Given a square matrix of size N×N, calculate the absolute difference between the sums of its diagonals.
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