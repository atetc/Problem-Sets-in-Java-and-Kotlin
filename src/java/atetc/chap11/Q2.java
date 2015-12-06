package atetc.chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static atetc.helpers.Printer.printArray;

/**
 * Write a method to sort an array of strings so that all the
 * anagrams are next to each other.
 */
public class Q2 {
    public static void sortStrings(String[] strings) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (String s: strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        int i = 0;
        for (String key : map.keySet()) {
            for (String s : map.get(key)) {
                strings[i++] = s;
            }
        }
    }

    //TEST----------------------------------
    public static void main(String[] args) {
        String[] strings = {"acb", "ijh", "abc", "iop", "cab", "pio", "hij"};
        sortStrings(strings);
        printArray(strings);
    }
}
