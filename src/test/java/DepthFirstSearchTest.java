import model.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DepthFirstSearchTest {


    private final DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

    @ParameterizedTest
    @MethodSource("generateTestValues")
    void depthFirstSearch_successfully(TreeNode<Integer> expected, int searchValue) {
        TreeNode<Integer> root = generateTree();
        TreeNode<Integer> actual = depthFirstSearch.search(root, searchValue);

        Assertions.assertEquals(expected, actual);
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

    public static Stream<Arguments> generateTestValues() {
        TreeNode<Integer> root = generateTree();
        return Stream.of(
                Arguments.of(root.getLeft().getRight(), 8),
                Arguments.of(root.getRight().getLeft(), 7),
                Arguments.of(root.getRight().getRight(), 2),
                Arguments.of(root.getRight().getRight().getRight(), 11),
                Arguments.of(root.getRight(), 4),
                Arguments.of(null, 13)
        );
    }

}
