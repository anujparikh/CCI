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

    /*public void printInorderPredecessor(Node node, int key) {
        if (node == null) return;
        if (node.key == key) {
            if (node.left != null) {
                System.out.println("Predecessor: " + getRightMostChild(node.left).key);
            } else {
                System.out.println("Predecessor: " + node.key);
            }
            if (node.right != null) {
                System.out.println("Successor: " + minimum(node.right).key);
            } else {
                System.out.println("Successor: " + node.key);
            }
        } else {
            if (node.key > key) {
                printInorderPredecessor(node.left, key);
            } else {
                printInorderPredecessor(node.right, key);
            }
        }
    }*/

    public Node getRightMostChild(Node node) {
        if (node.right == null) {
            return node;
        }
        return getRightMostChild(node.right);
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

    public boolean checkForValidBinarySearchTree(Node node) {
        return isBSTUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(Node node, Integer min, Integer max) {
        if (node == null) return true;

        if (node.key < min || node.key > max) return false;

        return isBSTUtil(node.left, min, node.key - 1) && isBSTUtil(node.right, node.key + 1, max);
    }
}
