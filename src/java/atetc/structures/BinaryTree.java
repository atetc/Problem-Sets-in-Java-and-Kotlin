package atetc.structures;

public class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree(T rootData) {
        root = new Node<T>(rootData);
    }

    public Node<T> getRoot() {
        return root;
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

        Node node1 = this.getRoot();
        Node node2 = ((BinaryTree) obj).getRoot();

        if (node1.data != node2.data) {
            return false;
        }

        Node leftNode1 = node1.left;
        Node leftNode2 = node2.left;
        Node rightNode1 = node1.right;
        Node rightNode2 = node2.right;

        if (leftNode1 == null) {
            return leftNode2 == null && isEqual(rightNode1, rightNode2);
        } else {
            return leftNode1.equals(leftNode2) && isEqual(rightNode1, rightNode2);
        }
    }

    private boolean isEqual(Node rightNode1, Node rightNode2) {
        if (rightNode1 == null) {
            return rightNode2 == null;
        } else {
            return rightNode1.equals(rightNode2);
        }
    }

    public static class Node<T> {
        private T data;
        private Node<T> left;
        private Node<T> right;

        public Node(T data) {
            this.data = data;
        }

        public void setChild(T left, T right) {
            this.left = new Node<>(left);
            this.right = new Node<>(right);
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
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

            return ((Node) obj).data == this.data;
        }
    }
}