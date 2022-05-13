package com.deniscwicz.spf;

import com.deniscwicz.spf.entities.Edge;
import com.deniscwicz.spf.entities.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ShortestPathFinder {
    public static Node find(Node source, Node target) {
        // Set distance to startNode to zero.
        source.setDistance(0);
        // Set all other distances to an infinite value.
        // as distancias já são infinitas por design (Integer.MAX_VALUE)

        // nós ainda em avaliação. Ordena em ordem crescente (do menor para o maior).
        TreeSet<Node> listaAberta = new TreeSet<>((n1, n2) -> n1.getDistance() - n2.getDistance());
        // nós que já foi definido o menor caminho.
        List<Node> listaFechada = new ArrayList<>();

        // We add the startNode to the unsettled nodes set.
        listaAberta.add(source);

        // While the unsettled nodes set is not empty we
        do {
            // Choose an evaluation node from the unsettled nodes set, the evaluation
            // node should be the one with the lowest distance from the source.
            Node currNode = listaAberta.pollFirst();

            if (currNode.getId().equals(target.getId())) {
                System.out.println("Destino alcançado!");
                return currNode;
            }

            for (Edge edge : currNode.getEdges()) {
                Node neighborNode = edge.getNode();
                if (listaFechada.contains(neighborNode)) {
                    System.out.println("Neighbor Node " + neighborNode.getId() + " já está na lista fechada.");
                    continue;
                }

                // Soma a distância total até o nodo current com a distância para o nodo em teste.
                int pathDistance = currNode.getDistance() + edge.getDistance();

                // condição
                if (pathDistance < neighborNode.getDistance()) {
                    neighborNode.setDistance(pathDistance);
                    neighborNode.setPrevNode(currNode);
                }

                // A própria estrutura de dados (TreeSet) evita que duplicados sejam adicionados
                listaAberta.removeIf(n -> n.getId().equals(neighborNode.getId()));
                listaAberta.add(neighborNode);
            }

            listaFechada.add(currNode);

        } while (!listaAberta.isEmpty());

        System.out.println("Nodo alvo nao foi encontrado!");

        return null;
    }
}
