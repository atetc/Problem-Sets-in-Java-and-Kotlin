package atetc;

import atetc.other.arrays.Q2;
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

    @Test
    public void testFindUnpaired_2(){
        assertTrue(Q2.findUnpaired(null) == null);

        int[] arr = new int[]{1};
        assertTrue(Q2.findUnpaired(arr) == 1);

        arr = new int[]{1, 1, 2, 2, 3, 3, 5, 66, 66};
        assertTrue(Q2.findUnpaired(arr) == 5);
    }
}