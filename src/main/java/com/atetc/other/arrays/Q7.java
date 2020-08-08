package com.atetc.other.arrays;

import java.util.List;

/**
 *
 * From Akvelon Set 27
 *
 * You have m machines each having piece of one logical array of 64-bit
 integers. How would you find the k-th lowest value over this array?

 Allowed operations for each machine: 1. Get count of items
 2. Get value of item having index i on given machine

 Cases: 1. Each machine have items sorted
 2. Each machine have items in random order
 */
public class Q7 {

    public static int getLowestValue(List<Machine> machines, int k) {
        for (Machine machine : machines) {
            int count = machine.getCount();
            long value = machine.getValue(1);
        }

        return 0;
    }

    public static class Machine {
        int index;
        private long[] array;

        public Machine(long[] array) {
            this.array = array;
        }

        public int getCount() {
            return array.length;
        }

        public long getValue(int i) {
            return array[i];
        }
    }
}