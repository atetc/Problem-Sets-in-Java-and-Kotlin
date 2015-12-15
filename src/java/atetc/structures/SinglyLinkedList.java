package atetc.structures;

/**
 * Created by Atetc on 02.12.2015.
 */
public class SinglyLinkedList<T> {
    public Node<T> header;

    public SinglyLinkedList(T rootData) {
        header = new Node<T>(rootData);
    }

    public static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
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