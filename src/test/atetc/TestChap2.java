package atetc;

/**
 * Created by Atetc on 13.11.2015.
 */

import org.junit.Test;
import wzhishen.chap02.*;
import wzhishen.helpers.LinkedListNode;

import static org.junit.Assert.assertTrue;

public class TestChap2 {

    @Test
    public void testUniqueString_2_1(){
        int[] a = {1, 1, 2, 3, 3, 4, 2, 5, 5};
        LinkedListNode n = LinkedListNode.buildList(a);
        Q1.removeDuplicates(n);
        int[] b = {1, 2, 3, 4, 5};
        LinkedListNode m = LinkedListNode.buildList(b);

        assertTrue(n.equals(m));

        a = new int[]{1, 1, 22, 33, 3, 4, 2, 5, 5};
        n = LinkedListNode.buildList(a);
        Q1.removeDuplicates2(n);
        b = new int[]{1, 22, 33, 3, 4, 2, 5};
        m = LinkedListNode.buildList(b);

        assertTrue(n.equals(m));
    }

    @Test
    public void testNthToLast_2_2(){
        LinkedListNode n = LinkedListNode.buildList(new int[]{1, 1, 2, 3, 5});

        assertTrue(Q2.nthToLast(n, 1).data == 5);
    }

    @Test
    public void testDeleteNode_2_3(){
        int[] a = {1, 4, 2, 5, 5};
        LinkedListNode n = LinkedListNode.buildList(a);

        LinkedListNode middleNode = n.next.next;
        Q3.deleteNode(middleNode);

        int[] b = {1, 4, 5, 5};
        LinkedListNode m = LinkedListNode.buildList(b);

        assertTrue(n.equals(m));
    }

    @Test
    public void testAddList_2_4(){
        LinkedListNode a = LinkedListNode.buildList(new int[]{3, 1, 5});
        LinkedListNode b = LinkedListNode.buildList(new int[]{5, 9, 2});
        LinkedListNode c = LinkedListNode.buildList(new int[]{8, 0, 8});
        LinkedListNode d = LinkedListNode.buildList(new int[]{3, 0, 1, 1});

        assertTrue(Q4.addLists(a, b).equals(c));
        assertTrue(Q4.addLists2(a, b, 0).equals(c));
    }

    @Test
    public void testFindBeginning_2_5(){
        LinkedListNode n = LinkedListNode.buildList(new int[]{1, 2, 3, 4, 5});
        n.next.next.next.next = n.next.next;

        LinkedListNode beginning = Q5.findBeginning(n);
        assertTrue(beginning.data == 3);
    }
}