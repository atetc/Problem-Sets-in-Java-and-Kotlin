package atetc.set24;

import java.util.ArrayList;
import java.util.List;

/**
 * Amazon interview.
 *
 * Write a method that takes in a positive integer, return the number of 2s between 0 and the input number.
 * If the input value given is 13, it should return 2 as the number 2 and 12 are between 0 and 13.
 * If the input value given is 21, it should return 3 as the number 2,12 and 20 are between 0 and 21.
 */
public class Q2 {

    public static List<Integer> getNumberOf2s(int n) {
        if (n <= 2) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (containDigitTwo(i)) {
                result.add(i);
            }
        }

        return result;
    }

    private static boolean containDigitTwo(int number) {
        while(number > 0) {
            if (number % 10 == 2) {
                return true;
            }

            number /= 10;
        }
        return false;
    }
}