package atetc.structures;

/**
 * Created by Atetc on 02.12.2015.
 */
public class SinglyLinkedList<T> {
    public Node<T> head;

    public SinglyLinkedList(T rootData) {
        head = new Node<T>(rootData);
    }

    public static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public Node setNext(Node<T> next) {
            this.next = next;
            return next;
        }

        public Node<T> getNext() {
            return next;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }

            if (obj == this) {
                return true;
            }

            if (!(obj instanceof Node)) {
                return false;
            }

            return ((Node) obj).data == this.data;
        }
    }
}