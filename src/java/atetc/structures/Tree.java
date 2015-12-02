package atetc.structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Atetc on 02.12.2015.
 */
public class Tree<T> {
    private Node<T> root;

    public Tree(T rootData) {
        root = new Node<T>(rootData);
    }

    public Node<T> getRoot() {
        return root;
    }

    public static class Node<T> {
        private T data;
        private Node<T> parent;
        private List<Node<T>> children = new ArrayList<>();

        public Node(T data) {
            this.data = data;
        }

        public void addChildren(Node<T> ... nodes) {
            for (Node<T> node : nodes) {
                node.parent = this;
                children.add(node);
            }
        }

        public Node<T> getParent() {
            return parent;
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