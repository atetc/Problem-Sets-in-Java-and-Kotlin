package atetc;

import atetc.other.trees.binary.*;
import atetc.structures.BinaryTree;
import atetc.structures.BinaryTree.Node;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;

public class TestBinaryTrees {

    @Test
    public void testBuildInwardSpiralArrayFromBinaryTree_1(){
        assertTrue(Q1.buildInwardSpiralArray(null) == null);

        BinaryTree<Integer> tree = new BinaryTree<>(1);
        assertThat(Q1.buildInwardSpiralArray(tree), CoreMatchers.<List<Integer>>is(new ArrayList<>(Collections.singletonList(1))));

        tree.root.left = new Node<>(2);
        assertThat(Q1.buildInwardSpiralArray(tree), CoreMatchers.<List<Integer>>is(new ArrayList<>(Arrays.asList(1, 2))));

        tree.root.right = new Node<>(3);
        assertThat(Q1.buildInwardSpiralArray(tree), CoreMatchers.<List<Integer>>is(new ArrayList<>(Arrays.asList(1, 3, 2))));

        tree.root.left.left = new Node<>(4);
        tree.root.left.right = new Node<>(5);
        tree.root.right.right = new Node<>(7);
        assertThat(Q1.buildInwardSpiralArray(tree), CoreMatchers.<List<Integer>>is(new ArrayList<>(Arrays.asList(1, 7, 5, 4, 2, 3))));

        tree.root.left.left.left = new Node<>(10);
        tree.root.left.left.right = new Node<>(11);
        tree.root.right.right.right = new Node<>(13);
        assertThat(Q1.buildInwardSpiralArray(tree), CoreMatchers.<List<Integer>>is(new ArrayList<>(Arrays.asList(1, 13, 11,10, 2, 3, 7, 5, 4))));
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

    @Test
    public void testIsBST_3(){
        BinaryTree<Integer> tree = null;
        assertTrue(!Q3.isBST(tree));

        tree = new BinaryTree<>(2);
        assertTrue(Q3.isBST(tree));

        tree = new BinaryTree<>(2);
        tree.root.setChild(1, 3);
        assertTrue(Q3.isBST(tree));

        tree = new BinaryTree<>(2);
        tree.root.setChild(1, 4);
        tree.root.right.setChild(3, 5);
        assertTrue(Q3.isBST(tree));

        tree = new BinaryTree<>(2);
        tree.root.setChild(1, 4);
        tree.root.right.setChild(1, 5);
        assertTrue(!Q3.isBST(tree));
    }
}