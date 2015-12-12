package atetc;

import atetc.other.trees.binary.*;
import atetc.structures.BinaryTree;
import atetc.structures.BinaryTree.Node;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TestBinaryTrees {

    @Test
    public void testBinaryTreeFromInwardSpiralArray_1(){
        int[][] print;

        assertTrue(Q1.printTreeFromSpiralArray(null, 0) == null);
        assertTrue(Q1.printTreeFromSpiralArray(new int[]{}, 0) == null);

        print = new int[][]{{1}};
        assertTrue(Arrays.deepEquals(Q1.printTreeFromSpiralArray(new int[]{1}, 1), print));

        print = new int[][]{
                {1},
                {2, 3}
        };
        assertTrue(Arrays.deepEquals(Q1.printTreeFromSpiralArray(new int[]{1, 3, 2}, 2), print));

        print = new int[][]{
                {1},
                {2, 3},
                {4, 5, 6, 7}
        };
        assertTrue(Arrays.deepEquals(Q1.printTreeFromSpiralArray(new int[]{1, 7, 6, 5, 4, 2, 3}, 3), print));

        print = new int[][]{
                {1},
                {2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14, 15}
        };
        assertTrue(Arrays.deepEquals(Q1.printTreeFromSpiralArray(new int[]{1, 15, 14, 13, 12, 11, 10, 9, 8, 2, 3, 7, 6, 5, 4}, 4), print));

        print = new int[][]{
                {1},
                {2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}
        };
        assertTrue(Arrays.deepEquals(Q1.printTreeFromSpiralArray(new int[]{1, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 2, 3, 15, 14, 13, 12, 11, 10, 9, 8, 4, 5, 6, 7}, 5), print));
    }

    @Test
    public void testBuildBSTFromSortedArray_2(){
        BinaryTree<Integer> tree = new BinaryTree<>(2);

        Node<Integer> root = tree.root;
        root.setChild(1, 3);

        assertTrue(Q2.getBSTFromSortedArray(null) == null);
        assertTrue(Q2.getBSTFromSortedArray(new int[]{}) == null);
        assertTrue(Q2.getBSTFromSortedArray(new int[]{1}).equals(new BinaryTree<>(1)));
        assertTrue(Q2.getBSTFromSortedArray(new int[]{1, 2, 3}).equals(tree));

        root.right.right = new Node<>(4);
        assertTrue(Q2.getBSTFromSortedArray(new int[]{1, 2, 3, 4}).equals(tree));

        root.left = new Node<>(0);
        root.left.right = new Node<>(1);
        root.left.left = null;

        root.right = new Node<>(4);
        root.right.left = new Node<>(3);
        root.right.right = new Node<>(5);

        assertTrue(Q2.getBSTFromSortedArray(new int[]{0, 1, 2, 3, 4, 5}).equals(tree));
    }
}