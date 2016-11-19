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

    public void insert(int key) {
        this.root = insert(this.root, key);
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

    // http://quiz.geeksforgeeks.org/binary-search-tree-set-2-delete/
    public Node delete(Node node, int key) {
        if (node.key == key) {
            if (node.left == null && node.right == null) {
                return null;
            } else {
                if (node.left != null && node.right != null) {
                    node.key = minimum(node.right).key;
                    delete(node.right, node.key);
                } else if (node.left != null) {
                    return node.left;
                } else {
                    return node.right;
                }
            }
        } else {
            if (node.key > key) {
                node.left = delete(node.left, key);
            } else {
                node.right = delete(node.right, key);
            }
        }
        return node;
    }

    public Node minimum(Node node) {
        if (node.left == null) {
            return node;
        }
        return minimum(node.left);
    }

    public void printInOrderTraversal(Node node) {
        if (node == null) return;
        printInOrderTraversal(node.left);
        System.out.print(node.key + " ");
        printInOrderTraversal(node.right);
    }
}
