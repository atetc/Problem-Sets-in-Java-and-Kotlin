package com.atetc;

import com.atetc.other.set2.Q1;
import com.atetc.other.set2.Q2;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSet2 {

    @Test
    public void testFindMinimalButtonsClick_2_1(){
        assertEquals(0, Q1.findMinimalButtonsClick(3, 3));
        assertEquals(1, Q1.findMinimalButtonsClick(3, 6));
        assertEquals(2, Q1.findMinimalButtonsClick(3, 5));
        assertEquals(1, Q1.findMinimalButtonsClick(3, 2));
        assertEquals(2, Q1.findMinimalButtonsClick(3, 1));
        assertEquals(3, Q1.findMinimalButtonsClick(3, 0));
        assertEquals(2, Q1.findMinimalButtonsClick(3, 12));
        assertEquals(3, Q1.findMinimalButtonsClick(3, 11));
        assertEquals(3, Q1.findMinimalButtonsClick(3, 10));
    }

    @Test
    public void testFindMinimalButtonsClick_2_2(){
        assertNull(Q2.findUnpaired(null));
        assertArrayEquals(Q2.findUnpaired(new int[]{5}), new int[]{5});
        assertArrayEquals(Q2.findUnpaired(new int[]{5, 1}), new int[]{1, 5});
        assertArrayEquals(Q2.findUnpaired(new int[]{5, 1, 5, 3}), new int[]{1, 3});
    }
}
