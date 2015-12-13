package atetc.other.strings;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * From Akvelon set 26
 *
 * Google interview

 We have a long string. We label some substrings with tags.

 A tag entry is [startIndex, endIndex, tag].
 Query: 1 or more tags
 Output: all blocks/ranges with all queried tags.
 Example tag entries:

 [23, 72, 0] // label [23, 72) with tag 0
 [34, 53, 1] // label [34, 53) with tag 1
 [100, 128, 0]

 Query and Output:

 0 => [23, 72], [100, 128]
 0,1 => [34,53] // [34, 53) matches both tag 0 and 1

 */

public class Q1 {

    public static String[] query(String s, int[][] tags, int[] tagNumbers) {
        BitSet bitSet = new BitSet(0);

        for (int tagNumber : tagNumbers) {
            BitSet tempSet = new BitSet(s.length());
            for (int[] tag : tags) {
                if (tag[2] == tagNumber) {
                    for (int i = tag[0]; i <= tag[1]; i++) {
                        tempSet.set(i);
                    }
                }
            }

            if (bitSet.length() == 0) {
                bitSet = tempSet;
            } else {
                bitSet.and(tempSet);
            }
        }

        char[] chars = s.toCharArray();
        List<String> list = new ArrayList<>();

        int start = bitSet.nextSetBit(0);
        while (start != -1) {
            int end = start;
            while (end < bitSet.length()) {
                int next = bitSet.nextSetBit(end + 1);
                if (next == -1 | (next - end) != 1) {
                    break;
                }
                end = next;
            }
            list.add(String.copyValueOf(chars, start, end - start + 1));
            start = bitSet.nextSetBit(end + 1);
        }

        return list.toArray(new String[list.size()]);
    }
}