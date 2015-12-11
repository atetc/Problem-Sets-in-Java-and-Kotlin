package atetc;

import atetc.other.trees.*;
import atetc.structures.Tree;
import atetc.structures.Tree.Node;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTrees {

    @Test
    public void testIsAncestor_1(){
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);

        Node<Integer> node301 = new Node<>(301);
        Node<Integer> node302 = new Node<>(302);
        Node<Integer> node401 = new Node<>(401);

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
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);

        Node<Integer> node201 = new Node<>(201);
        Node<Integer> node202 = new Node<>(202);

        Tree<Integer> tree = new Tree<>(0);
        tree.getRoot().addChildren(node1, node2, node3);
        node2.addChildren(node201, node202);

        assertTrue(Q2.getNumberOfEvenDistanceUniqueSelections(null) == 0);
        assertTrue(Q2.getNumberOfEvenDistanceUniqueSelections(tree) == 5);
    }
}