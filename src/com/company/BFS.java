package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by volodyko on 13.02.17.
 */
public class BFS {

    List<Vertex> vertexList;
    List<Edge> edges;
    Queue<Vertex> vertexQueue;

    public BFS() {
        vertexQueue = new LinkedList<>();
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

    public void bfs() {
        Vertex root = vertexList.get(0);
        root.visited = true;
        displayVertex(root);
        vertexQueue.add(root);
        Vertex unvisitedVertex;
        while (!vertexQueue.isEmpty()) {
            Vertex tempVertex = vertexQueue.remove();
            while ((unvisitedVertex = getAdjUnvisitedVertex(tempVertex)) != null) {
                unvisitedVertex.visited = true;
                displayVertex(unvisitedVertex);
                vertexQueue.add(unvisitedVertex);
            }
        }

        for (int i = 0; i < vertexList.size(); i++) {
            vertexList.get(i).visited = false;
        }
    }

    static class Vertex {
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
