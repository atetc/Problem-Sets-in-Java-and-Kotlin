package com.atetc;

import com.atetc.other.set24.Q1;
import com.atetc.other.set24.Q2;
import com.atetc.other.set24.Q4;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestSet24 {

    @Test
    public void testGetNumberOfDivisiblePartitions_24_1(){
        assertEquals(0, Q1.getNumberOfDivisiblePartitions(0, 0));
        assertEquals(0, Q1.getNumberOfDivisiblePartitions(0, 3));
        assertEquals(0, Q1.getNumberOfDivisiblePartitions(3, 0));
        assertEquals(1, Q1.getNumberOfDivisiblePartitions(3, 3));
        assertEquals(1, Q1.getNumberOfDivisiblePartitions(6, 3));
        assertEquals(2, Q1.getNumberOfDivisiblePartitions(66, 3));
        assertEquals(2, Q1.getNumberOfDivisiblePartitions(2114, 7));
        assertEquals(0, Q1.getNumberOfDivisiblePartitions(214, 7));
        assertEquals(4, Q1.getNumberOfDivisiblePartitions(12123, 3));
    }

    @Test
    public void testGetNumberWithTwoDigit_24_2(){
        assertNull(Q2.getNumberOf2s(0));
        assertNull(Q2.getNumberOf2s(1));
        assertNull(Q2.getNumberOf2s(2));
        assertEquals(Q2.getNumberOf2s(3), new ArrayList<>(Collections.singletonList(2)));
        assertEquals(Q2.getNumberOf2s(13), new ArrayList<>(Arrays.asList(2, 12)));
        assertEquals(Q2.getNumberOf2s(21), new ArrayList<>(Arrays.asList(2, 12, 20)));
    }

    @Test
    public void testGetNumberOfDifferentWaysForPurchase_24_4(){
        int[] coins = {1, 2, 5, 10, 20, 50};

        assertEquals(0, Q4.getNumberOfDifferentWaysForPurchase(coins, 0));
//        assertEquals(1, Q4.getNumberOfDifferentWaysForPurchase(coins, 1));
//        assertEquals(2, Q4.getNumberOfDifferentWaysForPurchase(coins, 3));
//        assertEquals(3, Q4.getNumberOfDifferentWaysForPurchase(coins, 4));
    }
}