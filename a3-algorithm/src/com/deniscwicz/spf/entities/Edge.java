package com.deniscwicz.spf.entities;

public class Edge {

    private int distance;
    private Node node;

    public Edge(int distance, Node node) {
        this.distance = distance;
        this.node = node;
    }

    public Node getNode() {
        return node;
    }

    public int getDistance() {
        return distance;
    }
}
