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
}
