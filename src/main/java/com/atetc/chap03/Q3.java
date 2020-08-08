package com.atetc.chap03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Imagine a (literal) stack of plates. If the stack gets too high, it
 * might topple. Therefore, in real life, we would likely start a new
 * stack when the previous stack exceeds some threshold. Implement a
 * data structure SetOfStacks that mimics this. SetOfStacks should be
 * composed of several stacks and should create a new stack once the
 * previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop()
 * should behave identically to a single stack (that is, pop() should
 * return the same values as it would if there were just a single stack).
 *
 * FOLLOW UP
 * Implement a function popAt(int index) which performs a pop operation
 * on a specific sub-stack.
 */
public class Q3 {

    public static class SetOfStacks {

        List<Stack> stacks = new ArrayList<>();
        int capacity;
        int stackSize;

        public SetOfStacks(int capacity) {
            this.capacity = capacity;
            stackSize = 0;
        }

        public void push(int v) {
            if (stackSize + 1 > stacks.size() * capacity) {
                Stack<Integer> newStack = new Stack<>();
                newStack.push(v);
                stacks.add(newStack);
            } else {
                stacks.get(stacks.size() - 1).push(v);
            }
            stackSize++;
        }

        public int pop() {
            if (stackSize == 0) {
                return Integer.MAX_VALUE;
            }

            Stack<Integer> stack = stacks.get(stacks.size() - 1);
            Integer pop = stack.pop();
            if (stack.isEmpty()) {
                stacks.remove(stacks.size()-1);
            }
            stackSize--;
            return pop;
        }

        public int peek() {
            if (stackSize == 0) {
                return Integer.MAX_VALUE;
            }
            Stack<Integer> stack = stacks.get(stacks.size() - 1);
            return stack.peek();
        }

        public Integer popAt(int s){
            Stack stack = stacks.get(s);
            return (int) stack.pop();
        }
    }

    public static class SetOfStacks2 {
        private static final int STACK_SIZE = 3;
        private LinkedList<Stack<Integer>> mStacksLinkedList = new LinkedList<>();

        public void push(int item) {
            if (mStacksLinkedList.isEmpty() || mStacksLinkedList.getLast().size() >= STACK_SIZE) {
                Stack<Integer> stack = new Stack<>();
                stack.push(item);
                mStacksLinkedList.add(stack);
            } else {
                mStacksLinkedList.getLast().push(item);
            }
        }

        public Integer pop() {
            if (mStacksLinkedList.isEmpty()) {
                throw new IllegalStateException("Stacks are empty!");
            }
            Stack<Integer> last = mStacksLinkedList.getLast();
            int item = last.pop();
            if (last.isEmpty()) {
                mStacksLinkedList.removeLast();
            }
            return item;
        }

        public Integer popAt(int index) {
            if (mStacksLinkedList.isEmpty()) {
                throw new IllegalStateException("Stacks are empty!");
            }

            if (index < 0 || index >= mStacksLinkedList.size()) {
                throw new IllegalArgumentException("Invalid index!");
            }

            int item = mStacksLinkedList.get(index).pop();
            for (int i = index; i < mStacksLinkedList.size() - 1; ++i) {
                Stack<Integer> curr = mStacksLinkedList.get(i);
                Stack<Integer> next = mStacksLinkedList.get(i + 1);
                curr.push(next.remove(0));
            }

            if (mStacksLinkedList.getLast().isEmpty()) {
                mStacksLinkedList.removeLast();
            }

            return item;
        }
    }
}
