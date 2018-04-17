import java.util.ArrayList;
import java.util.List;

public class VertexCoverage {

    public static List<Integer> VertexCoverage(Graph g) {
        List<Integer> vertexCoverage = new ArrayList<>();
        List<Edge> edgedList = g.getEdgeList();

        while (edgedList.size() != 0) {
            Edge edge = edgedList.get((int) Math.floor(Math.random()*edgedList.size()));
            int node1 = edge.getNode1();
            int node2 = edge.getNode2();
            List<Edge> auxEdgeList = findEdges(edgedList, node1, node2);
            vertexCoverage.add(node1);
            vertexCoverage.add(node2);
            edgedList.removeAll(auxEdgeList);
        }
        return vertexCoverage;
    }

    private static List<Edge> findEdges(List<Edge> edgedList, int node1, int node2) {
        List<Edge> result = new ArrayList<>();
        for (Edge e:edgedList) {
            if (e.getNode1() == node1 || e.getNode1() == node2 || e.getNode2() == node1 || e.getNode2() == node2) {
                result.add(e);
            }
        }
        return result;
    }

    public static boolean isCoverage(List<Integer> vertexCoverage, List<Edge> edgeList) {
        for (Edge e : edgeList) {
            if (!vertexCoverage.contains(e.getNode1()) && !vertexCoverage.contains(e.getNode2()))
                return false;
        }
        return true;
    }

}
