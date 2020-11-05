package com.atetc.other.arrays;

/**
 * from google interview:

 Give you an array which has n integers, it has both positive and negative integers.
 Now you need sort this array in a special way.
 After that, the negative integers should be in the front, and the positive integers should be in the back.
 Also the relative position should not be changed.
 eg. -1 1 3 -2 2 ans: -1 -2 1 3 2.
 O(n)time complexity and o(1) space complexity is perfect.
 There's in-place sorting solution for this problem, that would be perfect.
 */
public class Q6 {

    public static void divideNegativeAndPositiveIntegers(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // change all values to Positive
        for (int i=0; i < arr.length; i++) {
            arr[i] -= min;
        }

        int newMax = max - min + 1;

        // save original negative values into new positions
        int currNegativeIndex = 0;
        for (int i=0; i < arr.length; i++)
            if (arr[i] % newMax < (-min)) {
                arr[currNegativeIndex++] += (arr[i] % newMax) * newMax;
            }

        // save original positive values into new positions
        int currPositiveIndex = currNegativeIndex;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % newMax > (-min)) {
                arr[currPositiveIndex++] += (arr[i] % newMax) * newMax;
            }
        }
        // recover to original value
        for (int i=0; i < arr.length; i++){
            arr[i] = arr[i] / newMax + min;
        }
    }
}