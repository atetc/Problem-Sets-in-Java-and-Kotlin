package atetc;

import atetc.other.strings.*;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TestStrings {

    @Test
    public void testGetNumberOfDivisiblePartitions_24_1(){
        String s = "abcdefghijklmn";
        int[][] tags = {{0, 0, 0}};
        assertTrue(Arrays.equals(Q1.query(s, tags, new int[]{0}), new String[]{"a"}));

        tags = new int[][]{{0, 1, 0}};
        assertTrue(Arrays.equals(Q1.query(s, tags, new int[]{0}), new String[]{"ab"}));

        tags = new int[][]{{2, 7, 0}, {3, 5, 1}, {10, 12, 0}};
        assertTrue(Arrays.equals(Q1.query(s, tags, new int[]{1}), new String[]{"def"}));
        assertTrue(Arrays.equals(Q1.query(s, tags, new int[]{0}), new String[]{"cdefgh", "klm"}));
        assertTrue(Arrays.equals(Q1.query(s, tags, new int[]{0, 1}), new String[]{"def"}));
    }
}