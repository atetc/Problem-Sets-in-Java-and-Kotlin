package com.atetc.chap03;

import com.atetc.helpers.Printer;

import java.util.Arrays;

/**
 * Describe how you could use a single array to implement three stacks.
 */
public class Q1 {

    private static final int STACK_SIZE = 300;
    private static final int STACK_NUM = 3;

    private static int[] stackPointers = new int[STACK_NUM];
    static {
        Arrays.fill(stackPointers, -1);
    }

    private int[] buffer = new int[STACK_SIZE * STACK_NUM];

    public void push(int stackNum, int item) {
        if (isFull(stackNum))
            throw new IllegalArgumentException("Stack " + stackNum + " is full!");
        ++stackPointers[stackNum];
        setTop(stackNum, item);
    }

    public int pop(int stackNum) {
        if (isEmpty(stackNum))
            throw new IllegalArgumentException("Stack " + stackNum + " is empty!");
        --stackPointers[stackNum];
        return getTop(stackNum);
    }

    public int peek(int stackNum) {
        if (isEmpty(stackNum))
            throw new IllegalArgumentException("Stack " + stackNum + " is empty!");
        return getTop(stackNum);
    }

    public boolean isFull(int stackNum) {
        if (stackNum < 0 || stackNum >= STACK_NUM)
            throw new IllegalArgumentException("Stack " + stackNum + " doen't exist!");
        return stackPointers[stackNum] >= STACK_SIZE - 1;
    }

    public boolean isEmpty(int stackNum) {
        if (stackNum < 0 || stackNum >= STACK_NUM)
            throw new IllegalArgumentException("Stack " + stackNum + " doen't exist!");
        return stackPointers[stackNum] <= -1;
    }

    public void printStack(int stackNum) {
        if (stackNum < 0 || stackNum >= STACK_NUM)
            throw new IllegalArgumentException("Stack " + stackNum + " doen't exist!");
        int top = getBufferIndex(stackNum);
        int btm = stackNum * STACK_SIZE;
        Printer.print("Stack " + stackNum + ": ");
        for (int i = btm; i <= top; ++i) {
            Printer.print(buffer[i] + " ");
        }
        Printer.println("[TOP]");
    }

    private int getTop(int stackNum) {
        return buffer[getBufferIndex(stackNum)];
    }

    private void setTop(int stackNum, int item) {
        buffer[getBufferIndex(stackNum)] = item;
    }

    private static int getBufferIndex(int stackNum) {
        return stackPointers[stackNum] + stackNum * STACK_SIZE;
    }
}
