package com.deniscwicz.spf.entities;

import java.util.ArrayList;
import java.util.List;

public class Node {

    final private String id;
    List<Edge> edges;

    private int distance = Integer.MAX_VALUE;

    private Node prevNode;

    public Node(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Node{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;

        return getId().equals(node.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
