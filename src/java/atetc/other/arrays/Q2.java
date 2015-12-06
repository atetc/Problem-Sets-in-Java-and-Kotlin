package atetc.other.arrays;

/**
 * You've got an sorted array of ints 2,2,3,3,4,5,5... Find an element without a pair.
 */
public class Q2 {

    public static Integer findUnpaired(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        if (arr.length == 1) {
            return arr[0];
        }

        int result = 0;
        for (int element : arr) {
            result = result ^ element;
        }

        return result;
    }
}