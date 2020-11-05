package com.atetc;

/**
 * Created by Atetc on 16.11.2015.
 */

import com.atetc.chap03.*;
import org.junit.Test;
import com.atetc.chap03.*;

import java.util.Arrays;
import java.util.Stack;

import static org.junit.Assert.assertTrue;

public class TestChap3 {

    @Test
    public void testSingleArrayStack_3_1(){
        Q1 stack = new Q1();
        stack.push(0, -1);
        stack.push(0, -2);
        stack.push(0, -3);
        stack.push(1, 1);
        stack.push(1, 2);
        stack.push(1, 3);
        stack.push(2, 10);
        stack.push(2, 20);
        stack.push(2, 30);
        stack.push(2, 40);
        stack.pop(0);
        stack.pop(1);
        stack.pop(1);

        int pop = stack.pop(2);
        assertTrue(pop == 30);
    }

    @Test
    public void testSingleArrayStack_3_2() {
        Q2.StackWithMin stack = new Q2.StackWithMin();

        stack.push(2);
        stack.push(-1);
        stack.push(-10);
        stack.push(3);

        assertTrue(stack.min() == -10);

        Q2.StackWithMin2 stack2 = new Q2.StackWithMin2();

        stack2.push(2);
        stack2.push(-1);
        stack2.push(-10);
        stack2.push(3);

        assertTrue(stack.min() == -10);
    }

    @Test
    public void testSetOfStack_3_3() {
        Q3.SetOfStacks stack = new Q3.SetOfStacks(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Integer popAt = stack.popAt(0);
        assertTrue(popAt == 3);

        Q3.SetOfStacks2 stack2 = new Q3.SetOfStacks2();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);

        Integer popAt2 = stack2.popAt(0);
        assertTrue(popAt2 == 3);
    }

    @Test
    public void testTowersAndDisks_3_4() {
        int DISKS_COUNT = 5;
        int TOWER_COUNT = 3;

        Q4.Tower[] towers = new Q4.Tower[DISKS_COUNT];

        for (int i = 0; i < TOWER_COUNT; ++i) {
            towers[i] = new Q4.Tower(i);
        }

        for (int i = DISKS_COUNT - 1; i >= 0; i--) {
            towers[0].add(i);
        }

        towers[0].moveDisks(DISKS_COUNT, towers[2], towers[1]);

        assertTrue(towers[0].getDisks().isEmpty());
        assertTrue(towers[1].getDisks().isEmpty());
    }

    @Test
    public void testCustomQueue_3_5() {
        Q5 myQueue = new Q5();


        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);

        myQueue.remove();

        int peek = myQueue.peek();
        assertTrue(peek == 2);
    }

    @Test
    public void testCustomQueue_3_6() {
        Integer[] a = {2, 6, 5, 4, 1, 3, 8, 7};
        Integer[] b = {1, 2, 3, 4, 5, 6, 7, 8};
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.addAll(Arrays.asList(a));
        stack2.addAll(Arrays.asList(b));

        Stack<Integer> sortStack = Q6.sortStack(stack1);

        assertTrue(sortStack.equals(stack2));
    }
}