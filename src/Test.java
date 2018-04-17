import java.util.List;

public class Test {

    public static void testGraph(Graph g, int opt) {
        if (Graph.isConnected(g)) {
            for (int i = 0; i < 100; i++) {
                List<Integer> vertexCoverage = VertexCoverage.VertexCoverage(g);
                if (VertexCoverage.isCoverage(vertexCoverage, g.getEdgeList())) {
                    if (!(vertexCoverage.size() <= 2 * opt)) {
                        System.out.println("Vertex coverage is not at most double of minimum vertex");
                        break;
                    }
                } else {
                    System.out.println("The graph not forms a coverage");
                }

            }
        } else
            System.out.println("The graph is not connected.");
        System.out.println("-----------------------------------------------------------------------------");
    }

}
