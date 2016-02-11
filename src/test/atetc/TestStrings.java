package atetc;

import atetc.other.strings.*;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestStrings {

    @Test
    public void testGetNumberOfDivisiblePartitions_24_1(){
        String s = "abcdefghijklmn";
        int[][] tags = {{0, 0, 0}};
        assertArrayEquals(Q1.query(s, tags, new int[]{0}), new String[]{"a"});

        tags = new int[][]{{0, 1, 0}};
        assertArrayEquals(Q1.query(s, tags, new int[]{0}), new String[]{"ab"});

        tags = new int[][]{{2, 7, 0}, {3, 5, 1}, {10, 12, 0}};
        assertArrayEquals(Q1.query(s, tags, new int[]{1}), new String[]{"def"});
        assertArrayEquals(Q1.query(s, tags, new int[]{0}), new String[]{"cdefgh", "klm"});
        assertArrayEquals(Q1.query(s, tags, new int[]{0, 1}), new String[]{"def"});
    }

    @Test
    public void testCorpWar_24_1(){
        assertEquals(Q2.minReplacements("intellect", "tell"), 1);
        assertEquals(Q2.minReplacements("google", "apple"), 0);
        assertEquals(Q2.minReplacements("sirisiri", "siri"), 2);
    }
}