package com.company.algorithm;

/**
 * Created by volodyko on 07.12.16.
 */
public class QuickUnion {

    private int[] id;

    public QuickUnion(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public static void main(String[] args) {
        QuickUnion quickUnion = new QuickUnion(9);
        quickUnion.union(3, 2);
        quickUnion.union(0, 2);
        quickUnion.union(8, 7);
        System.out.println(quickUnion.connected(3, 0));
        System.out.println(quickUnion.connected(8, 0));
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        id[i] = j;
    }
}
