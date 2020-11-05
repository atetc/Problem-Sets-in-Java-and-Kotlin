package com.atetc.chap03;

import java.util.Stack;

/**
 * How would you design a stack which, in addition to push
 * and pop, also has a function min which returns the minimum
 * element? Push, pop and min should all operate in O(1) time.
 */
@SuppressWarnings("serial")
public class Q2  {

    public static class StackWithMin extends Stack<NodeWithMin> {

        public NodeWithMin push(int value) {
            int newMin = Math.min(value, min());
            return super.push(new NodeWithMin(value, newMin));
        }

        public int min() {
            if (this.isEmpty()) {
                return Integer.MAX_VALUE;
            } else {
                return peek().min;
            }
        }
    }

    public static class NodeWithMin {
        public int value;
        public int min;

        public NodeWithMin(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    public static class StackWithMin2 extends Stack<Integer> {

        private Stack<Integer> mMinStack = new Stack<>();

        @Override
        public Integer push(Integer item) {
            if (mMinStack.isEmpty() || item < min()) {
                mMinStack.push(item);
            }
            return super.push(item);
        }

        @Override
        public Integer pop() {
            int value = super.pop();
            if (value == min()) {
                mMinStack.pop();
            }
            return value;
        }

        public Integer min() {
            if (mMinStack.isEmpty()) {
                return Integer.MAX_VALUE;
            } else {
                return mMinStack.peek();
            }
        }
    }
}
