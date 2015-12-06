package atetc.chap01;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to 0.
 *
 */
public class Q7 {

    // use boolean array
    public static void setZeros(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        // mark zero
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 0) {
                    rows[i] = cols[j] = true;
                }
            }
        }

        // set zeros
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // use bit vector
    public static void setZeros2(int[][] matrix) {
        long bitVecRows = 0;
        long bitVecCols = 0;

        // mark zero
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 0) {
                    bitVecRows |= 1L << i;
                    bitVecCols |= 1L << j;
                }
            }
        }

        // set zeros
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if ((bitVecRows & (1L << i)) != 0 || (bitVecCols & (1L << j)) != 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
