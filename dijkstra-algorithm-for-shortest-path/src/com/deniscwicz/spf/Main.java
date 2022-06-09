package com.deniscwicz.spf;

import com.deniscwicz.spf.entities.Edge;
import com.deniscwicz.spf.entities.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Maze01 graph =  new Maze01();
        graph.createGraph();

        Node dest = ShortestPathFinder.find(graph.getStartNode(), graph.getEndNode());
        List<String> solution = getSolution(dest);
        System.out.println("Solução do labirinto 1:");
        printSolution(solution);

        Maze02 graph2 =  new Maze02();
        graph2.createGraph();

        Node dest2 = ShortestPathFinder.find(graph2.getStartNode(), graph2.getEndNode());
        List<String> solution2 = getSolution(dest2);
        System.out.println("Solução do labirinto 2:");
        printSolution(solution2);
    }

    public static void printSolution(List<String> solution) {
        for (int i = 0; i < solution.size(); i++) {
            String curr = solution.get(i);
            System.out.print(curr);
            if (i+1 < solution.size()) {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }

    public static List<String> getSolution(Node resultNode) {
        if (resultNode == null) {
            return List.of();
        }

        List<String> solution = new ArrayList<>();
        do {
            solution.add(resultNode.getId());
            resultNode = resultNode.getPrevNode();
        } while (resultNode != null);

        Collections.reverse(solution);
        return solution;
    }

    public static void printGraph(String idPrev, Node node) {
        System.out.println(idPrev + " -> " + node.getId());

        for (Edge edge : node.getEdges()) {
            printGraph(node.getId(), edge.getNode());
        }

    }
}
