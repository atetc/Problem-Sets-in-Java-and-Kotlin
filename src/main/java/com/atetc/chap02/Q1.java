package com.atetc.chap02;

import com.atetc.structures.LinkedList;

import java.util.HashSet;

public class Q1 {

    /**
     * Write code to remove duplicates from an unsorted linked list.
     *
     * FOLLOW UP
     * How would you solve this problem if a temporary buffer is not allowed?
     */

    // with extra space
    public static void removeDuplicates(LinkedList<Integer> list) {
        LinkedList.Node<Integer> n = list.head;
        HashSet<Integer> set = new HashSet<>();
        LinkedList.Node<Integer> prev = null;
        while (n != null) {
            if (set.contains(n.data)) {
                if (prev != null) {
                    prev.next = n.next;
                }
            } else {
                set.add(n.data);
                prev = n;
            }
            n = n.next;
        }
    }

    //without extra space
    public static void removeDuplicates2(LinkedList<Integer> list) {
        LinkedList.Node<Integer> n = list.head;
        while (n != null) {
            LinkedList.Node<Integer> runner = n;
            while (runner.next != null) {
                if (runner.next.data == n.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            n = n.next;
        }
    }
}
