package com.atetc;

import com.atetc.other.trees.*;
import com.atetc.structures.Tree;
import com.atetc.other.trees.Q1;
import com.atetc.other.trees.Q2;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTrees {

    @Test
    public void testIsAncestor_1(){
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

        assertTrue(!Q1.isAncestor(null, null));
        assertTrue(!Q1.isAncestor(null, node302));
        assertTrue(!Q1.isAncestor(node3, null));
        assertTrue(!Q1.isAncestor(node3, node3));
        assertTrue(Q1.isAncestor(node3, node302));
        assertTrue(!Q1.isAncestor(node3, node401));
    }

    @Test
    public void test_2(){
        Tree.Node<Integer> node1 = new Tree.Node<>(1);
        Tree.Node<Integer> node2 = new Tree.Node<>(2);
        Tree.Node<Integer> node3 = new Tree.Node<>(3);

        Tree.Node<Integer> node201 = new Tree.Node<>(201);
        Tree.Node<Integer> node202 = new Tree.Node<>(202);

        Tree<Integer> tree = new Tree<>(0);
        tree.getRoot().addChildren(node1, node2, node3);
        node2.addChildren(node201, node202);

        assertTrue(Q2.getNumberOfEvenDistanceUniqueSelections(null) == 0);
        assertTrue(Q2.getNumberOfEvenDistanceUniqueSelections(tree) == 5);
    }
}