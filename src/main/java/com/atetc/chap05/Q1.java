package com.atetc.chap05;

/**
 * You are given two 32-bit numbers, N and M, and two bit positions, i and j.
 * Write a method to set all bits between i and j in N equal to M (e.g., M becomes a substring of located at i and starting at j).
 *
 * EXAMPLE
 * Input: N = 10000000000, M = 10011, i = 2, j = 6
 * Output: N = 10001001100
 */
public class Q1 {

    public static int updateBits(int n, int m, int i, int j) {
        int allOnes = ~0;
        int left = allOnes << (j + 1);
        int right = (1 << i) - 1;
        int mask = left | right;
        // clear bit & set bit
        return (n & mask) | (m << i);
    }

    public static int updateBits2(int n, int m, int i, int j) {
        int mask = ~((1 << (j+1)) - (1 << i));
        return (n & mask) | (m << i);
    }
}
