package atetc.set2;

/**
 * You've got an array of ints (array is NOT sorted). Find two elements without a pair.
 */
public class Q2 {

    public static int[] findUnpaired(int[] arr) {
        if (arr == null) {
            return null;
        }

        if (arr.length < 2) {
            return arr;
        }

        return null;
    }
}