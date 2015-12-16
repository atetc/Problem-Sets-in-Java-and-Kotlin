package atetc.chap02;

import atetc.structures.LinkedList;
import atetc.structures.LinkedList.Node;

public class E2 {

    public Node<Integer> merge(Node<Integer> n1, Node<Integer> n2) {
        if (n1 == null) return n2;
        if (n2 == null) return n1;
        Node<Integer> retHead = null;
        Node<Integer> retTail = null;
        while (n1 != null && n2 != null) {
            if (n1.data < n2.data) {
                if (retHead == null) {
                    retHead = retTail = n1;
                }
                else {
                    retTail.next = n1;
                    retTail = n1;
                }
                n1 = n1.next;
            }
            else {
                if (retHead == null) {
                    retHead = retTail = n2;
                }
                else {
                    retTail.next = n2;
                    retTail = n2;
                }
                n2 = n2.next;
            }
        }
        if (n1 != null) {
            retTail.next = n1;
        } else if (n2 != null) {
            retTail.next = n2;
        }
        return retHead;
    }
    
  //-----------------------------------------------------
    public static void main(String[] args) {
        LinkedList list1 = LinkedList.buildList(new int[] {1,2,3,5,7,8,10});
        LinkedList list2 = LinkedList.buildList(new int[] {2,4,6,7,9,11,12,15});
//        LinkedList res = new E2().merge(list1.head, list2.head);
//        LinkedList.printList(res);
    }
}
