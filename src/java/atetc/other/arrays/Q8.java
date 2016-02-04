package atetc.other.arrays;

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


    public static int getAllVariants(int[] array) {
        int result = 0;

        int l = 0;
        int r = array.length - 1;

        int and = array[l];
        for (int i = l + 1; i <= r; i++) {
            and = and & array[i];
        }

        result = and;

        return result;
    }
}