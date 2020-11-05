package com.atetc.chap11;

import com.atetc.helpers.Printer;

import static com.atetc.helpers.Printer.printArray;

/**
 * Given an M x N matrix in which each row and each column
 * is sorted in ascending order, write a method to find an
 * element.
 */
public class Q6 {
    // returns index (row, column)
    public static int[] search(int[][] m, int x) {
        if (m == null) return null;
        int i = 0, j = m[0].length - 1;
        while (i <= m.length - 1 && j >= 0) {
            if (m[i][j] == x) return new int[] {i, j};
            else if (m[i][j] > x) --j;
            else ++i;
        }
        return new int[] {-1, -1};
    }

    //TEST----------------------------------
    public static void main(String[] args) {
        int[][] m = {{15,20,40, 85},
                     {20,35,80, 95},
                     {30,55,95, 105},
                     {40,80,100,120}};
        Printer.printArray(search(m, 55));
        Printer.printArray(search(m, 121));
    }
}
