import java.util.Arrays;

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
    Node lca;

    CustomBinarySearchTree(int key) {
        this.root = new Node(key);
        this.lca = this.root;
    }

    CustomBinarySearchTree() {
        this.root = null;
        this.lca = null;
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

    public int ceilInBSTForKey(Node node, int key) {

        if (node == null) {
            return -1;
        }

        if (node.key == key) {
            return node.key;
        }

        if (node.key < key) {
            return ceilInBSTForKey(node.right, key);
        }

        int ceil = ceilInBSTForKey(node.left, key);
        return (ceil >= key) ? ceil : node.key;
    }

    public Node createBSTFromDLL(int[] input) {
        if (input.length == 0) {
            return null;
        }
        if (input.length == 1) {
            return new Node(input[0]);
        }
        int middleIndex = (int) Math.ceil(input.length / 2);
        int key = input[middleIndex];
        Node node = new Node(key);
        node.left = createBSTFromDLL(Arrays.copyOfRange(input, 0, middleIndex));
        node.right = createBSTFromDLL(Arrays.copyOfRange(input, middleIndex + 1, input.length));
        return node;
    }

    public void findPairEqualToInputTarget(Node node1, Node node2, int target) {

    }

    /*public void printInorderPredecessor(Node node, Node predecessor, int key) {
        if (node == null) return;
        if (node.key == key) {
            if (node.left != null) {
                if (node.left.right != null) {
                    predecessor = getRightMostChild(node.left);
                } else {
                    predecessor = node.left;
                }
            }
            return;
        }

        if (node.key < key) {
            predecessor = node;
            printInorderPredecessor(node.right, predecessor, key);
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

    public Node findLCA(Node node, int n1, int n2) {
        if (node == null) return lca;
        if (node.key == n1 || node.key == n2) return lca;
        if (contains(node.left, n1) && contains(node.left, n2)) lca = node.left;
        if (contains(node.right, n1) && contains(node.right, n2)) lca = node.right;
        if (contains(node.left, n1) && contains(node.right, n2)) {
            lca = node;
            return lca;
        }
        if (contains(node.left, n2) && contains(node.right, n1)) {
            lca = node;
            return lca;
        }
        return findLCA(lca, n1, n2);
    }
}
