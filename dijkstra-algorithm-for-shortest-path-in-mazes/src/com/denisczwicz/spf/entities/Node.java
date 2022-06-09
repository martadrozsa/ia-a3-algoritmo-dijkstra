package com.denisczwicz.spf.entities;

import java.util.ArrayList;
import java.util.List;
public class Node {
    final private String id;

    private int i; // linha
    private int j; // coluna -> elemento da linha
    private int weight; // peso para passar o caminho
    List<Edge> edges;

    private int distance = Integer.MAX_VALUE;
    private Node prevNode;

    public Node(String id, int i, int j, int weight) {
        this.id = id;
        this.i = i;
        this.j = j;
        this.weight = weight;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    public String getId() {
        return id;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id='" + id + '\'' +
                '}';
    }
}
