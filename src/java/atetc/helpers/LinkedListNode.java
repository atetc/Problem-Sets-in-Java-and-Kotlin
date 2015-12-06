package atetc.helpers;

public class LinkedListNode {
    public int data;
    public LinkedListNode next;
    private static int MAX_PRINT_LENGTH = 500;

    public LinkedListNode(int x) {
        data = x;
        next = null;
    }

    public LinkedListNode(int carry, LinkedListNode next, LinkedListNode previous) {
        this.data = carry;
        this.next = next;
    }

    public static LinkedListNode buildList(int[] a) {
        if (a == null || a.length == 0) {
            return null;
        }

        LinkedListNode n = new LinkedListNode(a[0]);
        LinkedListNode head = n;
        for (int i = 1; i < a.length; ++i) {
            n.next = new LinkedListNode(a[i]);
            n = n.next;
        }

        return head;
    }

    public static void printList(LinkedListNode n) {
        int i = 0;
        while (n != null) {
            System.out.print(n.data + "->");
            n = n.next;
            if (++i > MAX_PRINT_LENGTH) {
                System.out.println("[MAX_LEN]");
                return;
            }
        }

        System.out.println("NULL");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (obj.getClass() != getClass()) {
            return false;
        }

        LinkedListNode node1 = (LinkedListNode) obj;
        LinkedListNode node2 = this;

        while (node1 != null) {
            if (node1.data != node2.data) {
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        return true;
    }
}
