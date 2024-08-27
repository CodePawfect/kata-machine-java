import model.TreeNode;

public class DepthFirstSearch {

    public TreeNode<Integer> search(TreeNode<Integer> node, int value) {
        if(node == null) return null;
        if(node.getValue().equals(value)) return node;

        TreeNode<Integer> elementLeft = search(node.getLeft(), value);
        TreeNode<Integer> elementRight = search(node.getRight(), value);

        if(elementLeft == null && elementRight == null) return null;
        return elementLeft != null ? elementLeft : elementRight;
    }

}
