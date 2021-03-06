/**
 * Created by anujparikh on 11/18/16.
 */
public class CustomBinaryTree1 {

    Node root;
    static int preIndex = 0;

    public class Node {
        Character key;
        Node left, right, connectRightPointer;

        Node(Character key) {
            this.key = key;
            this.left = null;
            this.right = null;
            this.connectRightPointer = null;
        }
    }

    public void nodesAtInputDistance(Node node, int distance) {

        if (node == null) {
            return;
        }

        if (distance == 0) {
            System.out.println("Node at distance: " + node.key);
        }

        nodesAtInputDistance(node.left, distance - 1);
        nodesAtInputDistance(node.right, distance - 1);
    }

    public boolean printAncestors(Node node, Character target) {
        if (node == null) {
            return false;
        }
        if (node.key == target) {
            return true;
        }
        if (printAncestors(node.left, target) || printAncestors(node.right, target)) {
            System.out.println("Parent: " + node.key);
            return true;
        }
        return false;
    }

    public boolean checkSubTree(Node node, Character subTreeRootKey) {
        if (node == null) {
            return false;
        }

        if (node.key == subTreeRootKey) {
            return true;
        }
        if (checkSubTree(node.left, subTreeRootKey) || checkSubTree(node.right, subTreeRootKey)) {
            return true;
        }
        return false;
    }


    // Inorder: D B E A F C
    // Preorder: A B D E C F
    public Node buildTree(String inorderInput, String preOrderInput) {
        inorderInput = inorderInput.replace(" ", "");
        preOrderInput = preOrderInput.replace(" ", "");
        if (inorderInput.isEmpty()) {
            return null;
        }
        Character key = preOrderInput.charAt(preIndex++);
        Node tNode = new Node(key);
        int inIndex = inorderInput.indexOf(key);
        tNode.left = buildTree(inorderInput.substring(0, inIndex), preOrderInput);
        tNode.right = buildTree(inorderInput.substring(inIndex + 1), preOrderInput);

        return tNode;
    }

    public void connectNodesAtSameLevel(Node node1, Node node2) {
        if (node1 != null && node2 != null) {
            node1.connectRightPointer = node2;
            connectNodesAtSameLevel(node1.right, node2.left);
        }
        if (node1 != null) {
            connectNodesAtSameLevel(node1.left, node1.right);
        }
        if (node2 != null) {
            connectNodesAtSameLevel(node2.left, node2.right);
        }
    }

    public void printRightConnectionOfNode(Node node) {
        if (node == null) {
            return;
        }
        if (node.connectRightPointer != null) {
            System.out.println(node.key + " --> " + node.connectRightPointer.key);
        } else {
            System.out.println(node.key + " --> " + node.connectRightPointer);
        }
        printRightConnectionOfNode(node.left);
        printRightConnectionOfNode(node.right);
    }

    public static void main(String[] args) {
        CustomBinaryTree1 testObject = new CustomBinaryTree1();
        testObject.root = testObject.buildTree("D B E A F C", "A B D E C F");
        System.out.println(testObject.root.key);
        System.out.println(testObject.root.left.key);
        System.out.println(testObject.root.right.key);
        System.out.println(testObject.root.left.left.key);
        System.out.println(testObject.root.left.right.key);
        System.out.println(testObject.root.right.left.key);

//        testObject.nodesAtInputDistance(testObject.root, 2);

//        testObject.printAncestors(testObject.root, 'F');

//        System.out.println("Check subtree: " + testObject.checkSubTree(testObject.root, 'C'));

        testObject.connectNodesAtSameLevel(testObject.root, null);
        testObject.printRightConnectionOfNode(testObject.root);
    }
}
