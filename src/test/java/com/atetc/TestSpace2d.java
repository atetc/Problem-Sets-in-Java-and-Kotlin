package com.atetc;

import com.atetc.other.space2d.Q1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSpace2d {

    @Test
    public void testBuildingsIn2D(){
        // direct approach
        assertEquals(Q1.getMaximumArea(new int[]{1, 2}), 2);
        assertEquals(Q1.getMaximumArea(new int[]{2, 1}), 2);
        assertEquals(Q1.getMaximumArea(new int[]{1, 2, 3}), 4);
        assertEquals(Q1.getMaximumArea(new int[]{3, 1, 2}), 3);
        assertEquals(Q1.getMaximumArea(new int[]{1, 2, 3, 4}), 6);
        assertEquals(Q1.getMaximumArea(new int[]{1, 2, 3, 4, 5}), 9);
        assertEquals(Q1.getMaximumArea(new int[]{1, 5, 1}), 5);
    }
}