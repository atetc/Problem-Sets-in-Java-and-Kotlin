package com.atetc.other.arrays;

/**
 *
 * From Akvelon set 32
 *
 * You a given an array of N integers.
 * Bitwise AND for continuous subarray [l, r] is a bitwise AND for all integers from range a[l] & ... & a[r].
 * Please write down all possible distinct values of this operation over all continuous subarrays of this array.
 *
 */

public class Q8 {

    static final int SIZE = Integer.SIZE;

    static final long[] POW = new long[SIZE];

    static {
        for(int i = 0; i < SIZE; i++){
            POW[i] = (long)Math.pow(2, i);
        }
    }

    public static int getAllVariants(int[] array) {
        int result = 0;

        int l = 0;
        int r = array.length - 1;

        int a = rangeBitwiseAnd(l, r);

        int b = array[l];
        for (int i = l + 1; i <= r; i++) {
            b = b & array[i];
        }

        if (a == b) {
            result++;
        }

        return result;
    }

    public static int rangeBitwiseAnd(int m, int n) {

        for (int i = SIZE; i > 0; i--){
            if ((POW[i - 1] <= m && m < POW[i])
                    && (POW[i - 1] <= n && n < POW[i])) {
                long p1 = POW[i - 1];
                return (int) p1 | rangeBitwiseAnd((int) (m & (p1 - 1)), (int) (n & (p1 - 1)));
            }
        }

        return 0;
    }
}