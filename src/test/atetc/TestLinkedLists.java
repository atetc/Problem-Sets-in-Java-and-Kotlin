package atetc;

import atetc.other.linkedlists.Q1;
import atetc.structures.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestLinkedLists {

    @Test
    public void testRemoveHead_1(){
        SinglyLinkedList.Node<Integer> head = new SinglyLinkedList.Node<>(5);
        SinglyLinkedList.Node<Integer> next = new SinglyLinkedList.Node<>(3);
        head.setNext(next)
                .setNext(new SinglyLinkedList.Node<>(7)
                        .setNext(new SinglyLinkedList.Node<>(123)
                                .setNext(new SinglyLinkedList.Node<>(4))));

        assertTrue(Q1.removeHead(head) == next);
    }
}