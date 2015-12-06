package atetc;

import org.junit.Test;
import atetc.other.arrays.Q1;

import static org.junit.Assert.assertTrue;

public class TestArrays {

    @Test
    public void testArraySum_1(){
        int n = 6;
        int[] a = {1, 2, 3, 4, 10, 11};
        int sum = Q1.getArraySum(n, a);
        assertTrue(sum == 31);
    }
}