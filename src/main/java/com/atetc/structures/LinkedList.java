package com.atetc.structures;

public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    private static int MAX_PRINT_LENGTH = 500;

    public LinkedList(T data) {
        this.head = new Node<>(data);
    }

    public static LinkedList<Integer> buildList(int[] a) {
        if (a == null || a.length == 0) {
            return null;
        }

        LinkedList<Integer> list = new LinkedList<>(a[0]);

        Node<Integer> n = list.head;
        for (int i = 1; i < a.length; ++i) {
            n.next = new Node<>(a[i], n, null);
            n = n.next;
        }

        return list;
    }

    public void printList(LinkedList list) {
        Node n = list.head;
        int i = 0;
        while (n != null) {
            System.out.print(n.data.toString() + "->");
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

        Node node1 = ((LinkedList) obj).head;
        Node node2 = this.head;

        while (node1 != null) {
            if (node1.data != node2.data) {
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        return true;
    }

    public static class Node<T> {
        public T data;
        public Node<T> next;
        public Node<T> previous;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node<T> previous, Node<T> next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
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

            Node node = (Node) obj;
            return node.data == this.data;
        }
    }
}
