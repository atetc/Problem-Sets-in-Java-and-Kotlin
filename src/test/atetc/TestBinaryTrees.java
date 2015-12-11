package atetc;

import atetc.other.trees.binary.*;
import atetc.structures.BinaryTree;
import atetc.structures.BinaryTree.Node;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestBinaryTrees {

    @Test
    public void testBinaryTreeFromInwardSpiralArray_1(){

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
    public void testBuildBSTFromSortedArray_2(){
        BinaryTree<Integer> tree = new BinaryTree<>(2);

        Node<Integer> root = tree.getRoot();
        root.setChild(1, 3);

        assertTrue(Q2.getBSTFromSortedArray(null) == null);
        assertTrue(Q2.getBSTFromSortedArray(new int[]{}) == null);
        assertTrue(Q2.getBSTFromSortedArray(new int[]{1}).equals(new BinaryTree<>(1)));
        assertTrue(Q2.getBSTFromSortedArray(new int[]{1, 2, 3}).equals(tree));

        root.getRight().setRight(new Node<>(4));
        assertTrue(Q2.getBSTFromSortedArray(new int[]{1, 2, 3, 4}).equals(tree));

        root.setLeft(new Node<>(0));
        root.getLeft().setRight(new Node<>(1));
        root.getLeft().setLeft(null);

        root.setRight(new Node<>(4));
        root.getRight().setLeft(new Node<>(3));
        root.getRight().setRight(new Node<>(5));

        assertTrue(Q2.getBSTFromSortedArray(new int[]{0, 1, 2, 3, 4, 5}).equals(tree));
    }
}