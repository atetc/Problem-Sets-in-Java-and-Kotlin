package atetc;

import atetc.set1.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestSet1 {

    @Test
    public void testFindUnpaired_1_1(){
        assertTrue(Q1.findUnpaired(null) == null);

        int[] arr = new int[]{1};
        assertTrue(Q1.findUnpaired(arr) == 1);

        arr = new int[]{1, 1, 2, 2, 3, 3, 5, 66, 66};
        assertTrue(Q1.findUnpaired(arr) == 5);
    }

    @Test
    public void testIsLeftRightArraysSumEqual_1_2(){
        assertTrue(!Q2.isLeftRightArraysSumEqual(null));

        int[] arr = {4};
        assertTrue(!Q2.isLeftRightArraysSumEqual(arr));

        arr = new int[]{4, 1};
        assertTrue(!Q2.isLeftRightArraysSumEqual(arr));

        arr = new int[]{1, 2, 3, 4, 6};
        assertTrue(Q2.isLeftRightArraysSumEqual(arr));

        arr = new int[]{1, 2, 4, 6};
        assertTrue(!Q2.isLeftRightArraysSumEqual(arr));
    }
}