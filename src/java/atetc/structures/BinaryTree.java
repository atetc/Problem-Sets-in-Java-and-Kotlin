package atetc.structures;

public class BinaryTree<T> {
    public Node<T> root;

    public BinaryTree(T rootData) {
        root = new Node<>(rootData);
    }

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public BinaryTree() {

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

        Node node1 = this.root;
        Node node2 = ((BinaryTree) obj).root;

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
        public Node<T> left;
        public Node<T> right;

        public Node(T data) {
            this.data = data;
        }

        public void setChild(T left, T right) {
            this.left = new Node<>(left);
            this.right = new Node<>(right);
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