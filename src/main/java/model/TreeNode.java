package model;

import java.util.Objects;

public class TreeNode<T> {
    private T value;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode<?> treeNode = (TreeNode<?>) o;
        return Objects.equals(value, treeNode.value) && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, left, right);
    }

    @Override
    public String toString() {
        return toStringHelper(this, 0);
    }

    private String toStringHelper(TreeNode<T> node, int level) {
        if (node == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("  ".repeat(level));
        sb.append(node.value).append("\n");

        if (node.left != null || node.right != null) {
            sb.append(toStringHelper(node.left, level + 1));
            sb.append(toStringHelper(node.right, level + 1));
        }

        return sb.toString();
    }
}
