package atetc;

import atetc.other.trees.binary.*;
import atetc.structures.BinaryTree;
import atetc.structures.BinaryTree.Node;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestBinaryTrees {

    @Test
    public void testBuildBSTFromSortedArray_1(){

        BinaryTree<Integer> tree = new BinaryTree<>(1);

        Node<Integer> root = tree.getRoot();
        root.setChild(2, 3);

        root.getLeft().setChild(4, 5);
        root.getRight().setChild(6, 7);

        root.getLeft().getLeft().setChild(8, 9);
        root.getLeft().getRight().setChild(10, 11);
        root.getRight().getLeft().setChild(12, 13);
        root.getRight().getLeft().setChild(14, 15);

        int[] array = {1, 15, 14, 13, 12, 11, 10, 9, 8, 2, 3, 7, 6, 5, 4};

        assertTrue(Q1.getBinaryTreeFromInwardSpiralArray(null) == null);
        assertTrue(Q1.getBinaryTreeFromInwardSpiralArray(new int[]{}) == null);
        assertTrue(Q1.getBinaryTreeFromInwardSpiralArray(new int[]{1}).equals(new BinaryTree<>(1)));
        assertTrue(Q1.getBinaryTreeFromInwardSpiralArray(array).equals(tree));
    }

    @Test
    public void testBinaryTreeFromInwardSpiralArray_2(){

        BinaryTree<Integer> tree = new BinaryTree<>(1);

        Node<Integer> root = tree.getRoot();
        root.setChild(2, 3);

        root.getLeft().setChild(4, 5);
        root.getRight().setChild(6, 7);

        root.getLeft().getLeft().setChild(8, 9);
        root.getLeft().getRight().setChild(10, 11);
        root.getRight().getLeft().setChild(12, 13);
        root.getRight().getLeft().setChild(14, 15);

        int[] array = {1, 15, 14, 13, 12, 11, 10, 9, 8, 2, 3, 7, 6, 5, 4};

        assertTrue(Q1.getBinaryTreeFromInwardSpiralArray(null) == null);
        assertTrue(Q1.getBinaryTreeFromInwardSpiralArray(new int[]{}) == null);
        assertTrue(Q1.getBinaryTreeFromInwardSpiralArray(new int[]{1}).equals(new BinaryTree<>(1)));
        assertTrue(Q1.getBinaryTreeFromInwardSpiralArray(array).equals(tree));
    }
}