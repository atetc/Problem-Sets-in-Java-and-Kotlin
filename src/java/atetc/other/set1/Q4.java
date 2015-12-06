package atetc.other.set1;

import java.util.Random;

/**
 * Place N points in 3d, so that none 3 are on one line.
 * Input: integer N.
 * Output: 3 * N coordinates of points, so that no 3 of the points are on one line.
 */

public class Q4 {

    public static int[][] placePointsIn3D(int n) {
        int[][] result = new int[n][3];

        Random rn = new Random();
        for (int i = 0; i < n; i++) {
            boolean isCollinear = true;
            while (isCollinear) {
                for (int j = 0; j < 3; j++) {
                    result[i][j] = rn.nextInt(10);
                }

                isCollinear = isCollinearIn2D(result, i + 1);
            }
        }

        return result;
    }

    public static boolean isCollinearIn2D(int[][] points, int count) {
        if (points == null | count < 3) {
            return false;
        }

        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    if (isCollinearIn2D(points[i], points[j], points[k])) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean isCollinearIn2D(int[] a, int[] b, int[] c) {
        if (a[0] == b[0]) {
            return c[0] == a[0];
        }

        if (b[0] == c[0] || (c[0] == a[0])) {
            return false;
        }

        return ((b[1] - a[1]) / (b[0] - a[0]) == (c[1] - b[1]) / (c[0] - b[0])) ;
    }
}