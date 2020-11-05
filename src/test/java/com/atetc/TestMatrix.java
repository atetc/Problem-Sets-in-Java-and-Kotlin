package com.atetc;

import com.atetc.other.matrix.Q1;
import org.junit.Test;
import com.atetc.other.matrix.*;

import static org.junit.Assert.assertTrue;

public class TestMatrix {

    @Test
    public void testDiagonalDifference_1(){
        int n = 3;
        int a[][] = new int[n][];
        a[0] = new int[]{11, 2, 4};
        a[1] = new int[]{4, 5, 6};
        a[2] = new int[]{10, 8, -12};
        int difference = Q1.getAbsoluteDiagonalDifference(n, a);
        assertTrue(difference == 15);
    }
}