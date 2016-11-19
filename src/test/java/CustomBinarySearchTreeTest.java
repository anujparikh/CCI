import org.junit.Test;

/**
 * Created by anujparikh on 11/19/16.
 */
public class CustomBinarySearchTreeTest {

    @Test
    public void whenInputKeyCheckBST() {
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
    }
}
