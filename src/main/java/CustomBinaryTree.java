/**
 * Created by anujparikh on 11/18/16.
 */
public class CustomBinaryTree {
    public static class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    public Node root;

    CustomBinaryTree(int key) {
        root = new Node(key);
    }

    private CustomBinaryTree() {
        root = null;
    }

    // Left -> Root -> Right
    public void inorderTraversalPrint() {
        inorderTraversalPrint(root);
    }

    // Root -> Left -> Right
    public void preorderTraversalPrint() {
        preorderTraversalPrint(root);
    }

    // Left -> Right -> Root
    public void postorderTraversalPrint() {
        postorderTraversalPrint(root);
    }

    public void inorderTraversalPrint(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversalPrint(node.left);
        System.out.print(node.key + " ");
        inorderTraversalPrint(node.right);
    }

    public void preorderTraversalPrint(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");
        preorderTraversalPrint(node.left);
        preorderTraversalPrint(node.right);
    }

    public void postorderTraversalPrint(Node node) {
        if (node == null) {
            return;
        }
        postorderTraversalPrint(node.left);
        postorderTraversalPrint(node.right);
        System.out.print(node.key + " ");
    }
}
