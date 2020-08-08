package com.atetc;

import com.atetc.chap02.*;
import com.atetc.structures.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestChap2 {

    @Test
    public void testUniqueString_2_1(){
        int[] a = {1, 1, 2, 3, 3, 4, 2, 5, 5};
        LinkedList<Integer> n = LinkedList.buildList(a);
        Q1.removeDuplicates(n);
        int[] b = {1, 2, 3, 4, 5};
        LinkedList<Integer> m = LinkedList.buildList(b);

        assertEquals(n, m);

        a = new int[]{1, 1, 22, 33, 3, 4, 2, 5, 5};
        n = LinkedList.buildList(a);
        Q1.removeDuplicates2(n);
        b = new int[]{1, 22, 33, 3, 4, 2, 5};
        m = LinkedList.buildList(b);

        assertEquals(n, m);
    }

    @Test
    public void testNthToLast_2_2(){
        LinkedList<Integer> list = LinkedList.buildList(new int[]{1, 1, 2, 3, 5});

        assertEquals(5, (int) Q2.nthToLast(list.head, 1).data);
    }

    @Test
    public void testDeleteNode_2_3(){
        int[] a = {1, 4, 2, 5, 5};
        LinkedList<Integer> n = LinkedList.buildList(a);

        LinkedList.Node<Integer> middleNode = n.head.next.next;
        Q3.deleteNode(middleNode);

        int[] b = {1, 4, 5, 5};
        LinkedList<Integer> m = LinkedList.buildList(b);

        assertEquals(n, m);
    }

    @Test
    public void testAddList_2_4(){
        LinkedList<Integer> a = LinkedList.buildList(new int[]{3, 1, 5});
        LinkedList<Integer> b = LinkedList.buildList(new int[]{5, 9, 2});
        LinkedList<Integer> c = LinkedList.buildList(new int[]{8, 0, 8});
        LinkedList<Integer> d = LinkedList.buildList(new int[]{3, 0, 1, 1});

        assertEquals(Q4.addLists(a, b), c);
        assertEquals(Q4.addLists2(a, b, 0), c);
    }

    @Test
    public void testFindBeginning_2_5(){
        LinkedList<Integer> list = LinkedList.buildList(new int[]{1, 2, 3, 4, 5});
        list.head.next.next.next.next = list.head.next.next;

        LinkedList.Node<Integer> beginning = Q5.findBeginning(list.head);
        assertEquals(3, (int) beginning.data);
    }
}