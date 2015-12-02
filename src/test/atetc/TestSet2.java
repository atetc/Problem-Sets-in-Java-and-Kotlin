package atetc;

import atetc.set2.*;
import atetc.structures.Tree;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TestSet2 {

    @Test
    public void testFindMinimalButtonsClick_2_1(){
        assertTrue(Q1.findMinimalButtonsClick(3, 3) == 0);
        assertTrue(Q1.findMinimalButtonsClick(3, 6) == 1);
        assertTrue(Q1.findMinimalButtonsClick(3, 5) == 2);
        assertTrue(Q1.findMinimalButtonsClick(3, 2) == 1);
        assertTrue(Q1.findMinimalButtonsClick(3, 1) == 2);
        assertTrue(Q1.findMinimalButtonsClick(3, 0) == 3);
        assertTrue(Q1.findMinimalButtonsClick(3, 12) == 2);
        assertTrue(Q1.findMinimalButtonsClick(3, 11) == 3);
        assertTrue(Q1.findMinimalButtonsClick(3, 10) == 3);
    }

    @Test
    public void testFindMinimalButtonsClick_2_2(){
        assertTrue(Q2.findUnpaired(null) == null);
        assertTrue(Arrays.equals(Q2.findUnpaired(new int[] {5}), new int[] {5}));
        assertTrue(Arrays.equals(Q2.findUnpaired(new int[]{5, 1}), new int[] {1, 5}));
        assertTrue(Arrays.equals(Q2.findUnpaired(new int[]{5, 1, 5, 3}), new int[] {1, 3}));
    }

    @Test
    public void testIsAncestor_2_3(){
        Tree.Node<Integer> node1 = new Tree.Node<>(1);
        Tree.Node<Integer> node2 = new Tree.Node<>(2);
        Tree.Node<Integer> node3 = new Tree.Node<>(3);
        Tree.Node<Integer> node4 = new Tree.Node<>(4);

        Tree.Node<Integer> node301 = new Tree.Node<>(301);
        Tree.Node<Integer> node302 = new Tree.Node<>(302);
        Tree.Node<Integer> node401 = new Tree.Node<>(401);

        Tree<Integer> tree = new Tree<>(0);
        tree.getRoot().addChildren(node1, node2, node3, node4);
        node3.addChildren(node301, node302);
        node4.addChildren(node401);

        assertTrue(!Q3.isAncestor(null, null));
        assertTrue(!Q3.isAncestor(null, node302));
        assertTrue(!Q3.isAncestor(node3, null));
        assertTrue(!Q3.isAncestor(node3, node3));
        assertTrue(Q3.isAncestor(node3, node302));
        assertTrue(!Q3.isAncestor(node3, node401));
    }
}