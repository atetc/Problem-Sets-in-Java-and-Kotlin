package atetc.structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Atetc on 02.12.2015.
 */
public class SinglyLinkedList<T> {
    private Node<T> root;

    public SinglyLinkedList(T rootData) {
        root = new Node<T>(rootData);
    }

    public Node<T> getRoot() {
        return root;
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