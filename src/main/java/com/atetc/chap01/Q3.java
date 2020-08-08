package com.atetc.chap01;

public class Q3 {

    public static String removeDuplicates(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }

        int charsCount[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charsCount[ch]++;
        }

        StringBuilder sb = new StringBuilder(charsCount.length);
        for (int i = 0; i < charsCount.length; i++) {
            if (charsCount[i] > 0) {
                sb.append((char)i);
            }
        }

        return sb.toString();
    }

    public static String removeDuplicates2(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }

        boolean seen[] = new boolean[256];
        StringBuilder sb = new StringBuilder(seen.length);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
