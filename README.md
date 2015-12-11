# 1. http://www.amazon.com/Cracking-Coding-Interview-Fourth-Edition/dp/145157827X book solutions in Java with test coverage.

##Chapter 1

###Solutions:

[1.1](src/java/atetc/chap01/Q1.java) Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?

[1.2](src/java/atetc/chap01/Q2.c) Write code to reverse a C-Style String. (C-String means that “abcd” is represented as !ve characters, including the null character.)

[1.3](src/java/atetc/chap01/Q3.java) Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer. NOTE: One or two additional variables are fine. An extra copy of the array is not.

[1.4](src/java/atetc/chap01/Q4.java) Write a method to decide if two strings are anagrams or not.

[1.5](src/java/atetc/chap01/Q5.java) Write a method to replace all spaces in a string with "%20".

[1.6](src/java/atetc/chap01/Q6.java) Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

[1.7](src/java/atetc/chap01/Q7.java) Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0

[1.8](src/java/atetc/chap01/Q8.java) Assume you have a method isSubstring which checks if one word is a substring of another Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (i.e. , “waterbottle” is a rotation of “erbottlewat”)

###Testing

[Coverage by tests 1.1 - 1.8](src/test/atetc/TestChap1.java)

##Chapter 2:

###Solutions

[2.1](src/java/atetc/chap02/Q1.java) Write code to remove duplicates from an unsorted linked list.

[2.2](src/java/atetc/chap02/Q2.java) Implement an algorithm to find the nth to last element of a singly linked list

[2.3](src/java/atetc/chap02/Q3.java) Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node. 
EXAMPLE Input: the node ‘c’ from the linked list a->b->c->d->e Result: nothing is returned, but the new linked list looks like a->b->d->e

[2.4](src/java/atetc/chap02/Q4.java) You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1’s digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list. 
EXAMPLE Input: (3 -> 1 -> 5), (5 -> 9 -> 2) Output: 8 -> 0 -> 8 i.e. 513 + 295 = 808

[2.5](src/java/atetc/chap02/Q5.java) Given a circular linked list, implement an algorithm which returns node at the beginning of the loop.
DEFINITION: Circular Link list: A(corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
EXAMPLE: Input: A->B->C->D->E->C[the same C as earlier] Output: C

###Testing

[Coverage by tests 2.1 - 2.5](src/test/atetc/TestChap2.java)

##Chapter 3:

###Solutions

[3.1](src/java/atetc/chap03/Q1.java) Describe how you could use a single array to implement three stacks.

[3.2](src/java/atetc/chap03/Q2.java) How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element? Push, pop and min should all operate in O(1) time.

[3.3](src/java/atetc/chap03/Q3.java) Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore, in real life, we would likely start a new stack when the previous stack exceeds some threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of several stacks and should create a new stack once the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack (that is, pop() should return the same values as it would if there were just a single stack).
FOLLOW UP
Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.

[3.4](src/java/atetc/chap03/Q4.java) In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle starts with disks sorted disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one). You have the following constraints:
* (1) Only one disk can be moved at a time.
* (2) A disk is slid off the top of one tower onto the next tower.
* (3) A disk can only be placed on top of a larger disk.
Write a program to move the disks from the first tower to the last using stacks.

[3.5](src/java/atetc/chap03/Q5.java) Implement a MyQueue class which implements a queue using two stacks.

[3.6](src/java/atetc/chap03/Q6.java) Write a program to sort a stack in ascending order (with biggest items on top). You may use at most one additional stack to hold items, but you may not copy the elements into any other data structure (such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.

###Testing

[Coverage by tests 3.1 - 3.6](src/test/atetc/TestChap3.java)

##Chapter 4:

###Solutions

[4.1](src/java/atetc/chap04/Q1.java) Implement a function to check if a binary tree is balanced. For the purposes of this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any node never differ by more than one.

[4.2](src/java/atetc/chap04/Q2.java) Given a directed graph, design an algorithm to find out whether there is a route between two nodes.

[4.3](src/java/atetc/chap04/Q3.java) Given a sorted (increasing order) array with unique integer elements, write an algorithm to create a binary search tree with minimal height.

[4.4](src/java/atetc/chap04/Q4.java) Given a binary search tree, design an algorithm which creates a linked list of all the nodes at each depth.

[4.5](src/java/atetc/chap04/Q5.java) Write an algorithm to find the 'next' node (i.e., in-order successor) of a given node in a binary search tree. You may assume that each node has a link to its parent.

[4.6](src/java/atetc/chap04/Q6.java) Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not necessarily a binary search tree.

[4.7](src/java/atetc/chap04/Q7.java) You have two very large binary trees: Tl, with millions of nodes, and T2, with hundreds of nodes. Create an algorithm to decide if T2 is a subtree of Tl.

[4.8](src/java/atetc/chap04/Q8.java) You are given a binary tree in which each node contains a value. Design an algorithm to print all paths which sum up to that value. Note that it can be any path in tree - it does not have to start at the root

###Testing

[Coverage by tests 4.1 - 4.8](src/test/atetc/TestChap4.java)

##Chapter 5:

###Solutions

[5.1](src/java/atetc/chap05/Q1.java) You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to set all bits between i and j in N equal to M (e.g., M becomes a substring of located at i and starting at j). 
EXAMPLE Input: N = 10000000000, M = 10011, i = 2, j = 6 Output: N = 10001001100
                                                       
[5.2](src/java/atetc/chap05/Q2.java) Given a (decimal e.g. 3.72) number that is passed in as a string, print the binary representation. If the number can not be represented accurately in binary, print "ERROR".
                                                       
[5.3](src/java/atetc/chap05/Q3.java) Given an integer, print the next smallest and the next largest number that have the same number of 1 bits in their binary representation.

[5.4](src/java/atetc/chap05/Q4.java) Explain what the following code does: ((n & (n-1)) == 0).

[5.5](src/java/atetc/chap05/Q5.java) Write a function to determine the number of bits required to convert integer A to integer B.
EXAMPLE
Input:  31, 14 (11111, 01110)
Output: 2

[5.6](src/java/atetc/chap05/Q6.java) Write a program to swap odd and even bits in an integer with as few instructions as possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on).

[5.7](src/java/atetc/chap05/Q7.java) An array A contains all the integers from 0 to n, except for one number which is missing. In this problem, we cannot access an entire integer in A with a single operation. The elements of A are represented in binary, and the only operation we can use to access them is "fetch the j-th bit of A[i]," which takes constant time. Write code to find the missing integer. Can you do it in 0(n) time?

###Testing

[Coverage by tests 5.1 - 5.7](src/test/atetc/TestChap5.java) 

##Chapter 7:

###Solutions

[7.1](src/java/atetc/chap07/Q1.java) Design the data structures for a generic deck of cards. Explain how you would subclass it to implement particular card games.

###Testing

[Coverage by tests 7.1 - 7.7](src/test/atetc/TestChap6.java) 


#2. Other problems (not from book)

##Arrays:

###Solutions

[Arrays.1](src/java/atetc/other/arrays/Q1.java) You are given an array of integers of size N. Can you find the sum of the elements in the array?
 
[Arrays.2](src/java/atetc/other/arrays/Q2.java) You've got an sorted array of ints 2,2,3,3,4,5,5... Find an element without a pair.

[Arrays.3](src/java/atetc/other/arrays/Q3.java) Watson gives Sherlock an array A of length N. Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero.
                                                 Formally, find an i, such that, A1+A2...Ai-1 =Ai+1+Ai+2...AN.

[Arrays.2](src/java/atetc/other/arrays/Q4.java) Given N integers, count the number of pairs of integers whose difference is K.

###Testing

[Coverage by tests arrays problems](src/test/atetc/TestArrays.java) 


##Matrix:

###Solutions

[Matrix.1](src/java/atetc/other/matrix/Q1.java) Given a square matrix of size N×N, calculate the absolute difference between the sums of its diagonals.

###Testing

[Coverage by tests matrix problems](src/test/atetc/TestMatrix.java)


##Points in 3D:

###Solutions

[PointsIn3D.1](src/java/atetc/other/points3d/Q1.java) 

###Testing

[Coverage by tests matrix problems](src/test/atetc/TestMatrix.java)


##Trees:

###Solutions

[Trees.1](src/java/atetc/other/trees/Q1.java) You've got a tree (structure can be random). 
                                              For two given nodes you should answer if the first of them is the ancestor of the second.

[BinaryTrees.1](src/java/atetc/other/trees/binary/Q1.java) Given a binary tree print it in inward spiral order i.e first print level 1, then level n, then level 2, then n-1 and so on.
                                                           Build tree from this print.
 
[BinaryTrees.2](src/java/atetc/other/trees/binary/Q2.java) Please build BST from sorted array of integers.

###Testing

[Coverage by tests trees problems](src/test/atetc/TestTrees.java)
[Coverage by tests binary trees problems](src/test/atetc/TestBinaryTrees.java)


##Rectangles:

###Solutions

[Rectangles.1](src/java/atetc/other/rectangles/Q1.java) Get sum of area of two rectilinear rectangles. 
                                                        If rectangles intersect, the area of their intersection should be counted only once. 

###Testing

[Coverage by tests matrix problems](src/test/atetc/TestMatrix.java)


##LinkedLists:

###Solutions

[LinkedLists.1](src/java/atetc/other/linkedlists/Q1.java) 

###Testing

[Coverage by tests matrix problems](src/test/atetc/TestLinkedLists.java)


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

###Testing

[Coverage by tests 2.1 - 2.3](src/test/atetc/TestSet2.java)

##Set 24

[SET 24.1] (src/java/atetc/set24/Q1.java) Given the number N with up to 10^6 digits and M.
                                            Find the number of partitions where each partition is divisible by M.
                                            If answer is larger then (10^9+7), find the answer modulo (10^9+7)
                                            Example: for input N=12123, M=3 partitions are: [12123], [12][123],[12][12][3],[1212][3]
                                             
[SET 24.2] (src/java/atetc/set24/Q2.java) Amazon interview.
                                          Write a method that takes in a positive integer, return the number of 2s between 0 and the input number.
                                          If the input value given is 13, it should return 2 as the number 2 and 12 are between 0 and 13.
                                          If the input value given is 21, it should return 3 as the number 2,12 and 20 are between 0 and 21.

###Testing

[Coverage by tests 24.1 - 24.4](src/test/atetc/TestSet24.java)