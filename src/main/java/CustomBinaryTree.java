/**
 * Created by anujparikh on 11/18/16.
 */
public class CustomBinaryTree {

    public static class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    public Node root;

    CustomBinaryTree(int key) {
        root = new Node(key);
    }

    private CustomBinaryTree() {
        root = null;
    }

    public int diameter(Node root) {
        if (root == null) return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);

        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        return Math.max((1 + lheight + rheight), Math.max(ldiameter, rdiameter));

    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return (1 + Math.max(height(node.left), height(node.right)));
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
