import java.util.List;

public class Test {

    public static void testGraph(Graph g, int opt) {
        System.out.println(g.getName());
        if (Graph.isConnected(g)) {
            for (int i = 0; i < 1000; i++) {
                List<Integer> vertexCoverage = VertexCoverage.VertexCoverage(g);
                if (VertexCoverage.isCoverage(vertexCoverage, g.getEdgeList())) {
                    if (!(vertexCoverage.size() <= 2 * opt)) {
                        System.out.println("Vertex coverage exceeds twice the minimum coverage");
                        break;
                    }
                } else {
                    System.out.println("The vertex coverage is not valid");
                    break;
                }

            }
        } else
            System.out.println("The graph is not connected.");
        System.out.println("-----------------------------------------------------------------------------");
    }

}
