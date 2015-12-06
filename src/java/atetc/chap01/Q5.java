package atetc.chap01;

/**
 * Write a method to replace all spaces in a string with'%20'. You may assume that
 * the string has sufficient space at the end of the string to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform this
 * operation in place.)
 * EXAMPLE
 * Input: "Mr John Smith     "
 * Output: "Mr%20John%20Smith"
 */

public class Q5 {

    public static String replaceSpaces(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }

        char[] chars = string.toCharArray();
        final char[] REPLACED_PHRASE = {'%', '2', '0'};

        int spaceCounter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                spaceCounter++;
        }

        char[] newArray = new char[chars.length + 2 * spaceCounter];
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                for (int j = 0; j < REPLACED_PHRASE.length; j++) {
                    newArray[k++] = REPLACED_PHRASE[j];
                }
            } else {
                newArray[k++] = chars[i];
            }
        }

        return String.valueOf(newArray);
    }
}
