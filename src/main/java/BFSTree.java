import model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTree {

    public TreeNode<Integer> search(TreeNode<Integer> node, int value) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();

        if(node == null) return null;
        queue.add(node);

        while(!queue.isEmpty()) {
            TreeNode<Integer> curNode = queue.poll();
            if(curNode.getValue().equals(value)) return curNode;
            if (curNode.getLeft() != null) queue.add(curNode.getLeft());
            if (curNode.getRight() != null) queue.add(curNode.getRight());
        }
        return null;
    }

}
