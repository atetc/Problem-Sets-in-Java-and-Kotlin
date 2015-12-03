package atetc;

import atetc.set24.Q1;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestSet24 {

    @Test
    public void testFindNumberOfDivisiblePartitions_24_1(){
        assertTrue(Q1.getNumberOfDivisiblePartitions(0, 0) == 0);
        assertTrue(Q1.getNumberOfDivisiblePartitions(0, 3) == 0);
        assertTrue(Q1.getNumberOfDivisiblePartitions(3, 0) == 0);
        assertTrue(Q1.getNumberOfDivisiblePartitions(3, 3) == 1);
        assertTrue(Q1.getNumberOfDivisiblePartitions(6, 3) == 1);
        assertTrue(Q1.getNumberOfDivisiblePartitions(66, 3) == 2);
        assertTrue(Q1.getNumberOfDivisiblePartitions(2114, 7) == 2);
        assertTrue(Q1.getNumberOfDivisiblePartitions(214, 7) == 0);
        assertTrue(Q1.getNumberOfDivisiblePartitions(12123, 3) == 4);
    }
}