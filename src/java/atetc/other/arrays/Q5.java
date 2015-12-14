package atetc.other.arrays;

import java.util.Arrays;

/**
 * From Akvelon set 26
 *
 * We have two arrays of size m: X and Y.
 * Please assign to each X[i] a pair from Y : Y[a[i]], to make the sum X[1]Y[a[1]] + ... + X[m]Y[a[m]] as lowest as possible.
 * Here a[1]..a[m] is a permutation of size m.
 */
public class Q5 {

    public static int[] buildPairs(int[] x, int[] y) {
        if (x == null | y == null || x.length == 0 || y.length == 0) {
            return null;
        }

        if (x.length == 1) {
            return new int[]{0};
        }

        Pair[] xPairs = new Pair[x.length];
        Pair[] yPairs = new Pair[y.length];
        for (int i = 0; i < x.length; i++) {
            xPairs[i] = new Pair(i, x[i]);
            yPairs[i] = new Pair(i, y[i]);
        }
        Arrays.sort(xPairs);
        Arrays.sort(yPairs);

        int[] matches = new int[x.length];

        for (int i = 0; i < x.length; i++) {
            matches[xPairs[i].index] = yPairs[y.length - 1 - i].index;
        }

        return matches;
    }

    public static class Pair implements Comparable<Pair> {
        public int index;
        public int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.valueOf(this.value).compareTo(other.value);
        }
    }
}
