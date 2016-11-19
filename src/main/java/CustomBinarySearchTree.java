/**
 * Created by anujparikh on 11/19/16.
 */
public class CustomBinarySearchTree {

    public static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    Node root;

    CustomBinarySearchTree(int key) {
        this.root = new Node(key);
    }

    CustomBinarySearchTree() {
        this.root = null;
    }

    public boolean contains(Node node, int key) {
        if (node == null) {
            return false;
        }

        if (node.key == key) {
            return true;
        }

        return node.key > key ? contains(node.left, key) : contains(node.right, key);
    }

    public Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (node.key < key) {
            node.right = insert(node.right, key);
        } else {
            node.left = insert(node.left, key);
        }
        return node;
    }
}
