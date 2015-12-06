package atetc.other.set2;

import java.util.HashSet;

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

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : arr) {
            if (hashSet.contains(i)) {
                hashSet.remove(i);
            } else {
                hashSet.add(i);
            }
        }

        int[] result = new int[hashSet.size()];
        int j = 0;
        for (Integer integer : hashSet) {
            result[j] = integer;
            j++;
        }


        return result;
    }
}