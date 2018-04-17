import java.util.ArrayList;
import java.util.List;

public class Graph {

    private int numberOfVertex;
    private List<Edge> edgeList;

    public Graph(int nodes, List<Edge> edgeList) {
        this.edgeList = edgeList;
        this.numberOfVertex = nodes;
    }

    public int getNumberOfVertex() {
        return numberOfVertex;
    }

    public List<Edge> getEdgeList() {
        return new ArrayList<>(edgeList);
    }

    public static boolean isConnected(Graph g) {
        boolean[] visitedVertex = new boolean[g.numberOfVertex];

        for (int i = 0; i < visitedVertex.length; i++)
            visitedVertex[i] = false;

        advanceInDepth(g, 0, visitedVertex);

        for (boolean currentVertex : visitedVertex)
            if (!currentVertex)
                return false;
        return true;
    }

    private static void advanceInDepth(Graph g, int v, boolean[] visitedVertex) {
        visitedVertex[v] = true;
        for (int i = 0; i < g.numberOfVertex; i++)
            if ((v != i) && (!visitedVertex[i] && (g.isConnected(i+1, v+1))))
                advanceInDepth(g, i, visitedVertex);
    }

    public boolean isConnected(int u, int v) {
        return edgeList.contains(new Edge(u, v));
    }

}

