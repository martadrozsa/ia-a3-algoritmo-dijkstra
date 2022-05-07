import entities.Edge;
import entities.Node;

public class main {

    public static void main(String[] args) {

        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        Edge edge0_1 = new Edge(2, node1);
        node0.addEdge(edge0_1);

        Edge edge0_2 = new Edge(6, node2);
        node0.addEdge(edge0_2);

        Edge edge1_3 = new Edge(5, node3);
        node1.addEdge(edge1_3);

        Edge edge2_3 = new Edge(8, node3);
        node2.addEdge(edge2_3);

        Edge edge3_4 = new Edge(10, node4);
        node3.addEdge(edge3_4);

        Edge edge3_5 = new Edge(15, node5);
        node3.addEdge(edge3_5);

        Edge edge4_5 = new Edge(6, node5);
        node4.addEdge(edge4_5);

        Edge edge4_6 = new Edge(2, node6);
        node4.addEdge(edge4_6);

//        Edge edge5_4 = new Edge(6, node4);
//        node5.addEdge(edge5_4);

        Edge edge5_6 = new Edge(6, node6);
        node5.addEdge(edge5_6);

        print(-1, node0);

    }



    public static void print(int idPrev, Node node) {
        System.out.println(idPrev + " -> " + node.getId());

        for (Edge edge : node.getEdges()) {
            print(node.getId(), edge.getNode());
        }

    }
}
