package com.deniscwicz.spf;

import com.deniscwicz.spf.entities.Edge;
import com.deniscwicz.spf.entities.Node;

public class SampleGraph {

    private Node startNode;
    private Node endNode;

    public Node getStartNode() {
        return startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public void createGraph() {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        Edge edgeA_B = new Edge(10, nodeB);
        nodeA.addEdge(edgeA_B);
        Edge edgeA_C = new Edge(15, nodeC);
        nodeA.addEdge(edgeA_C);

        Edge edgeB_D = new Edge(12, nodeD);
        nodeB.addEdge(edgeB_D);
        Edge edgeB_F = new Edge(15, nodeF);
        nodeB.addEdge(edgeB_F);

        Edge edgeC_E = new Edge(10, nodeE);
        nodeC.addEdge(edgeC_E);

        Edge edgeD_E = new Edge(2, nodeE);
        nodeD.addEdge(edgeD_E);
        Edge edgeD_F = new Edge(1, nodeF);
        nodeD.addEdge(edgeD_F);

        Edge edgeF_E = new Edge(5, nodeE);
        nodeF.addEdge(edgeF_E);

        startNode  = nodeA;
        endNode = nodeF;
    }
}
