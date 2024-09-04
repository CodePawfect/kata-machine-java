import datastructure.TreeNode;

public class BinarySearchTreeDeletion {

    public TreeNode<Integer> delete(TreeNode<Integer> node, int value) {

        if(node.getValue().equals(value)) {
            if(node.getLeft() == null && node.getRight() == null) {
                return null;
            }

            else if(node.getLeft() == null) {
                return node.getRight();
            }

            else if(node.getRight() == null) {
                return node.getLeft();
            }

            else {
                int replacementValue = getMaxValue(node.getLeft());
                node.setValue(replacementValue);
                node.setLeft(delete(node.getLeft(), replacementValue));
                return node;
            }
        }

        if(node.getLeft() == null && node.getRight() == null) return node;

        node.setLeft(delete(node.getLeft(), value));
        node.setRight(delete(node.getRight(), value));

        return node;
    }

    private int getMaxValue(TreeNode<Integer> node) {
        if(node.getRight() == null) {
            return node.getValue();
        }

        return getMaxValue(node.getRight());
    }

}
