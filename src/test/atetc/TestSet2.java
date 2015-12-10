package atetc;

import atetc.other.set2.*;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TestSet2 {

    @Test
    public void testFindMinimalButtonsClick_2_1(){
        assertTrue(Q1.findMinimalButtonsClick(3, 3) == 0);
        assertTrue(Q1.findMinimalButtonsClick(3, 6) == 1);
        assertTrue(Q1.findMinimalButtonsClick(3, 5) == 2);
        assertTrue(Q1.findMinimalButtonsClick(3, 2) == 1);
        assertTrue(Q1.findMinimalButtonsClick(3, 1) == 2);
        assertTrue(Q1.findMinimalButtonsClick(3, 0) == 3);
        assertTrue(Q1.findMinimalButtonsClick(3, 12) == 2);
        assertTrue(Q1.findMinimalButtonsClick(3, 11) == 3);
        assertTrue(Q1.findMinimalButtonsClick(3, 10) == 3);
    }

    @Test
    public void testFindMinimalButtonsClick_2_2(){
        assertTrue(Q2.findUnpaired(null) == null);
        assertTrue(Arrays.equals(Q2.findUnpaired(new int[] {5}), new int[] {5}));
        assertTrue(Arrays.equals(Q2.findUnpaired(new int[]{5, 1}), new int[] {1, 5}));
        assertTrue(Arrays.equals(Q2.findUnpaired(new int[]{5, 1, 5, 3}), new int[] {1, 3}));
    }


}