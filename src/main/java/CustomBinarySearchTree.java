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

        if (node.key > key) {
            return contains(node.left, key);
        } else {
            return contains(node.right, key);
        }
    }
}
