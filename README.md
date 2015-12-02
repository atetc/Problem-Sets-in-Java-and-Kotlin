##Set 1

[SET 1.1] (src/java/atetc/set1/Q1.java) You've got an array of ints 2,2,3,3,4,5,5... Find an element without a pair.

[SET 1.2] (src/java/atetc/set1/Q2.java) 

                                        Watson gives Sherlock an array A of length N. Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero.

                                        Formally, find an i, such that, A1+A2...Ai-1 =Ai+1+Ai+2...AN.
                                         
                                         Input Format:
                                         The first line contains T, the number of test cases. For each test case, the first line contains N, the number of elements in the array A. The second line for each test case contains N space-separated integers, denoting the array A.
                                         
                                         Output Format:
                                         For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.
                                         
                                         Constraints:
                                         1 ≤ T ≤ 10
                                         1 ≤N ≤ 10^5
                                         1 ≤Ai ≤ 2 × 10^4
                                         1 ≤ i ≤ N
                                         
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
                                         
[SET 1.3] (src/java/atetc/set1/Q3.java) 

                                         Given N integers, count the number of pairs of integers whose difference is K.
                                        
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
                                        
[SET 1.4] (src/java/atetc/set1/Q4.java) Place N points in 3d, so that none 3 are on one line.
                                        Input: integer N.
                                        Output: 3 * N coordinates of points, so that no 3 of the points are on one line.

###Testing

[Coverage by tests 1.1 - 1.4](src/test/atetc/TestSet1.java)

##Set 2

[SET 2.1] (src/java/atetc/set2/Q1.java) 

                                        Vasya has found a strange device. On the front panel of a device there are: a red button, a blue button and a display showing some positive integer. After clicking the red button, device multiplies the displayed number by two. After clicking the blue button, device subtracts one from the number on the display. If at some point the number stops being positive, the device breaks down. The display can show arbitrarily large numbers. Initially, the display shows number n.
                                        
                                        Bob wants to get number m on the display. What minimum number of clicks he has to make in order to achieve this result?
                                        
                                        Input
                                        The first and the only line of the input contains two distinct integers n and m (1 ≤ n, m ≤ 104), separated by a space .
                                        
                                        Output
                                        Print a single number — the minimum number of times one needs to push the button required to get the number m out of number n.
                                        
                                        Sample test(s)
                                        input
                                        4 6
                                        output
                                        2
                                        input
                                        10 1
                                        output
                                        9
                                        Note
                                        In the first example you need to push the blue button once, and then push the red button once.
                                        
                                        In the second example, doubling the number is unnecessary, so we need to push the blue button nine times.

[SET 2.2] (src/java/atetc/set2/Q2.java) You've got an array of ints (array is NOT sorted). Find two elements without a pair.

[SET 2.3] (src/java/atetc/set2/Q3.java) You've got an array of ints (array is NOT sorted). Find two elements without a pair.

###Testing

[Coverage by tests 2.1 - 2.3](src/test/atetc/TestSet2.java)