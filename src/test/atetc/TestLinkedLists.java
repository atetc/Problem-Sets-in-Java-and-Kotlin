package atetc;

import atetc.other.linkedlists.*;
import atetc.structures.SinglyLinkedList;
import atetc.structures.SinglyLinkedList.Node;
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

        assertTrue(Q3.getLoopSize(new SinglyLinkedList<>(3)) == 0);

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(3);
        list.root.next = new Node<>(5);
        Node<Integer> loopStartNode = new Node<>(6);
        list.root.next.next = loopStartNode;
        list.root.next.next.next = new Node<>(7);
        list.root.next.next.next.next = new Node<>(8);
        list.root.next.next.next.next.next = loopStartNode;
        assertTrue(Q3.getLoopSize(list) == 3);
    }
}