import datastructure.TreeNode;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TreeTraversalTest {

    private final TreeTraversal<Integer> treeTraversal = new TreeTraversal<>();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    public void inOrderTraversal() {
        System.setOut(new PrintStream(outContent));

        TreeNode<Integer> root = getCreateBT();
        treeTraversal.inOrderTraversal(root);

        String expectedOutput = "0641297";
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(originalOut);
    }

    @Test
    public void preOrderTraversal() {
        System.setOut(new PrintStream(outContent));

        TreeNode<Integer> root = getCreateBT();
        treeTraversal.preOrderTraversal(root);

        String expectedOutput = "2460179";
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(originalOut);
    }

    @Test
    public void postOrderTraversal() {
        System.setOut(new PrintStream(outContent));

        TreeNode<Integer> root = getCreateBT();
        treeTraversal.postOrderTraversal(root);

        String expectedOutput = "0614972";
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(originalOut);
    }

    private static TreeNode<Integer> getCreateBT() {
        TreeNode<Integer> root = new TreeNode<>(2);
        TreeNode<Integer> node1 = new TreeNode<>(4);
        TreeNode<Integer> node2 = new TreeNode<>(7);
        TreeNode<Integer> node3 = new TreeNode<>(6);
        TreeNode<Integer> node4 = new TreeNode<>(1);
        TreeNode<Integer> node5 = new TreeNode<>(0);
        TreeNode<Integer> node6 = new TreeNode<>(9);

        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node3.setLeft(node5);
        node2.setLeft(node6);

        return root;
    }

}