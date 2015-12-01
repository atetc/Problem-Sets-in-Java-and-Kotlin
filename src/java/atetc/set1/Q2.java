package atetc.set1;

/**
 * Watson gives Sherlock an array A of length N. Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero.
 Formally, find an i, such that, A1+A2...Ai-1 =Ai+1+Ai+2...AN.

 Input Format:
 The first line contains T, the number of test cases. For each test case, the first line contains N, the number of elements in the array A. The second line for each test case contains N space-separated integers, denoting the array A.

 Output Format:
 For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.

 Constraints:
 1≤T≤10
 1≤N≤105
 1≤Ai ≤2×104
 1≤i≤N

 Sample Input:
 2
 3
 1 2 3
 4
 1 2 3 3

 Sample Output:
 NO
 YES
 Explanation
 For the first test case, no such index exists.
 For the second test case, A[1]+A[2]=A[4], therefore index 3 satisfies the given conditions.
 */

public class Q2 {

    public static boolean isLeftRightArraysSumEqual(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }

        int sum = 0;      // initialize sum of whole array
        int leftSum = 0; // initialize leftsum
        int i;

        /* Find sum of the whole array */
        for (i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }

        for( i = 0; i < arr.length; ++i) {
            sum -= arr[i]; // sum is now right sum for index i

            if (leftSum == sum) {
                return true;
            }

            leftSum += arr[i];
        }

        return false;
    }
}