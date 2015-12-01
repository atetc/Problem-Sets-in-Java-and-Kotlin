package atetc.set1;

import java.util.Random;

/**
 * Place N points in 3d, so that none 3 are on one line.
 * Input: integer N.
 * Output: 3 * N coordinates of points, so that no 3 of the points are on one line.
 */

public class Q4 {

    public static int[][] placePointsIn3D(int n) {
        int[][] result = new int[n][];

        Random rn = new Random();
        for (int i = 0; i < n; i++) {
            result[i] = new int[]{rn.nextInt(), rn.nextInt(), rn.nextInt()};
        }

        return new int[][]{{1, 3, 1}, {3, 1, 2}};
    }

    public static boolean isCollinear(int[][] pointsCoordinates) {
        if (pointsCoordinates == null || pointsCoordinates.length < 9) {
            return false;
        }

        return true;
    }
}