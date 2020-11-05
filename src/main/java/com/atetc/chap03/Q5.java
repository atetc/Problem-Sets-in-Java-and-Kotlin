package com.atetc.chap03;

import java.util.Stack;

/**
 * Implement a MyQueue class which implements a queue using two stacks.
 */
public class Q5 {
    private static final int LOAD_FACTOR = 10;

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public int size() {
        return s1.size() + s2.size();
    }

    public void add(int item) {
        s1.push(item);
    }

    public int peek() {
        if (!s2.empty()) {
            return s2.peek();
        }

        while (!s1.empty()) {
            s2.push(s1.pop());
        }

        return s2.peek();
    }

    public int remove() {
        if (!s2.isEmpty()) {
            return s2.pop();
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        return s2.pop();
    }
}
