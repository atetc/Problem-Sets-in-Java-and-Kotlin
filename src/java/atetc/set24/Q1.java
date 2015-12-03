package atetc.set24;

/**
 * Given the number N with up to 10^6 digits and M.
 * Find the number of partitions where each partition is divisible by M.
 * If answer is larger then (10^9+7), find the answer modulo (10^9+7)
 * Example: for input N=12123, M=3 partitions are: [12123], [12][123],[12][12][3],[1212][3]
 */

public class Q1 {

    public static int getNumberOfDivisiblePartitions(int n, int m) {
        int result = 0;

        if (n == 0 || m == 0) {
            return result;
        }

        return getDivisiblePartsCount(n, m, result);
    }

    private static int getDivisiblePartsCount(int n, int m, int result) {
        int length = (int) (Math.log10(n) + 1);
        if (length == 1) {
            if (n % m == 0) {
                result++;
                return result;
            } else {
                return result;
            }
        }

        if (n % m == 0) {
            result++;
        }

        for (int pos = 1; pos < length; pos++) {
            int leftSide = (int) (n / Math.pow(10, length - pos));
            int rightSide = (int) (n % Math.pow(10, length - pos));

            if (leftSide % m == 0) {
                result = getDivisiblePartsCount(rightSide, m, result);
            }
        }

        return result;
    }
}