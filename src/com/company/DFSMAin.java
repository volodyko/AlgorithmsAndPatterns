package com.company;

/**
 * Created by volodyko on 13.02.17.
 */
public class DFSMAin {

    public static void main(String[] args) {
        DFS dfs = new DFS();
        dfs.addVertex("A");
        dfs.addVertex("B");
        dfs.addVertex("C");
        dfs.addVertex("D");
        dfs.addVertex("E");

        dfs.addEdege(dfs.getVertex("A"), dfs.getVertex("B"));
        dfs.addEdege(dfs.getVertex("B"), dfs.getVertex("C"));
        dfs.addEdege(dfs.getVertex("A"), dfs.getVertex("D"));
        dfs.addEdege(dfs.getVertex("D"), dfs.getVertex("E"));

        dfs.dfs();
    }
}
