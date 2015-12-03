package atetc;

import atetc.set24.*;
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
    public void testNumberOf2s_24_1(){
        assertTrue(Q2.getNumberOf2s(0) == null);
        assertTrue(Q2.getNumberOf2s(1) == null);
        assertTrue(Q2.getNumberOf2s(2) == null);
        assertTrue(Q2.getNumberOf2s(3).equals(new ArrayList<>(Arrays.asList(2))));
        assertTrue(Q2.getNumberOf2s(13).equals(new ArrayList<>(Arrays.asList(2, 12))));
        assertTrue(Q2.getNumberOf2s(21).equals(new ArrayList<>(Arrays.asList(2, 12, 20))));
    }
}