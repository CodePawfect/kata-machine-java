import model.TreeNode;

public class BinarySearchTreeInsert {

    public void insert(TreeNode<Integer> node, int value) {
        if(node == null) return;
        if(node.getLeft() == null && node.getRight() == null) {
            if(value <= node.getValue()) {
                node.setLeft(new TreeNode<>(value));
            } else {
                node.setRight(new TreeNode<>(value));
            }
            return;
        }
        if(node.getLeft() == null && value <= node.getValue()) {
            node.setLeft(new TreeNode<>(value));
            return;
        }
        if(node.getRight() == null && value > node.getValue()) {
            node.setRight(new TreeNode<>(value));
            return;
        }
        if(value <= node.getValue()) {
            insert(node.getLeft(), value);
        } else {
            insert(node.getRight(), value);
        }
    }

}
