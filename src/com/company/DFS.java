package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by volodyko on 13.02.17.
 */
public class DFS {
    Stack<Vertex> visitedStack;
    List<Vertex> vertexList;
    List<Edge> edges;

    public DFS() {
        visitedStack = new Stack<>();
        vertexList = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public Vertex getVertex(String label) {
        for (int i = 0; i < vertexList.size(); i++) {
            if (vertexList.get(i).label.equals(label)) {
                return vertexList.get(i);
            }
        }
        return null;
    }

    public void addVertex(String lable) {
        vertexList.add(new Vertex(lable));
    }

    public void addEdege(Vertex start, Vertex end) {
        edges.add(new Edge(start, end));
    }

    public void displayVertex(Vertex vertexIndex) {
        System.out.println(vertexIndex.label);
    }

    Vertex getAdjUnvisitedVertex(Vertex temp) {
        Vertex v = null;
        for (int i = 0; i < edges.size(); i++) {
            Edge currentEdge = edges.get(i);
            if (currentEdge.left == temp && !currentEdge.right.visited) {
                v = currentEdge.right;
                break;
            }
            if (currentEdge.right == temp && !currentEdge.left.visited) {
                v = currentEdge.left;
                break;
            }
        }
        return v;
    }

    public void dfs() {
        Vertex root = vertexList.get(0);
        root.visited = true;
        displayVertex(root);
        visitedStack.push(root);

        while (!visitedStack.isEmpty()) {
            Vertex unvistedVertex = getAdjUnvisitedVertex(visitedStack.peek());
            if (unvistedVertex == null) {
                visitedStack.pop();
            } else {
                unvistedVertex.visited = true;
                displayVertex(unvistedVertex);
                visitedStack.push(unvistedVertex);
            }
        }

        for (int i = 0; i < vertexList.size(); i++) {
            vertexList.get(i).visited = false;
        }
    }

    class Vertex {
        String label;
        boolean visited;

        public Vertex(String label) {
            this.label = label;
            visited = false;
        }
    }

    class Edge {
        Vertex left;
        Vertex right;

        public Edge(Vertex left, Vertex right) {
            this.left = left;
            this.right = right;
        }
    }

}
