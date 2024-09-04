import datastructure.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BinarySearchTreeDeletionTest {

    private final BinarySearchTreeDeletion binarySearchTreeDeletion = new BinarySearchTreeDeletion();

    @ParameterizedTest
    @MethodSource("generateTestData")
    public void delete_successfully(TreeNode<Integer> bst, int valueToDelete, TreeNode<Integer> expected) {
        System.out.println("Original Tree:");
        System.out.println(bst);

        TreeNode<Integer> result = binarySearchTreeDeletion.delete(bst, valueToDelete);

        System.out.println("After deleting " + valueToDelete + ":");
        System.out.println(result);

        System.out.println("Expected Tree:");
        System.out.println(expected);

        Assertions.assertEquals(expected, bst);
    }

    private static Stream<Arguments> generateTestData() {
        return Stream.of(
                // Case 1: Deleting a node with two children
                Arguments.of(generateBSTWithNodeHavingTwoChilds(), 50, generateBSTAfterDeletingNodeWithTwoChilds()),

                // Case 2: Deleting a node with only left child
                Arguments.of(generateBSTWithNodeHavingOnlyLeftChild(), 50, generateExpectedBSTAfterDeletingNodeWithOnlyLeftChild()),

                // Case 3: Deleting a node with only right child
                Arguments.of(generateBSTWithNodeHavingOnlyRightChild(), 50, generateExpectedBSTAfterDeletingNodeWithOnlyRightChild())
        );
    }

    public static TreeNode<Integer> generateBSTWithNodeHavingTwoChilds() {
        TreeNode<Integer> root = new TreeNode<>(15);
        TreeNode<Integer> tn1 = new TreeNode<>(12);
        TreeNode<Integer> tn2 = new TreeNode<>(50);
        TreeNode<Integer> tn3 = new TreeNode<>(9);
        TreeNode<Integer> tn4 = new TreeNode<>(14);
        TreeNode<Integer> tn5 = new TreeNode<>(25);
        TreeNode<Integer> tn6 = new TreeNode<>(70);
        TreeNode<Integer> tn7 = new TreeNode<>(75);
        TreeNode<Integer> tn8 = new TreeNode<>(20);
        TreeNode<Integer> tn9 = new TreeNode<>(30);

        root.setLeft(tn1);
        root.setRight(tn2);
        tn1.setLeft(tn3);
        tn1.setRight(tn4);
        tn2.setLeft(tn5);
        tn2.setRight(tn6);
        tn6.setRight(tn7);
        tn5.setLeft(tn8);
        tn5.setRight(tn9);

        return root;
    }

    public static TreeNode<Integer> generateBSTAfterDeletingNodeWithTwoChilds() {
        TreeNode<Integer> root = new TreeNode<>(15);
        TreeNode<Integer> tn1 = new TreeNode<>(12);
        TreeNode<Integer> tn3 = new TreeNode<>(9);
        TreeNode<Integer> tn4 = new TreeNode<>(14);
        TreeNode<Integer> tn5 = new TreeNode<>(25);
        TreeNode<Integer> tn6 = new TreeNode<>(70);
        TreeNode<Integer> tn7 = new TreeNode<>(75);
        TreeNode<Integer> tn8 = new TreeNode<>(20);
        TreeNode<Integer> tn9 = new TreeNode<>(30);

        root.setLeft(tn1);
        tn1.setLeft(tn3);
        tn1.setRight(tn4);
        root.setRight(tn9);
        tn9.setLeft(tn5);
        tn9.setRight(tn6);
        tn6.setRight(tn7);
        tn5.setLeft(tn8);

        return root;
    }

    public static TreeNode<Integer> generateBSTWithNodeHavingOnlyLeftChild() {
        TreeNode<Integer> root = new TreeNode<>(15);
        TreeNode<Integer> tn1 = new TreeNode<>(12);
        TreeNode<Integer> tn2 = new TreeNode<>(50);
        TreeNode<Integer> tn3 = new TreeNode<>(25);

        root.setLeft(tn1);
        root.setRight(tn2);
        tn2.setLeft(tn3);

        return root;
    }

    public static TreeNode<Integer> generateExpectedBSTAfterDeletingNodeWithOnlyLeftChild() {
        TreeNode<Integer> root = new TreeNode<>(15);
        TreeNode<Integer> tn1 = new TreeNode<>(12);
        TreeNode<Integer> tn3 = new TreeNode<>(25);

        root.setLeft(tn1);
        root.setRight(tn3);

        return root;
    }

    public static TreeNode<Integer> generateBSTWithNodeHavingOnlyRightChild() {
        TreeNode<Integer> root = new TreeNode<>(15);
        TreeNode<Integer> tn1 = new TreeNode<>(12);
        TreeNode<Integer> tn2 = new TreeNode<>(50);
        TreeNode<Integer> tn3 = new TreeNode<>(75);

        root.setLeft(tn1);
        root.setRight(tn2);
        tn2.setRight(tn3);

        return root;
    }

    public static TreeNode<Integer> generateExpectedBSTAfterDeletingNodeWithOnlyRightChild() {
        TreeNode<Integer> root = new TreeNode<>(15);
        TreeNode<Integer> tn1 = new TreeNode<>(12);
        TreeNode<Integer> tn3 = new TreeNode<>(75);

        root.setLeft(tn1);
        root.setRight(tn3);

        return root;
    }

}
