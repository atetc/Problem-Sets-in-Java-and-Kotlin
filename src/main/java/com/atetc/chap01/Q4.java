package com.atetc.chap01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * (Assume comparison is case-sensitive, space-significant, ASCII-based.)
 */

public class Q4 {

    public static boolean isAnagrams(String first, String second) {
        if (first == null) {
            return second == null;
        }

        if (second == null) {
            return false;
        }

        if (first.isEmpty() && second.isEmpty()) {
            return true;
        }

        if (first.length() != second.length()) {
            return false;
        }

        char[] word1 = first.toCharArray();
        Arrays.sort(word1);

        char[] word2 = second.toCharArray();
        Arrays.sort(word2);

        return Arrays.equals(word1, word2);

    }

    public static boolean isAnagrams2(String first, String second) {
        if (first == null) {
            return second == null;
        }

        if (second == null) {
            return false;
        }

        if (first.isEmpty() && second.isEmpty()) {
            return true;
        }

        if (first.length() != second.length()) {
            return false;
        }

        if (first.isEmpty() && second.isEmpty()) {
            return true;
        }

        if (first.length() != second.length()) {
            return false;
        }

        int[] charCount = new int[256];
        for (int i = 0; i < first.length(); ++i) {
            ++charCount[first.charAt(i)];
        }

        for (int i = 0; i < second.length(); ++i) {
            if (--charCount[second.charAt(i)] < 0)
                return false;
        }

        return true;
    }

    public static boolean isAnagrams3(String first, String second) {
        if (first == null) {
            return second == null;
        }

        if (second == null) {
            return false;
        }

        if (first.isEmpty() && second.isEmpty()) {
            return true;
        }

        if (first.length() != second.length()) {
            return false;
        }

        if (first.isEmpty() && second.isEmpty()) {
            return true;
        }

        if (first.length() != second.length()) {
            return false;
        }

        char[] word1 = first.toCharArray();
        char[] word2 = second.toCharArray();

        char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Map<Character, Integer> occurrencesMap = new HashMap<>();
        for (char l : letters) {
            occurrencesMap.put(l, 0);
        }

        for(int i = 0; i < word1.length; i++){
            char char1 = word1[i];
            Integer nrOfCharsInLeft = occurrencesMap.get(char1);
            occurrencesMap.put(char1, ++nrOfCharsInLeft);

            char char2 = word2[i];
            Integer nrOfCharsInRight = occurrencesMap.get(char2);
            occurrencesMap.put(char2, --nrOfCharsInRight);
        }

        for (Integer occurrencesNr : occurrencesMap.values()){
            if (occurrencesNr != 0){
                return false;
            }
        }

        return true;
    }
}