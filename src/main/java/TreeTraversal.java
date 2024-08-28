import model.TreeNode;

public class TreeTraversal<T> {

/* imagine this binary tree
           2
         /   \
        4     7
       / \   /
      6   1 9
     /
    0
*/
    // order: left subtree, root, right subtree
    // will print 0641297
    public void inOrderTraversal(TreeNode<T> node) {
        if(node == null) return;
        inOrderTraversal(node.getLeft());
        System.out.print(node.getValue());
        inOrderTraversal(node.getRight());
    }

    // order: root, left subtree, right subtree
    // will print 2460179
    public void preOrderTraversal(TreeNode<T> node) {
        if(node == null) return;
        System.out.print(node.getValue());
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }

    // order: left subtree, right subtree, root
    // will print 0614972
    public void postOrderTraversal(TreeNode<T> node) {
        if(node == null) return;
        postOrderTraversal(node.getLeft());
        postOrderTraversal(node.getRight());
        System.out.print(node.getValue());
    }

}
