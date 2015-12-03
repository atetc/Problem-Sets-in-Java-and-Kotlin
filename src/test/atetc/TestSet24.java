package atetc;

import atetc.set24.*;
import atetc.structures.SinglyLinkedList.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TestSet24 {

    @Test
    public void testGetNumberOfDivisiblePartitions_24_1(){
        assertTrue(Q1.getNumberOfDivisiblePartitions(0, 0) == 0);
        assertTrue(Q1.getNumberOfDivisiblePartitions(0, 3) == 0);
        assertTrue(Q1.getNumberOfDivisiblePartitions(3, 0) == 0);
        assertTrue(Q1.getNumberOfDivisiblePartitions(3, 3) == 1);
        assertTrue(Q1.getNumberOfDivisiblePartitions(6, 3) == 1);
        assertTrue(Q1.getNumberOfDivisiblePartitions(66, 3) == 2);
        assertTrue(Q1.getNumberOfDivisiblePartitions(2114, 7) == 2);
        assertTrue(Q1.getNumberOfDivisiblePartitions(214, 7) == 0);
        assertTrue(Q1.getNumberOfDivisiblePartitions(12123, 3) == 4);
    }

    @Test
    public void testGetNumberWithTwoDigit_24_2(){
        assertTrue(Q2.getNumberOf2s(0) == null);
        assertTrue(Q2.getNumberOf2s(1) == null);
        assertTrue(Q2.getNumberOf2s(2) == null);
        assertTrue(Q2.getNumberOf2s(3).equals(new ArrayList<>(Arrays.asList(2))));
        assertTrue(Q2.getNumberOf2s(13).equals(new ArrayList<>(Arrays.asList(2, 12))));
        assertTrue(Q2.getNumberOf2s(21).equals(new ArrayList<>(Arrays.asList(2, 12, 20))));
    }

    @Test
    public void testRemoveHead_24_3(){
        Node<Integer> head = new Node<>(5);
        Node<Integer> next = new Node<>(3);
        head.setNext(next)
                .setNext(new Node<>(7)
                .setNext(new Node<>(123)
                .setNext(new Node<>(4))));

        assertTrue(Q3.removeHead(head) == next);
    }

    @Test
    public void testGetNumberOfDifferentWaysForPurchase_24_4(){
        int[] coins = {1, 2, 5, 10, 20, 50};

        assertTrue(Q4.getNumberOfDifferentWaysForPurchase(coins, 0) == 0);
        assertTrue(Q4.getNumberOfDifferentWaysForPurchase(coins, 1) == 1);
        assertTrue(Q4.getNumberOfDifferentWaysForPurchase(coins, 3) == 2);
        assertTrue(Q4.getNumberOfDifferentWaysForPurchase(coins, 4) == 3);
    }
}