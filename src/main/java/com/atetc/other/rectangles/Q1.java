package com.atetc.other.rectangles;

/**
 * Created by Atetc on 06.12.2015.
 */
public class Q1 {

    public static int getSumOfTwoRectanglesArea(int K, int L, int M, int N, int P, int Q, int R, int S) {
        int result = 0;

        int area1 = (M - K) * (N - L);
        int area2 = (R - P) * (S - Q);
        int sum;

        if (area2 > 0 ? area1 > Integer.MAX_VALUE - area2
                : area1 < Integer.MIN_VALUE - area2) {
            return -1;
        }

        sum = area1 + area2;

        result = sum - getAreaOfIntersection(K, L, M, N, P, Q, R, S);

        return result;
    }

    private static int getAreaOfIntersection(int k, int l, int m, int n, int p, int q, int r, int s) {
        int result = 0;

        int newX = Math.max(k, p);
        int newY = Math.max(l, q);

        int newWidth = Math.min(k + (m - k), p + (r - p)) - newX;
        int newHeight = Math.min(l + (n - l), q + (s - q)) - newY;

        if (!(newWidth <= 0 || newHeight <= 0)) {
            return (newWidth * newHeight);
        }

        return result;
    }
}
