import org.junit.Test;

/**
 * Created by anujparikh on 11/18/16.
 */
public class CustomBinaryTreeTest {

    @Test
    public void whenInputBinaryTreePrintTreeTraversal() {
        CustomBinaryTree inputBinaryTree = new CustomBinaryTree(1);
        inputBinaryTree.root.left = new CustomBinaryTree.Node(2);
        inputBinaryTree.root.right = new CustomBinaryTree.Node(3);
        inputBinaryTree.root.left.left = new CustomBinaryTree.Node(4);
        inputBinaryTree.root.left.right = new CustomBinaryTree.Node(5);
        System.out.println("Inorder Traversal Left -> Root -> Right");
        inputBinaryTree.inorderTraversalPrint();
        System.out.println();
        System.out.println("PreOrder Traversal Root -> Left -> Right");
        inputBinaryTree.preorderTraversalPrint();
        System.out.println();
        System.out.println("PostOrder Traversal Left -> Right -> Root");
        inputBinaryTree.postorderTraversalPrint();
    }
}
