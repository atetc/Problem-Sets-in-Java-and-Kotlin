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

[Coverage by tests 1.1 - 1.8](src/test/atetc/TestSet1.java)
