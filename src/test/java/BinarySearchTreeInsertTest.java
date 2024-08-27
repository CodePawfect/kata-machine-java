import model.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeInsertTest {

    private final BinarySearchTreeInsert binarySearchTreeInsert = new BinarySearchTreeInsert();

    @Test
    void insert_successfully() {
        TreeNode<Integer> bst = generateBinarySearchTree();
        TreeNode<Integer> expected = generateExpectedBinarySearchTree();

        binarySearchTreeInsert.insert(bst, 15);

        Assertions.assertEquals(bst, expected);
    }

    public static TreeNode<Integer> generateBinarySearchTree() {
        TreeNode<Integer> root = new TreeNode<>(15);
        TreeNode<Integer> tn1 = new TreeNode<>(12);
        TreeNode<Integer> tn2 = new TreeNode<>(50);
        TreeNode<Integer> tn3 = new TreeNode<>(9);
        TreeNode<Integer> tn4 = new TreeNode<>(14);
        TreeNode<Integer> tn5 = new TreeNode<>(25);
        TreeNode<Integer> tn6 = new TreeNode<>(70);

        root.setLeft(tn1);
        root.setRight(tn2);
        tn1.setLeft(tn3);
        tn1.setRight(tn4);
        tn2.setLeft(tn5);
        tn2.setRight(tn6);

        return root;
    }

    public static TreeNode<Integer> generateExpectedBinarySearchTree() {
        TreeNode<Integer> root = generateBinarySearchTree();
        root.getLeft().getRight().setRight(new TreeNode<>(15));

        return root;
    }

}
