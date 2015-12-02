package atetc;

import atetc.set2.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestSet2 {

    @Test
    public void testFindUnpaired_1_1(){
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
}