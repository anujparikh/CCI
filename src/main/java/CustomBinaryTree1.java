/**
 * Created by anujparikh on 11/18/16.
 */
public class CustomBinaryTree1 {

    Node root;
    static int preIndex = 0;

    public class Node {
        Character key;
        Node left, right;

        Node(Character key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }


    // Inorder: D B E A F C
    // Preorder: A B D E C F
    public Node buildTree(String inorderInput, String preorderInput) {
        inorderInput = inorderInput.replace(" ", "");
        preorderInput = preorderInput.replace(" ", "");
        if (inorderInput.isEmpty()) {
            return null;
        }
        Character key = preorderInput.charAt(preIndex++);
        Node tNode = new Node(key);
        int inIndex = inorderInput.indexOf(key);
        tNode.left = buildTree(inorderInput.substring(0, inIndex), preorderInput);
        tNode.right = buildTree(inorderInput.substring(inIndex + 1), preorderInput);

        return tNode;
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
    }
}
