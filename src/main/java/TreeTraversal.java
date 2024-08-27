import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {
    public List<Integer> traverse(TreeNode<Integer> tn) {
        return traverse(new ArrayList<>(), tn);
    }

    public List<Integer> traverse(List<Integer> values, TreeNode<Integer> tn) {
        if(tn == null) return values;

        values.add(tn.getValue());

        traverse(values, tn.getLeft());
        traverse(values, tn.getRight());

        return values;
    }
}
