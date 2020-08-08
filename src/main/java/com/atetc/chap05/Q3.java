package com.atetc.chap05;

/**
 * Given an integer, print the next smallest and the next
 * largest number that have the same number of 1 bits in their
 * binary representation.
 */
public class Q3 {

    public static boolean GetBit(int n, int index) {
        return ((n & (1 << index)) > 0);
    }

    public static int SetBit(int n, int index, boolean b) {
        if (b) {// if true, set 1
            return n | (1 << index); // set index's bit to 1
        } else {// else, set 0
            int mask = ~(1 << index);// set mask = all 1s but index's bit 0,
            return n & mask; // set u's index's bit 0.
        }
    }

    public static int GetNext_NP(int n) {
        if (n <= 0) {
            return -1; // failure check
        }

        int index = 0;         // init. starting from 0.
        int countOnes = 0;

        //  Find first 1's index. if not found 1, return false, then !false == true will continue. (looking for 1)
        //  xxxxx011100
        //          ↑
        while (!GetBit(n, index)) index++;

        // Turn on next zero. if not found 1 return false (looking for 0)
        // xxxxx111100
        //      ↑      countOnes == 3
        while (GetBit(n, index)) {
            index++;
            countOnes++;
        }
        n = SetBit(n, index, true); // set next 0=1

        // Turn off previous one
        // xxxxx101100
        //       ↑     countOnes == 2
        index--;
        n = SetBit(n, index, false);
        countOnes--;

        // Set zeros
        // xxxxx100000
        //       ↑^^   countOnes == 2
        for (int i = index - 1; i >= countOnes; i--) {
            n = SetBit(n, i, false);
        }

        // Set ones
        // xxxxx100011
        //       ↑  ^^ countOnes == 2
        for (int i = countOnes - 1; i >= 0; i--) {
            n = SetBit(n, i, true);
        }
        return n;
    }

    public static int GetPrevious_NP(int n) {
        if (n <= 0) return -1; // Error
        int index = 0;
        int countZeros = 0;

        //  Find first zero.
        //  xxxxx100011
        //          ↑
        while (GetBit(n, index)) index++;

        // Turn off next 1.
        // xxxxx000011
        //      ↑      countZeros == 3
        while (!GetBit(n, index)) {
            index++;      // move pointer left
            countZeros++; // count zeros
        }
        n = SetBit(n, index, false);

        // Turn on previous zero (must be following zero.)
        // xxxxx010011
        //       ↑     countZeros == 2
        index--; // move pointer to 1 index right.
        n = SetBit(n, index, true); //set 1
        countZeros--; // one less zero

        // Set ones(starting from index's right, turn countZeros's 0 to 1.)
        // xxxxx011111
        //        ↑^^  countZeros == 2
        for (int i = index - 1; i >= countZeros; i--) {
            n = SetBit(n, i, true);  //set 1's
        }

        // Set zeros, turn that many 1's back to zero
        // xxxxx011100
        //          ^^ countZeros == 2
        for (int i = countZeros - 1; i >= 0; i--) {
            n = SetBit(n, i, false); //set 0's
        }
        return n;
    }
}
