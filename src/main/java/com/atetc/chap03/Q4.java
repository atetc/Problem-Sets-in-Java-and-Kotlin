package com.atetc.chap03;

import java.util.Stack;

/**
 * In the classic problem of the Towers of Hanoi, you have 3 towers and N disks
 * of different sizes which can slide onto any tower. The puzzle starts with disks sorted
 * disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top
 * of an even larger one). You have the following constraints:
 * (1) Only one disk can be moved at a time.
 * (2) A disk is slid off the top of one tower onto the next tower.
 * (3) A disk can only be placed on top of a larger disk.
 * Write a program to move the disks from the first tower to the last using stacks.
 */
public class Q4 {

    public static class Tower {
        private Stack<Integer> disks;
        private int index;

        public Tower(int i) {
            this.disks = new Stack<>();
            this.index = i;
        }

        public Stack<Integer> getDisks() {
            return disks;
        }

        public void add(int d) {
            if (disks.isEmpty() || disks.peek() > d) {
                disks.push(d);
            }
        }

        public void moveTopTo(Tower t) {
            int top = disks.pop();
            t.add(top);
        }

        public void moveDisks(int n, Tower destination, Tower buffer) {
            if (n > 0) {
                moveDisks(n - 1, buffer, destination);
                moveTopTo(destination);
                buffer.moveDisks(n - 1, destination, this);
            }
        }
    }
}
