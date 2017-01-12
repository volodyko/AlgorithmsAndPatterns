package com.company.collection.tree;

/**
 * Created by volodyko on 05.01.17.
 */

public class HashTree {
    protected TreeNode root;


    public final static int INORDER = 1;
    public final static int PREORDER = 2;
    protected final static int RIGHT = 1;
    protected final static int LEFT = 2;


    public HashTree() {

    }

    public void add(String data) {
        add(root, new TreeNode(data));
    }

    private void add(TreeNode root, TreeNode treeNode) {
        if (root == null) {
            this.root = treeNode;
            return;
        }
        int val = treeNode.getData().compareTo(root.getData());
        if (val == 0) {
            root.setData(treeNode.getData());
            return;
        } else if (val < 0) {
            if (root.getLeft() == null) {
                root.setLeft(treeNode);
            } else {
                add(root.getLeft(), treeNode);
            }
        } else if (val > 0) {
            if (root.getRight() == null) {
                root.setRight(treeNode);
            } else {
                add(root.getRight(), treeNode);
            }
        }
    }

    public String search(String data) {
        return search(root, data);
    }

    private String search(TreeNode root, String data) {
        if (root == null) {
            return null;
        }
        int val = data.compareTo(root.getData());

        if (val == 0) {
            return root.getData();
        } else if (val < 0) {
            return search(root.getLeft(), data);
        } else if (val > 0) {
            return search(root.getRight(), data);
        }
        return null;
    }

    public void traverse(Traversal t) {
        traverse(INORDER, t);
    }

    public void traverse(int norder, Traversal t) {
        traverse(root, norder, t);
    }

    private void traverse(TreeNode root, int norder, Traversal t) {
        TreeNode tmp;

        if (norder == PREORDER) {
            t.process(root.getData());
        }
        if ((tmp = root.getLeft()) != null) {
            traverse(tmp, norder, t);
        }
        if (norder == INORDER) {
            t.process(root.getData());
        }
        if ((tmp = root.getRight()) != null) {
            traverse(tmp, norder, t);
        }
    }

    @Override
    public String toString() {
        return "HashTree{" +
                "root=" + root.toString() +
                '}';
    }
}
