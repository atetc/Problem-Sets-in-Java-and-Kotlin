package atetc;

/**
 * Created by Atetc on 10.11.2015.
 */

import org.junit.Test;
import wzhishen.chap01.*;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TestChap1 {

    @Test
    public void testUniqueString_1_1(){
        assertTrue(Q1.hasUniqueChars("dfsjh"));
        assertTrue(!Q1.hasUniqueChars("dfseejh"));
        assertTrue(Q1.hasUniqueChars(""));
        assertTrue(Q1.hasUniqueChars(null));

        assertTrue(Q1.hasUniqueChars2("dfsjh"));
        assertTrue(!Q1.hasUniqueChars2("dfseejh"));
        assertTrue(Q1.hasUniqueChars2(""));
        assertTrue(Q1.hasUniqueChars2(null));
    }

    @Test
    public void testRemoveDuplicatesString_1_3(){
        assertTrue(Q3.removeDuplicates("aaaa").equals("a"));
        assertTrue(Q3.removeDuplicates("abcd").equals("abcd"));
        assertTrue(Q3.removeDuplicates(null) == null);
        assertTrue(Q3.removeDuplicates("aaabbb").equals("ab"));

        assertTrue(Q3.removeDuplicates2("aaaa").equals("a"));
        assertTrue(Q3.removeDuplicates2("abcd").equals("abcd"));
        assertTrue(Q3.removeDuplicates2(null) == null);
        assertTrue(Q3.removeDuplicates2("aaabbb").equals("ab"));
    }

    @Test
    public void testAnagramString_1_4(){
        assertTrue(Q4.isAnagrams("abc", "cba"));
        assertTrue(Q4.isAnagrams("abc", "abc"));
        assertTrue(!Q4.isAnagrams("abc", "ca"));
        assertTrue(!Q4.isAnagrams("adc", "abc"));
        assertTrue(Q4.isAnagrams("a", "a"));
        assertTrue(!Q4.isAnagrams("a", null));
        assertTrue(!Q4.isAnagrams("", null));
        assertTrue(Q4.isAnagrams(null, null));

        assertTrue(Q4.isAnagrams2("abc", "cba"));
        assertTrue(Q4.isAnagrams2("abc", "abc"));
        assertTrue(!Q4.isAnagrams2("abc", "ca"));
        assertTrue(!Q4.isAnagrams2("adc", "abc"));
        assertTrue(Q4.isAnagrams2("a", "a"));
        assertTrue(!Q4.isAnagrams2("a", null));
        assertTrue(!Q4.isAnagrams2("", null));
        assertTrue(Q4.isAnagrams2(null, null));

        assertTrue(Q4.isAnagrams3("abc", "cba"));
        assertTrue(Q4.isAnagrams3("abc", "abc"));
        assertTrue(!Q4.isAnagrams3("abc", "ca"));
        assertTrue(!Q4.isAnagrams3("adc", "abc"));
        assertTrue(Q4.isAnagrams3("a", "a"));
        assertTrue(!Q4.isAnagrams3("a", null));
        assertTrue(!Q4.isAnagrams3("", null));
        assertTrue(Q4.isAnagrams3("", ""));
        assertTrue(Q4.isAnagrams3(null, null));
    }

    @Test
    public void testReplaceSpaces_1_5(){
        assertTrue(Q5.replaceSpaces("Mr John Smith").equals("Mr%20John%20Smith"));
        assertTrue(Q5.replaceSpaces("").equals(""));
        assertTrue(Q5.replaceSpaces(null) == null);
        assertTrue(Q5.replaceSpaces(" MrJohnSmith").equals("%20MrJohnSmith"));
        assertTrue(Q5.replaceSpaces("  ").equals("%20%20"));
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