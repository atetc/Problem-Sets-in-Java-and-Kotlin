package com.atetc;

import com.atetc.chap04.*;
import com.atetc.helpers.BinaryTreeNode;
import com.atetc.helpers.DGraph;
import com.atetc.helpers.GraphNode;
import org.junit.Test;
import com.atetc.chap04.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class TestChap4 {

    @Test
    public void testIsTreeBalanced_4_1(){
        /*
         *     4
         *    / \
         *   1   5
         *  / \
         * 2   3
         */
        BinaryTreeNode r = new BinaryTreeNode(4);
        r.right = new BinaryTreeNode(5);
        r.left = new BinaryTreeNode(1);

        r.left.left = new BinaryTreeNode(2);
        r.left.right = new BinaryTreeNode(3);

        /*
         *     4
         *    / \
         *   1   5
         *  / \
         * 2   3
         *      \
         *       6
         */

        assertTrue(Q1.isBalanced(r));
        assertTrue(Q1.isBalanced2(r));
        assertTrue(Q1.isBalanced3(r));

        r.left.right.right = new BinaryTreeNode(6);
        assertTrue(!Q1.isBalanced(r));
        assertTrue(!Q1.isBalanced2(r));
        assertTrue(!Q1.isBalanced3(r));
    }

    @Test
    public void testSingleArrayStack_4_2(){
        /*
         * 1->2
         * | /|
         * v/ |
         * v  v
         * 3->4
         */

        GraphNode n1 = new GraphNode(1);
        GraphNode n2 = new GraphNode(2);
        GraphNode n3 = new GraphNode(3);
        GraphNode n4 = new GraphNode(4);

        n1.adjacent.add(n2);
        n1.adjacent.add(n3);

        n2.adjacent.add(n3);
        n2.adjacent.add(n4);

        n3.adjacent.add(n4);

        assertTrue(Q2.DFSRecursive(n2, n4));
        Q2.resetVisited(n1, n2, n3, n4);

        assertTrue(Q2.DFSIterative(n2, n4));
        Q2.resetVisited(n1, n2, n3, n4);

        assertTrue(Q2.BFS(n2, n4));
        Q2.resetVisited(n1, n2, n3, n4);

        assertTrue(!Q2.DFSRecursive(n4, n1));
        Q2.resetVisited(n1, n2, n3, n4);

        assertTrue(!Q2.DFSIterative(n4, n1));
        Q2.resetVisited(n1, n2, n3, n4);

        assertTrue(!Q2.BFS(n4, n1));
        Q2.resetVisited(n1, n2, n3, n4);

        DGraph dGraph = new DGraph();
        dGraph.add(n1, n2, n3, n4);
        assertTrue(!Q2.dfs(dGraph, n4, n1));
    }

    @Test
    public void testSortedArrayToMinimalBST_4_3(){
        assertTrue(Q3.createBST(new int[] {}) == null);

        BinaryTreeNode treeNode = new BinaryTreeNode(0);
        assertTrue(treeNode.equals(Q3.createBST(new int[]{0})));

        treeNode = new BinaryTreeNode(0);
        treeNode.right = new BinaryTreeNode(1);
        assertTrue(treeNode.equals(Q3.createBST(new int[]{0, 1})));

        treeNode = new BinaryTreeNode(1);
        treeNode.left = new BinaryTreeNode(0);
        treeNode.right = new BinaryTreeNode(5);
        assertTrue(treeNode.equals(Q3.createBST(new int[]{0, 1, 5})));

        treeNode = new BinaryTreeNode(1);
        treeNode.left = new BinaryTreeNode(0);
        treeNode.right = new BinaryTreeNode(5);
        treeNode.right.right = new BinaryTreeNode(6);
        assertTrue(treeNode.equals(Q3.createBST(new int[]{0, 1, 5, 6})));

        treeNode = new BinaryTreeNode(5);
        treeNode.left = new BinaryTreeNode(0);
        treeNode.right = new BinaryTreeNode(6);
        treeNode.right.right = new BinaryTreeNode(10);
        treeNode.left.right = new BinaryTreeNode(1);
        assertTrue(treeNode.equals(Q3.createBST(new int[]{0, 1, 5, 6, 10})));
    }

    @Test
    public void testBSTToLinkedList_4_4(){
        BinaryTreeNode root = new BinaryTreeNode(5, new BinaryTreeNode(0), new BinaryTreeNode(6));

        LinkedList<BinaryTreeNode> list1 = new LinkedList<>();
        list1.add(root);

        LinkedList<BinaryTreeNode> list2 = new LinkedList<>();
        list2.add(root.left);
        list2.add(root.right);

        List<LinkedList<BinaryTreeNode>> lists = new ArrayList<>();
        lists.add(0, list1);
        lists.add(1, list2);

        ArrayList<LinkedList<BinaryTreeNode>> linkedLists = Q4.findLevelLinkList(root);
        assertTrue(linkedLists.equals(lists));
    }

    @Test
    public void testInorderSuccessor_4_5(){
        /*
         *     4
         *    / \
         *   2   5
         *  / \
         * 1   3
         *
         */
        BinaryTreeNode root = new BinaryTreeNode(4);

        BinaryTreeNode n2 = new BinaryTreeNode(2), n5 = new BinaryTreeNode(5);
        n2.parent = root; n5.parent = root;
        root.left = n2; root.right = n5;

        BinaryTreeNode n1 = new BinaryTreeNode(1), n3 = new BinaryTreeNode(3);
        n1.parent = n2; n3.parent = n2;
        n2.left = n1; n2.right = n3;

        assertTrue(Q5.inorderSuccessor(n2).value == 3);
    }

    @Test
    public void testFindFirstCommonAncestor_4_6(){
        /*
         *     4
         *    / \
         *   2   5
         *  / \   \
         * 1   3   7
         *    /
         *   6
         *
         */
        BinaryTreeNode root = new BinaryTreeNode(4);

        BinaryTreeNode n1 = new BinaryTreeNode(1), n2 = new BinaryTreeNode(2), n3 = new BinaryTreeNode(3), n5 = new BinaryTreeNode(5), n6 = new BinaryTreeNode(6), n7 = new BinaryTreeNode(7);
        n2.left = n1; n2.right = n3; root.left = n2; root.right = n5; n3.left = n6;
        n5.right = n7;

        assertTrue(Q6.findFirstCommonAncestor(root, n1, n6) == n2);
        assertTrue(Q6.findFirstCommonAncestor(root, n1, n7) == root);
    }

    @Test
    public void testIsSubtree_4_7(){
        /*
         *     4
         *    / \
         *   2   5
         *  / \   \
         * 1   3   7
         *    /
         *   6
         *
         */

        BinaryTreeNode root = new BinaryTreeNode(4);

        BinaryTreeNode n1 = new BinaryTreeNode(1), n2 = new BinaryTreeNode(2), n3 = new BinaryTreeNode(3),
                n5 = new BinaryTreeNode(5), n6 = new BinaryTreeNode(6),
                n7 = new BinaryTreeNode(7);
        n2.left = n1; n2.right = n3; root.left = n2; root.right = n5; n3.left = n6;
        n5.right = n7;

        assertTrue(Q7.isSubtree(root, n2));
        assertTrue(Q7.isSubtree(n2, n6));
        assertTrue(Q7.isSubtree(n2, n1));
        assertTrue(!Q7.isSubtree(n6, n2));
        assertTrue(!Q7.isSubtree(n5, n2));
    }

    @Test
    public void testFindSumPaths_4_8(){
        /*
         *     4
         *    / \
         *   5   2
         *  / \   \
         * 1   3   7
         * \   /  /
         *  8 6  9
         *
         */
        BinaryTreeNode n1 = new BinaryTreeNode(1), n2 = new BinaryTreeNode(2), n3 = new BinaryTreeNode(3),
                root = new BinaryTreeNode(4), n5 = new BinaryTreeNode(5), n6 = new BinaryTreeNode(6),
                n7 = new BinaryTreeNode(7), n8 = new BinaryTreeNode(8), n9 = new BinaryTreeNode(9);

        root.left = n5; root.right = n2; n5.left = n1; n5.right = n3; n1.right = n8;
        n3.left = n6; n2.right = n7; n7.left = n9;

        LinkedList<LinkedList<BinaryTreeNode>> lists = new LinkedList<>();
        lists.add(new LinkedList<BinaryTreeNode>());
        lists.get(0).add(n5);

        assertTrue(Q8.findSumPaths(root, 5).equals(lists));

        lists = new LinkedList<>();
        lists.add(new LinkedList<BinaryTreeNode>());
        lists.get(0).add(n8);
        lists.add(new LinkedList<BinaryTreeNode>());
        lists.get(1).add(n3);
        lists.get(1).add(n5);

        assertTrue(Q8.findSumPaths(root, 8).equals(lists));
    }
}