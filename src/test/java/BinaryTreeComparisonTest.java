import datastructure.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BinaryTreeComparisonTest {

    private final BinaryTreeComparison binaryTreeComparison = new BinaryTreeComparison();

    @ParameterizedTest
    @MethodSource("generateTestValues")
    void binaryTreeComparisonSuccessfully(TreeNode<Integer> a, TreeNode<Integer> b, boolean expected) {
        boolean actual = binaryTreeComparison.compare(a, b);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> generateTestValues() {
        return Stream.of(
                Arguments.of(generateTree(), generateTree(), true),
                Arguments.of(generateTree(), generateAnotherTree(), false),
                Arguments.of(generateTree(), null, false),
                Arguments.of(null, generateTree(), false)
        );
    }

    public static TreeNode<Integer> generateTree() {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> tn1 = new TreeNode<>(3);
        TreeNode<Integer> tn2 = new TreeNode<>(4);
        TreeNode<Integer> tn3 = new TreeNode<>(9);
        TreeNode<Integer> tn4 = new TreeNode<>(8);
        TreeNode<Integer> tn5 = new TreeNode<>(7);
        TreeNode<Integer> tn6 = new TreeNode<>(2);
        TreeNode<Integer> tn7 = new TreeNode<>(11);

        root.setLeft(tn1);
        root.setRight(tn2);
        tn1.setLeft(tn3);
        tn1.setRight(tn4);
        tn2.setLeft(tn5);
        tn2.setRight(tn6);
        tn6.setRight(tn7);

        return root;
    }

    public static TreeNode<Integer> generateAnotherTree() {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> tn1 = new TreeNode<>(3);
        TreeNode<Integer> tn2 = new TreeNode<>(4);
        TreeNode<Integer> tn3 = new TreeNode<>(9);
        TreeNode<Integer> tn4 = new TreeNode<>(16);
        TreeNode<Integer> tn5 = new TreeNode<>(7);
        TreeNode<Integer> tn6 = new TreeNode<>(2);

        root.setLeft(tn1);
        root.setRight(tn2);
        tn1.setLeft(tn3);
        tn1.setRight(tn4);
        tn2.setLeft(tn5);
        tn2.setRight(tn6);

        return root;
    }

}
