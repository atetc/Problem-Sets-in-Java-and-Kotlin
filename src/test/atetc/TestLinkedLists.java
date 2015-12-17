package atetc;

import atetc.other.linkedlists.*;
import atetc.structures.LinkedList;
import atetc.structures.LinkedList.Node;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestLinkedLists {

    @Test
    public void testRemoveHead_1(){
        Node<Integer> head = new Node<>(5);
        Node<Integer> next = new Node<>(3);

        head.next = next;
        head.next.next = new Node<>(7);
        head.next.next.next = new Node<>(123);
        head.next.next.next.next = new Node<>(4);

        assertTrue(Q1.removeHead(head) == next);
    }

    @Test
    public void testGetLoopSize_3(){
        assertTrue(Q3.getLoopSize(null) == 0);

        assertTrue(Q3.getLoopSize(new LinkedList<>(3)) == 0);

        LinkedList<Integer> list = new LinkedList<>(3);
        list.head.next = new Node<>(5);
        Node<Integer> loopStartNode = new Node<>(6);
        list.head.next.next = loopStartNode;
        list.head.next.next.next = new Node<>(7);
        list.head.next.next.next.next = new Node<>(8);
        list.head.next.next.next.next.next = loopStartNode;
        assertTrue(Q3.getLoopSize(list) == 3);
    }

    @Test
    public void testGetIntersection_4(){
        LinkedList<Integer> list1 = new LinkedList<>(0);
        list1.head.next = new Node<>(1);
        list1.head.next.next = new Node<>(2);
        list1.head.next.next.next = new Node<>(3);
        list1.head.next.next.next.next = new Node<>(4);
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