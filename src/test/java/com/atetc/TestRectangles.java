package com.atetc;

import com.atetc.other.rectangles.Q1;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestRectangles {

    @Test
    public void testMain(){
        int sum = Q1.getSumOfTwoRectanglesArea(4, -6, 6, -4, -4, -4, -1, -1);
        assertTrue(sum == 13);

        sum = Q1.getSumOfTwoRectanglesArea(-4, 1, 2, 6, 0, -1, 4, 3);
        assertTrue(sum == 42);

        sum = Q1.getSumOfTwoRectanglesArea(0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(sum == 0);

        sum = Q1.getSumOfTwoRectanglesArea(-4, 1, 2, 6, -5, -1, 4, 3);
        assertTrue(sum == 54);
    }
}