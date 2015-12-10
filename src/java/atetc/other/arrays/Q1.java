package atetc.other.arrays;

/**
 *
 * You are given an array of integers of size N. Can you find the sum of the elements in the array?
 */
public class Q1 {

    public static int getArraySum(int n, int[] a) {
        int result = 0;

        if (a == null || n == 0) {
            return result;
        }

        for (int i = 0; i < n; i++) {
            result = safeAdd(result, a[i]);
        }

        return result;
    }

    private static int safeAdd(int left, int right) throws ArithmeticException {
        if (right > 0 ? left > Integer.MAX_VALUE - right
                : left < Integer.MIN_VALUE - right) {
            throw new ArithmeticException("Integer overflow");
        }
        return left + right;
    }
}