package com.atetc;

import com.atetc.chap01.*;
import org.junit.Test;
import com.atetc.chap01.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TestChap1 {

    @Test
    public void testUniqueString_1_1(){
        assertTrue(Q1.hasUniqueChars("dfsjh"));
        assertFalse(Q1.hasUniqueChars("dfseejh"));
        assertTrue(Q1.hasUniqueChars(""));
        assertTrue(Q1.hasUniqueChars(null));

        assertTrue(Q1.hasUniqueChars2("dfsjh"));
        assertFalse(Q1.hasUniqueChars2("dfseejh"));
        assertTrue(Q1.hasUniqueChars2(""));
        assertTrue(Q1.hasUniqueChars2(null));
    }

    @Test
    public void testRemoveDuplicatesString_1_3(){
        assertEquals("a", Q3.removeDuplicates("aaaa"));
        assertEquals("abcd", Q3.removeDuplicates("abcd"));
        assertNull(Q3.removeDuplicates(null));
        assertEquals("ab", Q3.removeDuplicates("aaabbb"));

        assertEquals("a", Q3.removeDuplicates2("aaaa"));
        assertEquals("abcd", Q3.removeDuplicates2("abcd"));
        assertNull(Q3.removeDuplicates2(null));
        assertEquals("ab", Q3.removeDuplicates2("aaabbb"));
    }

    @Test
    public void testAnagramString_1_4(){
        assertTrue(Q4.isAnagrams("abc", "cba"));
        assertTrue(Q4.isAnagrams("abc", "abc"));
        assertFalse(Q4.isAnagrams("abc", "ca"));
        assertFalse(Q4.isAnagrams("adc", "abc"));
        assertTrue(Q4.isAnagrams("a", "a"));
        assertFalse(Q4.isAnagrams("a", null));
        assertFalse(Q4.isAnagrams("", null));
        assertTrue(Q4.isAnagrams(null, null));

        assertTrue(Q4.isAnagrams2("abc", "cba"));
        assertTrue(Q4.isAnagrams2("abc", "abc"));
        assertFalse(Q4.isAnagrams2("abc", "ca"));
        assertFalse(Q4.isAnagrams2("adc", "abc"));
        assertTrue(Q4.isAnagrams2("a", "a"));
        assertFalse(Q4.isAnagrams2("a", null));
        assertFalse(Q4.isAnagrams2("", null));
        assertTrue(Q4.isAnagrams2(null, null));

        assertTrue(Q4.isAnagrams3("abc", "cba"));
        assertTrue(Q4.isAnagrams3("abc", "abc"));
        assertFalse(Q4.isAnagrams3("abc", "ca"));
        assertFalse(Q4.isAnagrams3("adc", "abc"));
        assertTrue(Q4.isAnagrams3("a", "a"));
        assertFalse(Q4.isAnagrams3("a", null));
        assertFalse(Q4.isAnagrams3("", null));
        assertTrue(Q4.isAnagrams3("", ""));
        assertTrue(Q4.isAnagrams3(null, null));
    }

    @Test
    public void testReplaceSpaces_1_5(){
        assertEquals("Mr%20John%20Smith", Q5.replaceSpaces("Mr John Smith"));
        assertEquals("", Q5.replaceSpaces(""));
        assertNull(Q5.replaceSpaces(null));
        assertEquals("%20MrJohnSmith", Q5.replaceSpaces(" MrJohnSmith"));
        assertEquals("%20%20", Q5.replaceSpaces("  "));
    }

    @Test
    public void testReplaceSpaces_1_6(){
        int[][] a = {{1, 2, 3},
                {11, 22, 33},
                {5, 4, 3}};

        int[][] b = {{5, 11, 1},
                {4, 22, 2},
                {3,33, 3,}};

        assertTrue(Arrays.deepEquals(Q6.rotate(a), b));

        Q6.rotateInPlace(a);
        assertTrue(Arrays.deepEquals(a, b));
    }

    @Test
    public void testSetZeros_1_7(){
        int[][] a = {{1, 2, 3},
                {11, 1, 33},
                {5, 0, 3}};

        int[][] b = {{1, 0, 3},
                {11, 0, 33},
                {0, 0, 0}};

        Q7.setZeros(a);

        assertTrue(Arrays.deepEquals(a, b));

        a = new int[][]{{1, 2, 3},
                {11, 1, 33},
                {5, 0, 3}};

        Q7.setZeros2(a);

        assertTrue(Arrays.deepEquals(a, b));
    }

    @Test
    public void testIsRotation_1_8(){
        assertTrue(Q8.isRotation("waterbottle", "erbottlewat"));
    }
}