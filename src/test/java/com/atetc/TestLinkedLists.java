package com.atetc;

import com.atetc.other.linkedlists.*;
import com.atetc.structures.LinkedList;

import com.atetc.other.linkedlists.Q1;
import com.atetc.other.linkedlists.Q3;
import com.atetc.other.linkedlists.Q4;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestLinkedLists {

    @Test
    public void testRemoveHead_1(){
        LinkedList.Node<Integer> head = new LinkedList.Node<>(5);
        LinkedList.Node<Integer> next = new LinkedList.Node<>(3);

        head.next = next;
        head.next.next = new LinkedList.Node<>(7);
        head.next.next.next = new LinkedList.Node<>(123);
        head.next.next.next.next = new LinkedList.Node<>(4);

        assertTrue(Q1.removeHead(head) == next);
    }

    @Test
    public void testGetLoopSize_3(){
        assertTrue(Q3.getLoopSize(null) == 0);

        assertTrue(Q3.getLoopSize(new LinkedList<>(3)) == 0);

        LinkedList<Integer> list = new LinkedList<>(3);
        list.head.next = new LinkedList.Node<>(5);
        LinkedList.Node<Integer> loopStartNode = new LinkedList.Node<>(6);
        list.head.next.next = loopStartNode;
        list.head.next.next.next = new LinkedList.Node<>(7);
        list.head.next.next.next.next = new LinkedList.Node<>(8);
        list.head.next.next.next.next.next = loopStartNode;
        assertTrue(Q3.getLoopSize(list) == 3);
    }

    @Test
    public void testGetIntersection_4(){
        LinkedList<Integer> list1 = new LinkedList<>(0);
        list1.head.next = new LinkedList.Node<>(1);
        list1.head.next.next = new LinkedList.Node<>(2);
        list1.head.next.next.next = new LinkedList.Node<>(3);
        list1.head.next.next.next.next = new LinkedList.Node<>(4);
        assertTrue(Q4.getIntersectionIndex(list1, null) == -1);

        LinkedList<Integer> list2 = new LinkedList<>(55);
        list2.head.next = list1.head.next.next;
        assertTrue(Q4.getIntersectionIndex(null, list2) == -1);

        assertTrue(Q4.getIntersectionIndex(list1, list2) == 2);

        list2.head.next = list1.head;
        assertTrue(Q4.getIntersectionIndex(list1, list2) == 0);

        list2.head.next = list1.head.next.next.next.next;
        assertTrue(Q4.getIntersectionIndex(list1, list2) == 4);
    }
}