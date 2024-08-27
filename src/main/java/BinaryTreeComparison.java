import model.TreeNode;

public class BinaryTreeComparison {

    public boolean compare(TreeNode<Integer> a, TreeNode<Integer> b) {
        if(a == null && b == null) return true;
        if(a == null) return false;
        if(b == null) return false;
        if(!a.getValue().equals(b.getValue())) return false;

        boolean left = compare(a.getLeft(), b.getLeft());
        boolean right = compare(a.getRight(), b.getRight());

        return left && right;
    }

}
