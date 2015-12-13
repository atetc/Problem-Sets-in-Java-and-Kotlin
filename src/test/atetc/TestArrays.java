package atetc;

import atetc.other.arrays.Q2;
import atetc.other.arrays.Q4;
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

    @Test
    public void testIsLeftRightArraysSumEqual_3(){
        assertTrue(!atetc.other.arrays.Q3.isLeftRightArraysSumEqual(null));

        int[] arr = {4};
        assertTrue(!atetc.other.arrays.Q3.isLeftRightArraysSumEqual(arr));

        arr = new int[]{4, 1};
        assertTrue(!atetc.other.arrays.Q3.isLeftRightArraysSumEqual(arr));

        arr = new int[]{1, 2, 3, 4, 6};
        assertTrue(atetc.other.arrays.Q3.isLeftRightArraysSumEqual(arr));

        arr = new int[]{1, 2, 4, 6};
        assertTrue(!atetc.other.arrays.Q3.isLeftRightArraysSumEqual(arr));
    }

    @Test
    public void testGetCountOfPairsWithDifference_4(){
        assertTrue(Q4.getCountOfPairsWithDifference(null, 5) == null);

        int[] arr = new int[]{1};
        assertTrue(Q4.getCountOfPairsWithDifference(arr, 5) == null);

        arr = new int[]{1, 5};
        assertTrue(Q4.getCountOfPairsWithDifference(arr, 4) == 1);

        arr = new int[]{1, 5};
        assertTrue(Q4.getCountOfPairsWithDifference(arr, 5) == 0);

        arr = new int[]{1, 9, 5};
        assertTrue(Q4.getCountOfPairsWithDifference(arr, 4) == 2);

        arr = new int[]{1, 9, 5, 4};
        assertTrue(Q4.getCountOfPairsWithDifference(arr, 5) == 1);
    }

    @Test
    public void testFindUnpaired_5(){
        assertTrue(Q2.findUnpaired(null) == null);

        int[] arr = new int[]{1};
        assertTrue(Q2.findUnpaired(arr) == 1);

        arr = new int[]{1, 1, 2, 2, 3, 3, 5, 66, 66};
        assertTrue(Q2.findUnpaired(arr) == 5);
    }
}