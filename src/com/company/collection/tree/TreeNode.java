package com.company.collection.tree;

/**
 * Created by volodyko on 05.01.17.
 */

public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private String data;

    public TreeNode(String data) {
        left = null;
        right = null;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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

    @Override
    public String toString() {
        return "TreeNode{" +
                "data='" + data + '\'' +
                '}';
    }
}
