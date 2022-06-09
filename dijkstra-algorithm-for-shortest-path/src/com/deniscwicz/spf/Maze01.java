package com.deniscwicz.spf;

import com.deniscwicz.spf.entities.Edge;
import com.deniscwicz.spf.entities.Node;

public class Maze01 {

    private Node startNode;
    private Node endNode;

    public Node getStartNode() {
        return startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public void createGraph() {
        int baseWeight = 1;

        Node node1_0 = new Node("1,0");
        Node node1_1 = new Node("1,1");
        Node node1_2 = new Node("1,2");
        Node node1_3 = new Node("1,3");
        Node node1_5 = new Node("1,5");

        Node node2_1 = new Node("2,1");
        Node node2_3 = new Node("2,3");
        Node node2_5 = new Node("2,5");

        Node node3_1 = new Node("3,1");
        Node node3_3 = new Node("3,3");
        Node node3_4 = new Node("3,4");
        Node node3_5 = new Node("3,5");

        Node node4_1 = new Node("4,1");
        Node node4_5 = new Node("4,5");

        Node node5_1 = new Node("5,1");
        Node node5_2 = new Node("5,2");
        Node node5_3 = new Node("5,3");
        Node node5_4 = new Node("5,4");
        Node node5_5 = new Node("5,5");

        Node node6_3 = new Node("6,3");

        linkNodeTo(node1_0, baseWeight, node1_1);
        linkNodeTo(node1_1, baseWeight, node1_0, node1_2, node2_1);
        linkNodeTo(node1_2, baseWeight, node1_1, node1_3);
        linkNodeTo(node1_3, baseWeight, node1_2, node2_3);
        linkNodeTo(node1_5, baseWeight, node2_5);

        linkNodeTo(node2_1, baseWeight, node1_1, node3_1);
        linkNodeTo(node2_3, baseWeight, node1_3, node3_3);
        linkNodeTo(node2_5, baseWeight, node1_5, node3_5);

        linkNodeTo(node3_1, baseWeight, node2_1, node4_1);
        linkNodeTo(node3_3, baseWeight, node2_3, node3_4);
        linkNodeTo(node3_4, baseWeight, node3_3, node3_5);
        linkNodeTo(node3_5, baseWeight, node2_5, node3_4, node4_5);

        linkNodeTo(node4_1, baseWeight, node3_1, node5_1);
        linkNodeTo(node4_5, baseWeight, node3_5, node5_5);

        linkNodeTo(node5_1, baseWeight, node4_1, node5_2);
        linkNodeTo(node5_2, baseWeight, node5_1, node5_3);
        linkNodeTo(node5_3, baseWeight, node5_2, node5_4, node6_3);
        linkNodeTo(node5_4, baseWeight, node5_3, node5_5);
        linkNodeTo(node5_5, baseWeight, node4_5, node5_4);

        linkNodeTo(node6_3, baseWeight, node5_3);

        startNode =  node1_0;
        endNode = node6_3;
    }

    public void linkNodeTo(Node origin, int weight, Node ...neighbors) {
        for (Node target : neighbors) {
            Edge edge = new Edge(weight, target);
            origin.addEdge(edge);
        }
    }
}
