package atetc.other.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * From set 1
 * Given N integers, count the number of pairs of integers whose difference is K.

 Input Format

 The first line contains N and K.
 The second line contains N numbers of the set. All the N numbers are unique.

 Output Format

 An integer that tells the number of pairs of integers whose difference is K.

 Constraints:
 N ≤ 10^5
 0< K <10^9
 Each integer will be greater than 0 and at least K smaller than 231−1.

 Sample Input

 5 2
 1 5 3 4 2
 Sample Output

 3
 Explanation

 There are 3 pairs of integers in the set with a difference of 2.
 */

public class Q4 {

    public static Integer getCountOfPairsWithDifference(int[] arr, int diff) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        Set<Integer> set = new HashSet<>();
        for (int element : arr) {
            set.add(element);
        }

        int result = 0;
        for(Integer value: set){
            if (set.contains(value + diff)) {
                result++;
            }
        }

        return result;
    }
}