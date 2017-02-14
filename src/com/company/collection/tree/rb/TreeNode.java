package com.company.collection.tree.rb;

/**
 * Created by volodyko on 18.01.17.
 */
public class TreeNode {
    public static final boolean RED = true;
    public static final boolean BLACK = false;
    private TreeNode left;
    private TreeNode right;
    private Object data;
    private boolean color;

    public TreeNode(Object o) {
        data = o;
        color = RED;
        left = right = null;
    }

    public void flip() {
        color = !color;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
}
