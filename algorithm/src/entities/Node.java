package entities;

import java.util.ArrayList;
import java.util.List;

public class Node {

    final private int id;
    List<Edge> edges;

    private int distTotal;
    private Node prevNode;

    public Node(int id) {
        this.id = id;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    public int getId() {
        return id;
    }

    public List<Edge> getEdges() {
        return edges;
    }
}
