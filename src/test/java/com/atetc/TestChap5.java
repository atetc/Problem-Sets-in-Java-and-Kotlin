package com.atetc;

/**
 * Created by Atetc on 19.11.2015.
 */

import com.atetc.chap05.*;
import com.atetc.helpers.Bit;
import org.junit.Test;
import com.atetc.chap05.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertTrue;

public class TestChap5 {

    @Test
    public void testSetBits_5_1(){
        int n = Bit.toInt("10000000000"), m = Bit.toInt("10101");
        int i = 2, j = 6;

        assertTrue(Q1.updateBits(n, m, i, j) == Bit.toInt("10001010100"));
        assertTrue(Q1.updateBits2(n, m, i, j) == Bit.toInt("10001010100"));
    }

    @Test
    public void testPrintBinary_5_2(){
        String s = Q2.printBinary("3.25");
        assertTrue(s.equals("11.01"));
    }

    @Test
    public void testGetNextSmallest_5_3(){
        assertTrue(Q3.GetNext_NP(6) == 9);
        assertTrue(Q3.GetNext_NP(3) == 5);
    }

    @Test
    public void testCode_5_4(){
        assertTrue(Q4.code((int) Math.pow(2, 2)));
        assertTrue(Q4.code((int) Math.pow(2, 3)));
        assertTrue(Q4.code((int) Math.pow(2, 4)));
        assertTrue(!Q4.code(1 + (int) Math.pow(2, 5)));
        assertTrue(!Q4.code(3 + (int) Math.pow(2, 5)));
        assertTrue(!Q4.code(4 + (int) Math.pow(2, 5)));
    }

    @Test
    public void testBitsFlipRequired_5_5(){
        int a = 31, b = 14;

        assertTrue(Q5.bitsFlipRequired(a, b) == 2);
    }

    @Test
    public void testSwapOddAndEvenBits_5_6(){
        int a = Integer.parseInt("101010", 2);
        int b = Q6.swapOddEvenBits(a);
        String s = Integer.toBinaryString(b);

        assertTrue(s.equals("10101"));
    }

    @Test
    public void testFindMissingInteger_5_7(){
        Integer[] a = {0,1,2,3,5,6,7,8,9,10};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
        Collections.shuffle(list);

        assertTrue(Q7.findMissingInteger(list) == 4);
    }
}