import model.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TreeTraversalTest {

    private final TreeTraversal treeTraversal = new TreeTraversal();

    @Test
    void traverse_tree_successfully() {
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

        List<Integer> expected = List.of(1,3,9,8,4,7,2,11);
        List<Integer> actual = treeTraversal.traverse(root);

        Assertions.assertEquals(expected, actual);
    }

}
