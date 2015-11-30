package atetc;

import atetc.set1.Q1;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestSet1 {

    @Test
    public void testFindUnpaired_1_1(){
        int[] arr = {1, 1, 2, 2, 3, 3, 5, 66, 66};
        assertTrue(Q1.findUnpaired(arr) == 5);
    }
}