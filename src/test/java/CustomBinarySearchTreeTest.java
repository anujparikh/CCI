import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by anujparikh on 11/19/16.
 */
public class CustomBinarySearchTreeTest {

    @Test
    public void whenInputKeyCheckBSTAndReturnTrue() {
        CustomBinarySearchTree testObject = new CustomBinarySearchTree(8);
        testObject.root.left = new CustomBinarySearchTree.Node(3);
        testObject.root.right = new CustomBinarySearchTree.Node(10);
        testObject.root.left.left = new CustomBinarySearchTree.Node(1);
        testObject.root.left.right = new CustomBinarySearchTree.Node(6);
        testObject.root.left.right.left = new CustomBinarySearchTree.Node(4);
        testObject.root.left.right.right = new CustomBinarySearchTree.Node(7);
        testObject.root.right.right = new CustomBinarySearchTree.Node(14);
        testObject.root.right.right.left = new CustomBinarySearchTree.Node(13);

        System.out.println("Contains 13: " + testObject.contains(testObject.root, 13));

        testObject.insert(testObject.root, 15);
        System.out.println(testObject.root.right.right.right.key);
    }

    @Test
    public void whenInsertMultipleKeysCreateBST() {
        CustomBinarySearchTree testObject = new CustomBinarySearchTree();
        testObject.insert(8);
        testObject.insert(3);
        testObject.insert(10);
        testObject.insert(1);
        testObject.insert(6);
        testObject.insert(4);
        testObject.insert(7);
        testObject.insert(14);
        testObject.insert(13);
        System.out.println("Root: " + testObject.root.key);
        System.out.println("Root Left: " + testObject.root.left.key);
        System.out.println("Root Right: " + testObject.root.right.key);
        System.out.println("Root Left Left: " + testObject.root.left.left.key);
        System.out.println("Root Left Right: " + testObject.root.left.right.key);
        System.out.println("Root Left Right Left: " + testObject.root.left.right.left.key);
        System.out.println("Root Left Right Right: " + testObject.root.left.right.right.key);
        System.out.println("Minimum Key: " + testObject.minimum(testObject.root).key);
    }

    @Test
    public void whenInsertMultipleKeysCreateBSTAndDelete() {
        CustomBinarySearchTree testObject = new CustomBinarySearchTree();
        testObject.insert(8);
        testObject.insert(3);
        testObject.insert(10);
        testObject.insert(9);
        testObject.insert(1);
        testObject.insert(6);
        testObject.insert(4);
        testObject.insert(7);
        testObject.insert(14);
        testObject.insert(13);
        testObject.delete(testObject.root, 10);
        System.out.println("Root: " + testObject.root.key);
        System.out.println("Root Left: " + testObject.root.left.key);
        System.out.println("Root Right: " + testObject.root.right.key);
        System.out.println("Root Left Left: " + testObject.root.left.left.key);
        System.out.println("Root Left Right: " + testObject.root.left.right.key);
        System.out.println("Root Right Left: " + testObject.root.right.left.key);
        System.out.println("Root Right Right: " + testObject.root.right.right.key);
        System.out.println("Root Right Right Left: " + testObject.root.right.right.left);
    }

    @Test
    public void whenInsertMultipleKeysCreateBSTAndDelete2() {
        CustomBinarySearchTree testObject = new CustomBinarySearchTree();
        testObject.insert(50);
        testObject.insert(40);
        testObject.insert(70);
        testObject.insert(60);
        testObject.insert(80);
        System.out.println("************before*************");
        System.out.println("Root: " + testObject.root.key);
        System.out.println("Root Left: " + testObject.root.left.key);
        System.out.println("Root Right: " + testObject.root.right.key);
        System.out.println("Root Right Left: " + testObject.root.right.left.key);
        System.out.println("Root Right Right: " + testObject.root.right.right.key);
        System.out.println("InOrder Traversal: ");
        testObject.printInOrderTraversal(testObject.root);
        testObject.delete(testObject.root, 50);
        System.out.println("************after*************");
        System.out.println("Root: " + testObject.root.key);
        System.out.println("Root Left: " + testObject.root.left.key);
        System.out.println("Root Right: " + testObject.root.right.key);
        System.out.println("Root Right Left: " + testObject.root.right.left);
        System.out.println("Root Right Right: " + testObject.root.right.right.key);
        System.out.println("InOrder Traversal: ");
        testObject.printInOrderTraversal(testObject.root);
    }

    @Ignore
    @Test
    public void whenInsertMultipleKeysCreateBSTAndCheckInorderPredecessor() {
        CustomBinarySearchTree testObject = new CustomBinarySearchTree();
        testObject.insert(8);
        testObject.insert(3);
        testObject.insert(10);
        testObject.insert(9);
        testObject.insert(1);
        testObject.insert(6);
        testObject.insert(4);
        testObject.insert(7);
        testObject.insert(14);
        testObject.insert(13);
        testObject.printInOrderTraversal(testObject.root);
        System.out.println("\nInOrder Traversal of 4: ");
        //testObject.printInorderPredecessor(testObject.root, 4);
    }

    @Test
    public void checkForValidBSTTest() {
        CustomBinarySearchTree testObject = new CustomBinarySearchTree(8);
        testObject.root.left = new CustomBinarySearchTree.Node(3);
        testObject.root.right = new CustomBinarySearchTree.Node(10);
        testObject.root.left.left = new CustomBinarySearchTree.Node(1);
        testObject.root.left.right = new CustomBinarySearchTree.Node(6);
        testObject.root.left.right.left = new CustomBinarySearchTree.Node(4);
        testObject.root.left.right.right = new CustomBinarySearchTree.Node(7);
        testObject.root.right.right = new CustomBinarySearchTree.Node(14);
        testObject.root.right.right.left = new CustomBinarySearchTree.Node(13);
        System.out.println("Valid BST: " + testObject.checkForValidBinarySearchTree(testObject.root));
    }

    @Test
    public void checkForValidBSTTest2() {
        CustomBinarySearchTree testObject = new CustomBinarySearchTree(3);
        testObject.root.left = new CustomBinarySearchTree.Node(2);
        testObject.root.left.left = new CustomBinarySearchTree.Node(1);
        testObject.root.left.right = new CustomBinarySearchTree.Node(4);
        testObject.root.right = new CustomBinarySearchTree.Node(5);
        System.out.println("Valid BST: " + testObject.checkForValidBinarySearchTree(testObject.root));
    }
}
