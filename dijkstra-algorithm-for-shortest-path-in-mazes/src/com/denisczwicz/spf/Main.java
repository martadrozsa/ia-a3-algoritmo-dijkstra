package com.denisczwicz.spf;

import com.denisczwicz.spf.entities.Edge;
import com.denisczwicz.spf.entities.MazeReader;
import com.denisczwicz.spf.entities.Node;

public class Main {

    public static void main(String[] args) {

//        Node nodeA = new Node("A");
//        Node nodeB = new Node("B");
//        Node nodeC = new Node("C");
//
//        Edge edgeA_B = new Edge(10, nodeB);
//        nodeA.addEdge(edgeA_B);
//        Edge edgeA_C = new Edge(15, nodeC);
//        nodeA.addEdge(edgeA_C);

        MazeReader mazeReader = new MazeReader();

        System.out.println(mazeReader.readFromFile("maze.csv"));
        System.out.println(mazeReader.createListNodes());

    }

//    public static void print(String idPrev, Node node) {
//        System.out.println(idPrev + " -> " + node.getId());
//
//        for (Edge edge : node.getEdges()) {
//            print(node.getId(), edge.getNode());
//        }
//
//    }
}


// passar de novo no mazeData e aí eu vou fazer a ligação entre os nó