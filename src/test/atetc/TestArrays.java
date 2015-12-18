package atetc;

import atetc.other.arrays.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
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
    public void testBuildPairs_5(){
        int[] x = new int[]{2};
        int[] y = new int[]{3};

        assertArrayEquals(Q5.buildPairs(x, y), new int[]{0});

        x = new int[]{2, 1};
        y = new int[]{1, 2};

        assertArrayEquals(Q5.buildPairs(x, y), new int[]{0, 1});

        x = new int[]{45, 3};
        y = new int[]{2, 3};

        assertArrayEquals(Q5.buildPairs(x, y), new int[]{0, 1});

        x = new int[]{45, 3, 5};
        y = new int[]{2, 3, 1};

        assertArrayEquals(Q5.buildPairs(x, y), new int[]{2, 1, 0});

        x = new int[]{-1000, -10, -3, 0, 4};
        y = new int[]{1, 0, -200, -500, -700};

        assertArrayEquals(Q5.buildPairs(x, y), new int[]{0, 1, 2, 3, 4});
    }

    @Test
    public void testDivideNegativeAndPositiveIntegers_6(){
        int[] array = new int[]{-1, 1, 3, -2, 2};
        Q6.divideNegativeAndPositiveIntegers(array);
        assertArrayEquals(array, new int[]{-1, -2, 1, 3, 2});
    }
}