package com.atetc.chap05;

/**
 * Write a function to determine the number of bits required to
 * convert integer A to integer B.
 *
 * EXAMPLE
 * Input:  31, 14 (11111, 01110)
 * Output: 2
 */
public class Q5 {

    public static int bitsFlipRequired(int a, int b) {
        if (a == b) {
            return 0;
        }

        int count = 0;
        int diff = a ^ b;

        while (diff > 0) {
            if (diff % 2 == 1) {
                count++;
            }

            diff = diff >> 1;
        }

        return count;
    }
}